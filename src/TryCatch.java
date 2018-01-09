
public class TryCatch {
	public void arrayDisplay(){
	 int map[] = {0 ,1 ,2 };
	try{
		for(int i = 0; i < 5; i++){
			System.out.println("map["+ i + "]" + map[i]);
		}
	}
	catch(ArrayIndexOutOfBoundsException e){
		// 생성된 예외 인스턴스가 존재할 경우 예외를 처리하기 위한 명령
		// -> 생성된 예외 인스턴스를 파라미터 참조변수에 저장
		System.out.println("예외메시지 출력"+e.getMessage()); // 이걸 제일 많이 사용
		//System.out.println(e.getMessage());
//		e.printStackTrace();
		// 예외가 발생된 경로를 추적한다.
		// 역추적 ( Thread ) 
	}
	finally { // 무조건 실행되게 만든다. 
		// 자원을 반납할 때 주로 사용한다 .
		// JDBC에서 connection시 사용 .
		System.out.println("무조건 실행 됨 ");
	}
	}
	
	public static void main(String[] args) {
		new TryCatch().arrayDisplay();
	}
}
