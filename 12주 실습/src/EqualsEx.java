/*******************
-----���α׷��ۼ���------
2020.11.20
   
------���α׷� �ۼ���-----
20193012 ������

-------���α׷���-------
12�� �ǽ� ���� 

----���α׷��� ����ȯ��----
Window 10 Home (���� 1903)
OS ����: 18362.1082
CPU: Intel(R) Core(TM) i5-8250U
RAM: 8.00GB
System: 64��Ʈ �ü��, x64 ��� ���μ���
Graphic: Intel(R) UHD Graphics 620
Eclipse Version: 2020-06 (4.16.0)
Eclipse Build id: 20200615-1200
JavaSE-14
jdk-14.0.2

----���α׷��� �����丮----
ver 1.0 ���α׷� �ڵ� �ۼ�
ver 2.0 ���α׷� �ּ� �ۼ�
ver 3.0 �Լ�, Ŭ���� �ּ� �ۼ�
ver 4.0 ���� �ּ� �ۼ�

------���α׷� ����------
Java ���� ���� �� ���� �����

--------Ŭ������-------
Point, EqualsEx

--------�Լ���--------
Point(), equals(), main(), println()

-------����(����)------
Point Ŭ������ �� ���� ��ǥ�� ������ true�� �����ϴ� equals()�� �ۼ�

--------������-------
���ǿ� ���� ���� �ٸ��� ���

*******************/

class Point {  // Point Ŭ����
	private int x, y;
	public Point(int x, int y) {  // �Ű� ������ ���� ������
		this.x = x;  // �ʱ�ȭ
		this.y = y;  // �ʱ�ȭ
	}
	public boolean equals(Object obj) {  // equals() �Լ�
		Point p = (Point)obj;
		if(x == p.x && y == p.y)  // x�� p.x�� ���� y�� p.y�� ������
			return true;  // true �� ��ȯ
		else 
			return false;  // false �� ��ȯ
	}
}

public class EqualsEx {  // EqualsEx Ŭ����
	public static void main(String[] args) {
		Point a = new Point(2,3);  // Point ������ ���� a, Point Ŭ������ ��ü ����
		Point b = new Point(2,3);  // Point ������ ���� b, Point Ŭ������ ��ü ����
		Point c = new Point(3,4);  // Point ������ ���� c, Point Ŭ������ ��ü ����
		
		if(a == b) // false
			System.out.println("a==b");
		if(a.equals(b)) // true
			System.out.println("a is equal to b");
		if(a.equals(c)) // false
			System.out.println("a is equal to c");
	}
}
