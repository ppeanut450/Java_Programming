/*******************
-----���α׷��ۼ���------
2020.10.07
   
------���α׷� �ۼ���-----
20193012 ������

-------���α׷���-------
5�� �̷� ���� 

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
Circle Ŭ������ ��ü ���� �� Ȱ��
: �������� �̸��� ���� Circle Ŭ���� �ۼ��ϰ� Circle Ŭ������ ��ü�� ����

--------������-------
�Ǽ� (314.0, 12.56)

*******************/

public class Circle {  // Circle Ŭ����
	int radius;  // ���� ������ �ʵ�
	String name;  // ���� �̸� �ʵ�
	
	public Circle() {}  // ���� ������
	
	public double getArea() // ���� ���� ��� �޼ҵ�
	{
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {  // main() �Լ�
		Circle pizza;  
		pizza = new Circle();  // Circle ��ü ����
		pizza.radius = 10;  // ������ �������� 10���� ����
		pizza.name = "�ڹ�����";  // ������ �̸� ����
		double area = pizza.getArea();  // ������ ���� �˾Ƴ���
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle();  // Circle ��ü ����
		donut.radius = 2;  // ������ �������� 2�� ����
		donut.name = "�ڹٵ���";  // ������ �̸� ����
		area = donut.getArea();  // ������ ���� �˾Ƴ���
		System.out.println(donut.name + "�� ������ " + area);
	}
}