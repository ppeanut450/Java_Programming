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
StringEx

--------함수명--------
main(), length(), contains(), concat(), trim(), 
replace(), split(), substring(), charAt(), println()

-------개요(목적)------
String 클래스 메소드 활용

--------실행결과-------


*******************/

public class StringEx {  // StringEx 클래스
	public static void main(String[] args) {  // main() 함수
		String a = new String(" C#");  // String 형태의 변수 a, String 클래스의 객체 생성
		String b = new String(",C++ ");  // String 형태의 변수 b, String 클래스의 객체 생성

		System.out.println(a + "의 길이는 " + a.length());  // 문자열의 길이(문자 개수)
		System.out.println(a.contains("#"));  // 문자열의 포함 관계

		a = a.concat(b);  // 문자열 연결
		System.out.println(a);

		a = a.trim();  //  문자열 앞 뒤의 공백 제거
		System.out.println(a);

		a = a.replace("C#","Java");  // 문자열 대치
		System.out.println(a);

		String s[] = a.split(","); // 문자열 분리
		for (int i=0; i<s.length; i++)  // i는 0부터 s.length까지 반복
			System.out.println("분리된 문자열" + i + ": " + s[i]);

		a = a.substring(5);  // 인덱스 5부터 끝까지 서브 스트링 리턴
		System.out.println(a);

		char c = a.charAt(2);  // 인덱스 2의 문자 리턴
		System.out.println(c);
	}
}
