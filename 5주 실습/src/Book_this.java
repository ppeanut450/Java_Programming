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
show(), main(), loveStory.show()

-------����(����)------
this()�� �ٸ� ������ ȣ��
: Book Ŭ������ �����ڸ� this()�� �̿��� ����

--------������-------
���� Book Ŭ������ �޸� �ʵ带 �ʱ�ȭ���� �ʾұ� ������ ���� �ٸ� ������� ����

*******************/

public class Book_this {  // Book_this Ŭ����
	String title;  // String Ÿ���� �ʵ�
	String author;  // String Ÿ���� �ʵ�
	void show() { System.out.println(title + " " + author); }
	
	public Book_this() {  // �Ű� ���� ���� ������
		this("", "");  // �������� �ʱ�ȭ
		System.out.println("������ ȣ���");
	}
	
	public Book_this(String title) {  // �Ű� ����(1��)�� ���� ������
		this(title, "���ڹ̻�");
	}
	
	public Book_this(String title, String author) {  // �Ű� ����(2��)�� ���� ������
		this.title = title; this.author = author;
	}
	
	public static void main(String[] args) {  // main() �Լ�
		Book_this littlePrince = new Book_this("�����", "�������丮");  // ������ Book(String title, String author) ȣ��  (title: �����, author: �������丮)
		Book_this loveStory = new Book_this("������");  // ������ Book(String title) ȣ��  (title: ������, author: ���ڹ̻�)
		Book_this emptyBook = new Book_this();  // ������ Book() ȣ��  (title: , author: )(�������� �ʱ�ȭ) => "������ ȣ���"
		loveStory.show();  // loveStory�� ���
	}
}