public class LogicalOperator {

	public static void main(String[] args) {
		// 비교 연산
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		
		// 비교 연산과 논리 연산 복합
		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 != 2) || (-1 > 0));	
			/* (-1 > 0)이 dead code라고 뜨는 이유
			 *  => (3 != 2)가 무조건 참이 되기 때문에 절대로 실행되지 않음 (없어도 실행 o)
			 * 		그렇기 때문에 dead code라고 뜨고 노란 밑줄이 그어짐  */
		System.out.println((3 != 2) ^ (-1 > 0));
	}
}