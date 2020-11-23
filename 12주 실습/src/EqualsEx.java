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
Point, EqualsEx

--------함수명--------
Point(), equals(), main(), println()

-------개요(목적)------
Point 클래스에 두 점의 좌표가 같으면 true를 리턴하는 equals()를 작성

--------실행결과-------
조건에 따라 값이 다르게 출력

*******************/

class Point {  // Point 클래스
	private int x, y;
	public Point(int x, int y) {  // 매개 변수를 가진 생성자
		this.x = x;  // 초기화
		this.y = y;  // 초기화
	}
	public boolean equals(Object obj) {  // equals() 함수
		Point p = (Point)obj;
		if(x == p.x && y == p.y)  // x와 p.x가 같고 y와 p.y가 같으면
			return true;  // true 값 반환
		else 
			return false;  // false 값 반환
	}
}

public class EqualsEx {  // EqualsEx 클래스
	public static void main(String[] args) {
		Point a = new Point(2,3);  // Point 형태의 변수 a, Point 클래스의 객체 생성
		Point b = new Point(2,3);  // Point 형태의 변수 b, Point 클래스의 객체 생성
		Point c = new Point(3,4);  // Point 형태의 변수 c, Point 클래스의 객체 생성
		
		if(a == b) // false
			System.out.println("a==b");
		if(a.equals(b)) // true
			System.out.println("a is equal to b");
		if(a.equals(c)) // false
			System.out.println("a is equal to c");
	}
}
