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
InputMismatchException, Scanner, InputException
        
--------�Լ���--------
main(), Scanner(), nextInt(), next(), close()

-------����(����)------
�Է� ������ �߻��ϴ� ����

--------������-------
���������� �Էµ��� ��: �� ���
���������� �Էµ��� �ʾ��� ��: catch ��� �޼��� ���
		
*******************/

import java.util.Scanner;  // Scanner Ŭ����
import java.util.InputMismatchException;  // InputMismatchException Ŭ����

public class InputException {  // InputException Ŭ����
	public static void main(String[] args) {  // main() �Լ�
		Scanner scanner = new Scanner(System.in);  // Scanner ������ ���� scanner, new Scanner(System.in): Scanner Ŭ������ ��ü ����
		System.out.println("���� 3���� �Է��ϼ���");
		int sum=0, n=0;  // ���� ������ ���� sum, ���� �Է��� ���� n
		for (int i=0; i<3; i++)  // �ݺ������� ���Ǵ� ���� i, i�� 0���� 3���� ���� ������ �ݺ�
		{
			System.out.print(i+">>");
			try  // ���ܰ� �߻��� ���ɼ��� �ִ� ���๮
			{
				n = scanner.nextInt();  // ���� �Է�
			}
			catch(InputMismatchException e)  // Scanner Ŭ������ nextInt()�� ȣ���Ͽ� ������ �Է¹ް��� �Ͽ�����, ����ڰ� 'a' ��� ���� ���ڸ� �Է��� ���
			{
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");  // ���ܰ� �߻����� �� 
				scanner.next();  // �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
				i--;  // �ε����� �������� �ʵ��� �̸� ����
				continue;  // ���� ����
			}
			sum += n;  // ���ϱ�
		}  // finally ��� ����
		System.out.println("���� " + sum);  // ���ܰ� �߻����� �ʾ��� ��
		scanner.close();  // scanner ��� ����
	}
}