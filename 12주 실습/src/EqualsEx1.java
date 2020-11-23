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
Rect, EqualsEx1

--------�Լ���--------
Rect(), equals(), main(), println()

-------����(����)------
 Rect Ŭ������ equals() ����� ����

--------������-------
���ǿ� ���� ���� �ٸ��� ���

*******************/

class Rect {  // Rect Ŭ����
	private int width;  // private�� ������� ����
	private int height;  // private�� ������� ����
	public Rect(int width, int height) {  // Rect() �Լ�
		this.width = width;  // �ʱ�ȭ
		this.height = height;  // �ʱ�ȭ
	}
	public boolean equals(Object obj) {  // equals() �Լ�
		Rect p = (Rect)obj;
		if (width * height == p.width * p.height)
			return true;  // true �� ��ȯ
		else
			return false;  // false �� ��ȯ
	}
}

public class EqualsEx1 {  // EqualsEx1 Ŭ����
	public static void main(String[] args) {  // main() �Լ�
		Rect a = new Rect(2,3);  // Rect ������ ���� a, Rect Ŭ������ ��ü ����
		Rect b = new Rect(3,2);  // Rect ������ ���� b, Rect Ŭ������ ��ü ����
		Rect c = new Rect(3,4);  // Rect ������ ���� c, Rect Ŭ������ ��ü ����
		
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))
			System.out.println("b is equal to c");
	}
}