/*******************
-----���α׷��ۼ���------
2020.10.08
   
------���α׷� �ۼ���-----
20193012 ������

-------���α׷���-------
5�� �ǽ� ���� 

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
Circle

--------�Լ���--------
getArea(), main(), pizza.getArea(), donut.getArea()

-------����(����)------
�� ���� �����ڸ� ���� Circle Ŭ���� ����

--------������-------
�Ǽ�(314.0, 3.14)

*******************/

public class Circle {  // Circle Ŭ����
	int radius;  // int Ÿ���� �ʵ�
	String name;  // String Ÿ���� �ʵ�
	
	public Circle() {  // �Ű� ���� ���� ������
		radius = 1; name = "";  // radius�� �ʱⰪ�� 1, name�� �������� �ʱ�ȭ
	}
	
	public Circle(int r, String n) {  // �Ű� ������ ���� ������
		radius = r; name = n;  // radius�� r�� ��, name�� n�� ��
	}
	
	public double getArea() {  // getArea() �Լ�
		return 3.14 * radius * radius;  // 3.14 * ������ * ������
	}
	
	public static void main(String[] args) {  // main() �Լ�
		Circle pizza = new Circle(10, "�ڹ�����");  // Circle ��ü ����, ������: 10, �̸�: �ڹ�����
		
		double area = pizza.getArea();  // area = 3.14 * 10 * 10
		System.out.println(pizza.name + "�� ������ " + area);  
		
		Circle donut = new Circle();  // Circle ��ü ����, ������: 1
		donut.name = "��������";  // �̸�: ��������
		area = donut.getArea();  // area = 3.14 * 1 * 1
		System.out.println(donut.name + "�� ������ " + area);
	}
}