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
Book

--------�Լ���--------
main()

-------����(����)------
������ ���� �� Ȱ�� ����
: ����� ���ڸ� ��Ÿ���� title�� author �ʵ带 ���� Book Ŭ���� �ۼ�, �����ڸ� �ۼ��Ͽ� �ʵ� �ʱ�ȭ

--------������-------
����ϰ��� �ϴ� ��(����)�� ������� ���

*******************/

public class Book {  // Book Ŭ����
	String title;  // String Ÿ���� �ʵ�
	String author;  // String Ÿ���� �ʵ�
	
	public Book(String t) {  // �Ű� ����(1��)�� ���� ������ 
		title = t; author = "���ڹ̻�";  // title�� t�� ��, author�� "���ڹ̻�"
	}
	
	public Book(String t, String a) {  // �Ű� ����(2��)�� ���� ������ 
		title = t; author = a;  // title�� t�� ��, author�� a�� ��
	}
	
	public static void main(String[] args) {  // main() �Լ�
		Book littlePrince = new Book("�����", "�������丮");  // ������ Book(String t, String a) ȣ��  (title: �����, author: �������丮)
		Book loveStory = new Book("������");  // ������ Book(String t) ȣ��  (title: ������, author: ���ڹ̻�)
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}