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
Scanner, Rectangle

--------�Լ���--------
getArea(), main(), Scanner(), scanner.nextInt(), scanner.close()

-------����(����)------
Rectangle Ŭ���� ����� ����
: �ʺ�� ���̸� �Է� �޾� �簢���� ���� ���

--------������-------
�Էµ� ���� ��(������)

*******************/

import java.util.Scanner;  // Scanner Ŭ����, ���� �Է½�ų �� ���

public class Rectangle  // Rectangle Ŭ����
{
	int width;  // �ʺ� �� �Է��� width ����
	int height;  // ���� �� �Է��� height ����
	
	public int getArea()  // getArea() �Լ�
	{
		return width * height;  // �ʺ� * ���� = ����
	}
	
	public static void main(String[] args)  // main() �Լ�
	{
		Rectangle rect = new Rectangle();  // Rectangle ������ ���� rect, Rectangle Ŭ������ ��ü ����
		Scanner scanner = new Scanner(System.in);  // Scanner ������ ���� scanner, new Scanner(System.in): Scanner Ŭ������ ��ü ����
		System.out.print(">> ");
		
		rect.width = scanner.nextInt();  // nextInt �޼ҵ�� �Է� ���� �� rect.width ������ �Էµ� �� ����
		rect.height = scanner.nextInt();  // nextInt �޼ҵ�� �Է� ���� �� rect.height ������ �Էµ� �� ����
		
		System.out.println("�簢���� ������ " + rect.getArea());
		
		scanner.close();  // scanner ��� ����
	}
}