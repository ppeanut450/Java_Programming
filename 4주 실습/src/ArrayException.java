/*******************
-----���α׷��ۼ���------
2020.09.25
   
------���α׷� �ۼ���-----
20193012 ������

-------���α׷���-------
4�� �ǽ� ���� 

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
ver 1.0 ���α׷� �ּ� �ۼ�
ver 2.0 �Լ�, Ŭ���� �ּ� �ۼ�
ver 3.0 �ڵ� �ۼ�
ver 4.0 ��Ÿ ����
ver 5.0 ���� �ּ� �ۼ�

------���α׷� ����------
Java ���� ���� �� ���� �����

--------Ŭ������-------
ArrayException
        
--------�Լ���--------
main()

-------����(����)------
������ ��� �迭�� ����

--------������-------
������ ����� �ʾ��� ��: �� ���
������ ����� ��: catch ��� �޼��� ���
		
*******************/

public class ArrayException {  // ArrayException Ŭ����
	public static void main(String[] args) {  // main() �Լ�
		int[] intArray = new int[5];  // int ��ü ����
		intArray[0] = 0;  // �迭�� 0���� �ʱ�ȭ
		try  // ���ܰ� �߻��� ���ɼ��� �ִ� ���๮
		{
			for (int i=0; i<5; i++) // �ݺ������� ���Ǵ� ���� i, i�� 0���� 5���� ���� ������ �ݺ�
			{
				intArray[i+1] = i + 1 + intArray[i];
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);  // ���� �ȿ� ���� ��
			}
		}
		catch (ArrayIndexOutOfBoundsException e)  // ó���� ���� Ÿ��: �迭�� ������ ��� ���� �� �߻�
		{
			System.out.println("�迭�� �ε����� ������ ������ϴ�.");  // ������ ����� ��
		}
	}  // finally ��� ����
}