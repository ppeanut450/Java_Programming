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
show(), main(), loveStory.show()

-------개요(목적)------
this()로 다른 생성자 호출
: Book 클래스의 생성자를 this()를 이용해 수정

--------실행결과-------
앞의 Book 클래스와 달리 필드를 초기화하지 않았기 때문에 전혀 다른 결과값이 나옴

*******************/

public class Book_this {  // Book_this 클래스
	String title;  // String 타입의 필드
	String author;  // String 타입의 필드
	void show() { System.out.println(title + " " + author); }
	
	public Book_this() {  // 매개 변수 없는 생성자
		this("", "");  // 공백으로 초기화
		System.out.println("생성자 호출됨");
	}
	
	public Book_this(String title) {  // 매개 변수(1개)를 가진 생성자
		this(title, "작자미상");
	}
	
	public Book_this(String title, String author) {  // 매개 변수(2개)를 가진 생성자
		this.title = title; this.author = author;
	}
	
	public static void main(String[] args) {  // main() 함수
		Book_this littlePrince = new Book_this("어린왕자", "생텍쥐페리");  // 생성자 Book(String title, String author) 호출  (title: 어린왕자, author: 생텍쥐페리)
		Book_this loveStory = new Book_this("춘향전");  // 생성자 Book(String title) 호출  (title: 춘향전, author: 작자미상)
		Book_this emptyBook = new Book_this();  // 생성자 Book() 호출  (title: , author: )(공백으로 초기화) => "생성자 호출됨"
		loveStory.show();  // loveStory만 출력
	}
}