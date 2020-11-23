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
Circle

--------함수명--------
getArea(), main(), pizza.getArea(), donut.getArea()

-------개요(목적)------
Circle 클래스의 객체 생성 및 활용
: 반지름과 이름을 가진 Circle 클래스 작성하고 Circle 클래스의 객체를 생성

--------실행결과-------
실수 (314.0, 12.56)

*******************/

public class Circle {  // Circle 클래스
	int radius;  // 원의 반지름 필드
	String name;  // 원의 이름 필드
	
	public Circle() {}  // 원의 생성자
	
	public double getArea() // 원의 면적 계산 메소드
	{
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {  // main() 함수
		Circle pizza;  
		pizza = new Circle();  // Circle 객체 생성
		pizza.radius = 10;  // 피자의 반지름을 10으로 생성
		pizza.name = "자바피자";  // 피자의 이름 설정
		double area = pizza.getArea();  // 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();  // Circle 객체 생성
		donut.radius = 2;  // 도넛의 반지름을 2로 설정
		donut.name = "자바도넛";  // 도넛의 이름 설정
		area = donut.getArea();  // 도넛의 면적 알아내기
		System.out.println(donut.name + "의 면적은 " + area);
	}
}