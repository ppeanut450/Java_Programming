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
StringEx

--------�Լ���--------
main(), length(), contains(), concat(), trim(), 
replace(), split(), substring(), charAt(), println()

-------����(����)------
String Ŭ���� �޼ҵ� Ȱ��

--------������-------


*******************/

public class StringEx {  // StringEx Ŭ����
	public static void main(String[] args) {  // main() �Լ�
		String a = new String(" C#");  // String ������ ���� a, String Ŭ������ ��ü ����
		String b = new String(",C++ ");  // String ������ ���� b, String Ŭ������ ��ü ����

		System.out.println(a + "�� ���̴� " + a.length());  // ���ڿ��� ����(���� ����)
		System.out.println(a.contains("#"));  // ���ڿ��� ���� ����

		a = a.concat(b);  // ���ڿ� ����
		System.out.println(a);

		a = a.trim();  //  ���ڿ� �� ���� ���� ����
		System.out.println(a);

		a = a.replace("C#","Java");  // ���ڿ� ��ġ
		System.out.println(a);

		String s[] = a.split(","); // ���ڿ� �и�
		for (int i=0; i<s.length; i++)  // i�� 0���� s.length���� �ݺ�
			System.out.println("�и��� ���ڿ�" + i + ": " + s[i]);

		a = a.substring(5);  // �ε��� 5���� ������ ���� ��Ʈ�� ����
		System.out.println(a);

		char c = a.charAt(2);  // �ε��� 2�� ���� ����
		System.out.println(c);
	}
}
