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
NumException

--------�Լ���--------
main(), parseInt()

-------����(����)------
������ �ƴ� ���ڿ��� ������ ��ȯ�� �� ���� �߻�

--------������-------
������ ��: �� ���
������ �ƴ� ��: catch ��� �޼��� ���

*******************/

public class NumException {  // NumException Ŭ����
	public static void main(String[] args) {  // main() �Լ�
		String[] stringNumber = {"23", "12", "3.141592", "998"};  // String�� �迭 ���� + �ʱ�ȭ
		
		int i = 0;  // �ݺ������� ���Ǵ� ���� i
		try  // ���ܰ� �߻��� ���ɼ��� �ִ� ���๮
		{
			for(i=0; i<stringNumber.length; i++)  // i�� 0���� stringNumber�� ��ü ���� ���̱��� �ݺ�
			{
				int j = Integer.parseInt(stringNumber[i]);  // ���ڿ��� ���������� ��ȯ
				System.out.println("���ڷ� ��ȯ�� ���� " + j);  // ������ �ԷµǾ��� ��
			}
		}
		catch (NumberFormatException e)  // ó���� ���� Ÿ��: ���ڿ��� ��Ÿ���� ���ڿ� ��ġ���� �ʴ� Ÿ���� ���ڷ� ��ȯ �� �߻�
		{
			System.out.println(stringNumber[i] + "�� ������ ��ȯ�� �� �����ϴ�.");  // ������ �ƴ� �ٸ� ���� �ԷµǾ��� ��
		}
	}  // finally ��� ����
}