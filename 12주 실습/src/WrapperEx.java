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
WrapperEx

--------�Լ���--------
main(), toLowerCase(), isDigit(), isAlphabetic(), parseInt(), toHexString(), 
toBinaryString(), bitCount(), toString, parseDouble(), parseBoolean(), println()

-------����(����)------
Wrapper Ŭ���� Ȱ��

--------������-------
���ǿ� ���� ���� �ٸ��� ��� + Wrapper�� Ȱ���� ��ȯ �� ���

*******************/

public class WrapperEx {  // WrapperEx Ŭ����
	public static void main(String[] args) {  // main() �Լ�
		System.out.println(Character.toLowerCase('A'));  // 'A'�� �ҹ��ڷ� ��ȯ
		char c1='4', c2='F';
		if(Character.isDigit(c1))  // ���� c1�� �����̸� true
			System.out.println(c1 + "�� ����");
		if(Character.isAlphabetic(c2))  // ���� c2�� �������̸� true
			System.out.println(c2 + "�� ������");
		
		System.out.println(Integer.parseInt("-123"));  // "-123"�� 10������ ��ȯ
		System.out.println(Integer.toHexString(28));  // 28�� 16���� ���ڿ��� ��ȯ
		System.out.println(Integer.toBinaryString(28));  // 28�� 2���� ���ڿ��� ��ȯ
		System.out.println(Integer.bitCount(28));  // 28�� ���� 2������ 1�� ����
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());  // Double 3.14�� ���ڿ� "3.14"�� ��ȯ
		System.out.println(Double.parseDouble("3.14"));  // ���ڿ� "3.14"�� �Ǽ� 3.14�� ��ȯ
		
		boolean b = (4 > 3);  // b�� true
		System.out.println(Boolean.toString(b));  // true�� ���ڿ� "true"�� ��ȯ
		System.out.println(Boolean.parseBoolean("false"));  // ���ڿ� "false"�� false�� ��ȯ
	}
}