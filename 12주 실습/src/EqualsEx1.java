/*******************
-----프로그램작성일------
2020.11.20
   
------프로그램 작성자-----
20193012 박은서

-------프로그램명-------
12주 실습 예제 

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
Rect, EqualsEx1

--------함수명--------
Rect(), equals(), main(), println()

-------개요(목적)------
 Rect 클래스와 equals() 만들기 연습

--------실행결과-------
조건에 따라 값이 다르게 출력

*******************/

class Rect {  // Rect 클래스
	private int width;  // private로 멤버변수 선언
	private int height;  // private로 멤버변수 선언
	public Rect(int width, int height) {  // Rect() 함수
		this.width = width;  // 초기화
		this.height = height;  // 초기화
	}
	public boolean equals(Object obj) {  // equals() 함수
		Rect p = (Rect)obj;
		if (width * height == p.width * p.height)
			return true;  // true 값 반환
		else
			return false;  // false 값 반환
	}
}

public class EqualsEx1 {  // EqualsEx1 클래스
	public static void main(String[] args) {  // main() 함수
		Rect a = new Rect(2,3);  // Rect 형태의 변수 a, Rect 클래스의 객체 생성
		Rect b = new Rect(3,2);  // Rect 형태의 변수 b, Rect 클래스의 객체 생성
		Rect c = new Rect(3,4);  // Rect 형태의 변수 c, Rect 클래스의 객체 생성
		
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))
			System.out.println("b is equal to c");
	}
}