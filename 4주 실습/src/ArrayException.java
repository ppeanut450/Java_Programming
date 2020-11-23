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
ArrayException
        
--------함수명--------
main()

-------개요(목적)------
범위를 벗어난 배열의 접근

--------실행결과-------
범위를 벗어나지 않았을 때: 값 출력
범위를 벗어났을 때: catch 블록 메세지 출력
		
*******************/

public class ArrayException {  // ArrayException 클래스
	public static void main(String[] args) {  // main() 함수
		int[] intArray = new int[5];  // int 객체 생성
		intArray[0] = 0;  // 배열을 0으로 초기화
		try  // 예외가 발생할 가능성이 있는 실행문
		{
			for (int i=0; i<5; i++) // 반복문에서 사용되는 변수 i, i는 0부터 5보다 작을 때까지 반복
			{
				intArray[i+1] = i + 1 + intArray[i];
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);  // 범위 안에 있을 때
			}
		}
		catch (ArrayIndexOutOfBoundsException e)  // 처리할 예외 타입: 배열의 범위를 벗어난 접근 시 발생
		{
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");  // 범위를 벗어났을 때
		}
	}  // finally 블록 생략
}