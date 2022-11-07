
public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "JBEdu";            //
		String strVar2 = "JBEdu";

		if (strVar1 == strVar2) {            // 주소값을 비교  
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}

		if (strVar1.equals(strVar2)) {		// 문자열을 비교 
			System.out.println("두 문자열이 같음");
		}

		String strVar3 = new String("JBEdu");	// new가 생성 됬으니 heap 영역에 두개 생성
		String strVar4 = new String("JBEdu");	// 그러므로 주소값이 다르다

		if (strVar3 == strVar4) {
			System.out.println("참조가 같음");   // 두 주소값은 다르지만
		} else {
			System.out.println("참조가 다름");
		}
		if (strVar3.equals(strVar4)) {
			System.out.println("두 문자열이 같음");		// "JBEdu"는 같다.

		}
	}
}
