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
StringBufferEx

--------�Լ���--------
main(), append(), insert(), replace(), delete(), setLength(), println()

-------����(����)------
StringBuffer Ŭ���� �޼ҵ� Ȱ��

--------������-------
���ڿ� ���

*******************/

public class StringBufferEx {  // StringBufferEx Ŭ����
	public static void main(String[] args) {  // main() �Լ�
		StringBuffer sb = new StringBuffer("This");  // StringBuffer ������ ���� sb, ��ü ����

		sb.append(" is pencil"); // ���ڿ� �����̱�
		System.out.println(sb);

		sb.insert(7, " my"); // "my" ���ڿ� ����
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // "my"�� "your"�� ����
		System.out.println(sb);
		
		sb.delete(8, 13); // "your " ����
		System.out.println(sb);
		
		sb.setLength(4); // ��Ʈ�� ���� �� ���ڿ� ���� ����
		System.out.println(sb);
	}
}