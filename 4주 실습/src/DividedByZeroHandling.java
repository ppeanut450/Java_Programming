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
Scanner, DividedByZeroHandling
        
--------�Լ���--------
nextInt(), main(), close(), Scanner()

-------����(����)------
0���� ���� �� �߻��ϴ� ArithmeticException ���� ó��

--------������-------
0���� ���� ��: catch ��� �޼��� ���
0�� �ƴ� ���� ���� ��: �� ���
		
*******************/

import java.util.Scanner; // Scanner Ŭ����, ���� �Է½�ų �� ���

public class DividedByZeroHandling {  // DividedByZeroHandling Ŭ����
	public static void main(String[] args) {  // main() �Լ�
		Scanner scanner = new Scanner(System.in);  // Scanner ������ ���� scanner, new Scanner(System.in): Scanner Ŭ������ ��ü ����
		
		while(true)  // ���� ���� ��
		{
			System.out.print("�������� �Է��Ͻÿ�: ");
			int dividend = scanner.nextInt();  // nextInt �޼ҵ�� �Է� ���� �� dividend ������ �Էµ� �� ����
			System.out.print("�������� �Է��Ͻÿ�: ");
			int divisor = scanner.nextInt();  // nextInt �޼ҵ�� �Է� ���� �� divisor ������ �Էµ� �� ����
			
			try  // ���ܰ� �߻��� ���ɼ��� �ִ� ���๮
			{
				System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");  // 0�� �ƴ� ���� ���� ��
				break;	// �������� ������ �Ϸ� �� while �����
			}
			
			catch(ArithmeticException e)  // ó���� ���� Ÿ��: ������ 0���� ���� �� �߻�
			{
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���.");  // 0���� ���� ��
			}
		}  // finally ��� ����
		scanner.close();  // scanner ��� ����
	}
}