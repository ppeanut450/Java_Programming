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
WrapperEx

--------함수명--------
main(), toLowerCase(), isDigit(), isAlphabetic(), parseInt(), toHexString(), 
toBinaryString(), bitCount(), toString, parseDouble(), parseBoolean(), println()

-------개요(목적)------
Wrapper 클래스 활용

--------실행결과-------
조건에 따라 값이 다르게 출력 + Wrapper을 활용한 변환 값 출력

*******************/

public class WrapperEx {  // WrapperEx 클래스
	public static void main(String[] args) {  // main() 함수
		System.out.println(Character.toLowerCase('A'));  // 'A'를 소문자로 변환
		char c1='4', c2='F';
		if(Character.isDigit(c1))  // 문자 c1이 숫자이면 true
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2))  // 문자 c2가 영문자이면 true
			System.out.println(c2 + "는 영문자");
		
		System.out.println(Integer.parseInt("-123"));  // "-123"을 10진수로 변환
		System.out.println(Integer.toHexString(28));  // 28을 16진수 문자열로 변환
		System.out.println(Integer.toBinaryString(28));  // 28을 2진수 문자열로 변환
		System.out.println(Integer.bitCount(28));  // 28에 대한 2진수의 1의 개수
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());  // Double 3.14를 문자열 "3.14"로 변환
		System.out.println(Double.parseDouble("3.14"));  // 문자열 "3.14"를 실수 3.14로 변환
		
		boolean b = (4 > 3);  // b는 true
		System.out.println(Boolean.toString(b));  // true를 문자열 "true"로 변환
		System.out.println(Boolean.parseBoolean("false"));  // 문자열 "false"를 false로 변환
	}
}