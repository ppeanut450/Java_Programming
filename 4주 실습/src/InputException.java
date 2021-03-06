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
InputMismatchException, Scanner, InputException
        
--------함수명--------
main(), Scanner(), nextInt(), next(), close()

-------개요(목적)------
입력 오류시 발생하는 예외

--------실행결과-------
정상적으로 입력됐을 때: 값 출력
정상적으로 입력되지 않았을 때: catch 블록 메세지 출력
		
*******************/

import java.util.Scanner;  // Scanner 클래스
import java.util.InputMismatchException;  // InputMismatchException 클래스

public class InputException {  // InputException 클래스
	public static void main(String[] args) {  // main() 함수
		Scanner scanner = new Scanner(System.in);  // Scanner 형태의 변수 scanner, new Scanner(System.in): Scanner 클래스의 객체 생성
		System.out.println("정수 3개를 입력하세요");
		int sum=0, n=0;  // 합을 저장할 변수 sum, 정수 입력할 변수 n
		for (int i=0; i<3; i++)  // 반복문에서 사용되는 변수 i, i는 0부터 3보다 작을 때까지 반복
		{
			System.out.print(i+">>");
			try  // 예외가 발생할 가능성이 있는 실행문
			{
				n = scanner.nextInt();  // 정수 입력
			}
			catch(InputMismatchException e)  // Scanner 클래스의 nextInt()를 호출하여 정수로 입력받고자 하였지만, 사용자가 'a' 등과 같이 문자를 입력한 경우
			{
				System.out.println("정수가 아닙니다. 다시 입력하세요!");  // 예외가 발생했을 때 
				scanner.next();  // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				i--;  // 인덱스가 증가하지 않도록 미리 감소
				continue;  // 다음 루프
			}
			sum += n;  // 합하기
		}  // finally 블록 생략
		System.out.println("합은 " + sum);  // 예외가 발생하지 않았을 때
		scanner.close();  // scanner 사용 종료
	}
}