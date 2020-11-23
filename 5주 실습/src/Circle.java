/*******************
-----프로그램작성일------
2020.10.08
   
------프로그램 작성자-----
20193012 박은서

-------프로그램명-------
5주 실습 예제 

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
Circle

--------함수명--------
getArea(), main(), pizza.getArea(), donut.getArea()

-------개요(목적)------
두 개의 생성자를 가진 Circle 클래스 생성

--------실행결과-------
실수(314.0, 3.14)

*******************/

public class Circle {  // Circle 클래스
	int radius;  // int 타입의 필드
	String name;  // String 타입의 필드
	
	public Circle() {  // 매개 변수 없는 생성자
		radius = 1; name = "";  // radius의 초기값은 1, name은 공백으로 초기화
	}
	
	public Circle(int r, String n) {  // 매개 변수를 가진 생성자
		radius = r; name = n;  // radius은 r의 값, name은 n의 값
	}
	
	public double getArea() {  // getArea() 함수
		return 3.14 * radius * radius;  // 3.14 * 반지름 * 반지름
	}
	
	public static void main(String[] args) {  // main() 함수
		Circle pizza = new Circle(10, "자바피자");  // Circle 객체 생성, 반지름: 10, 이름: 자바피자
		
		double area = pizza.getArea();  // area = 3.14 * 10 * 10
		System.out.println(pizza.name + "의 면적은 " + area);  
		
		Circle donut = new Circle();  // Circle 객체 생성, 반지름: 1
		donut.name = "도넛피자";  // 이름: 도넛피자
		area = donut.getArea();  // area = 3.14 * 1 * 1
		System.out.println(donut.name + "의 면적은 " + area);
	}
}