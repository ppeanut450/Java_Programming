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
StringBufferEx

--------함수명--------
main(), append(), insert(), replace(), delete(), setLength(), println()

-------개요(목적)------
StringBuffer 클래스 메소드 활용

--------실행결과-------
문자열 출력

*******************/

public class StringBufferEx {  // StringBufferEx 클래스
	public static void main(String[] args) {  // main() 함수
		StringBuffer sb = new StringBuffer("This");  // StringBuffer 형태의 변수 sb, 객체 생성

		sb.append(" is pencil"); // 문자열 덧붙이기
		System.out.println(sb);

		sb.insert(7, " my"); // "my" 문자열 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // "my"를 "your"로 변경
		System.out.println(sb);
		
		sb.delete(8, 13); // "your " 삭제
		System.out.println(sb);
		
		sb.setLength(4); // 스트링 버퍼 내 문자열 길이 수정
		System.out.println(sb);
	}
}