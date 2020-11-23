/*******************
-----프로그램작성일------
2020.09.25
   
------프로그램 작성자-----
20193012 박은서

-------프로그램명-------
4주 실습 예제 

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
ver 1.0 프로그램 주석 작성
ver 2.0 함수, 클래스 주석 작성
ver 3.0 코드 작성
ver 4.0 오타 수정
ver 5.0 라인 주석 작성

------프로그램 개요------
Java 수업 복습 겸 과제 제출용

--------클래스명-------
Calc
        
--------함수명--------
main(), parseDouble()

-------개요(목적)------
main()에서 명령행 인자의 합 계산

--------실행결과-------
실수(Double형) 출력
		
*******************/

public class Calc {  // Calc 클래스
	public static void main(String[] args) {  // main() 함수
		double sum = 0.0;  // 명령행 인자의 합을 저장할 변수
		
		for (int i=0; i<args.length; i++)  // 인자 개수만큼 반복
			sum += Double.parseDouble(args[i]);  // 문자열을 실수(double 타입)로 변환하여 합산
		
		System.out.println("합계: " + sum);
	}
}