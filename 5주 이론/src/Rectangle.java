/*******************
-----프로그램작성일------
2020.10.07
   
------프로그램 작성자-----
20193012 박은서

-------프로그램명-------
5주 이론 예제 

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
ver 1.0 프로그램 코드 작성
ver 2.0 프로그램 주석 작성
ver 3.0 함수, 클래스 주석 작성
ver 4.0 라인 주석 작성

------프로그램 개요------
Java 수업 복습 겸 과제 제출용

--------클래스명-------
Scanner, Rectangle

--------함수명--------
getArea(), main(), Scanner(), scanner.nextInt(), scanner.close()

-------개요(목적)------
Rectangle 클래스 만들기 연습
: 너비와 높이를 입력 받아 사각형의 합을 출력

--------실행결과-------
입력된 값의 곱(정수형)

*******************/

import java.util.Scanner;  // Scanner 클래스, 값을 입력시킬 때 사용

public class Rectangle  // Rectangle 클래스
{
	int width;  // 너비 값 입력할 width 변수
	int height;  // 높이 값 입력할 height 변수
	
	public int getArea()  // getArea() 함수
	{
		return width * height;  // 너비 * 높이 = 면적
	}
	
	public static void main(String[] args)  // main() 함수
	{
		Rectangle rect = new Rectangle();  // Rectangle 형태의 변수 rect, Rectangle 클래스의 객체 생성
		Scanner scanner = new Scanner(System.in);  // Scanner 형태의 변수 scanner, new Scanner(System.in): Scanner 클래스의 객체 생성
		System.out.print(">> ");
		
		rect.width = scanner.nextInt();  // nextInt 메소드로 입력 받은 후 rect.width 변수에 입력된 값 대입
		rect.height = scanner.nextInt();  // nextInt 메소드로 입력 받은 후 rect.height 변수에 입력된 값 대입
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		scanner.close();  // scanner 사용 종료
	}
}