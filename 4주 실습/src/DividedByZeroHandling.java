/*******************
-----프로그램작성일------
2020.09.25
   
------프로그램 작성자-----
20193012 박은서

-------프로그램명-------
4주 실습 예제 

----프로그램의 구성환경----
Window 10 Home (버전 1903)
OS 빌드: 18362.1082
CPU: Intel(R) Core(TM) i5-8250U
RAM: 8.00GB
System: 64비트 운영체제, x64 기반 프로세서
Graphic: Intel(R) UHD Graphics 620
Eclipse Version: 2020-06 (4.16.0)
Eclipse Build id: 20200615-1200
JavaSE-14
jdk-14.0.2

----프로그램의 히스토리----
ver 1.0 프로그램 주석 작성
ver 2.0 함수, 클래스 주석 작성
ver 3.0 코드 작성
ver 4.0 오타 수정
ver 5.0 라인 주석 작성

------프로그램 개요------
Java 수업 복습 겸 과제 제출용

--------클래스명-------
Scanner, DividedByZeroHandling
        
--------함수명--------
nextInt(), main(), close(), Scanner()

-------개요(목적)------
0으로 나눌 때 발생하는 ArithmeticException 예외 처리

--------실행결과-------
0으로 나눌 때: catch 블록 메세지 출력
0이 아닌 수로 나눌 때: 값 출력
		
*******************/

import java.util.Scanner; // Scanner 클래스, 값을 입력시킬 때 사용

public class DividedByZeroHandling {  // DividedByZeroHandling 클래스
	public static void main(String[] args) {  // main() 함수
		Scanner scanner = new Scanner(System.in);  // Scanner 형태의 변수 scanner, new Scanner(System.in): Scanner 클래스의 객체 생성
		
		while(true)  // 값이 참일 때
		{
			System.out.print("나뉨수를 입력하시오: ");
			int dividend = scanner.nextInt();  // nextInt 메소드로 입력 받은 후 dividend 변수에 입력된 값 대입
			System.out.print("나눗수를 입력하시오: ");
			int divisor = scanner.nextInt();  // nextInt 메소드로 입력 받은 후 divisor 변수에 입력된 값 대입
			
			try  // 예외가 발생할 가능성이 있는 실행문
			{
				System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");  // 0이 아닌 수로 나눌 때
				break;	// 정상적인 나누기 완료 후 while 벗어나기
			}
			
			catch(ArithmeticException e)  // 처리할 예외 타입: 정수를 0으로 나눌 때 발생
			{
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");  // 0으로 나눌 때
			}
		}  // finally 블록 생략
		scanner.close();  // scanner 사용 종료
	}
}