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
Book

--------함수명--------
main()

-------개요(목적)------
생성자 선언 및 활용 연습
: 제목과 저자를 나타내는 title과 author 필드를 가진 Book 클래스 작성, 생성자를 작성하여 필드 초기화

--------실행결과-------
출력하고자 하는 값(문자)이 순서대로 출력

*******************/

public class Book {  // Book 클래스
	String title;  // String 타입의 필드
	String author;  // String 타입의 필드
	
	public Book(String t) {  // 매개 변수(1개)를 가진 생성자 
		title = t; author = "작자미상";  // title은 t의 값, author는 "작자미상"
	}
	
	public Book(String t, String a) {  // 매개 변수(2개)를 가진 생성자 
		title = t; author = a;  // title은 t의 값, author는 a의 값
	}
	
	public static void main(String[] args) {  // main() 함수
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");  // 생성자 Book(String t, String a) 호출  (title: 어린왕자, author: 생텍쥐페리)
		Book loveStory = new Book("춘향전");  // 생성자 Book(String t) 호출  (title: 춘향전, author: 작자미상)
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}