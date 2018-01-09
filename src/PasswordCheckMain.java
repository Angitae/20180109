import java.util.InputMismatchException;
import java.util.Scanner;

//키보드로 비밀번호를 입력받아 비교결과를 출력
public class PasswordCheckMain {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int input_password;
			
			// 키보드로 정수를 입력받아 저장
			// => 정수가 아닌 값을 입력할 경우 재입력
			while(true){
				try{
					System.out.println(" 비밀번호를 입력해주세요 ~~~");
					// nextInt() 메소드 호출시 IN
					input_password = sc.nextInt();	
					break;		
				}
				catch(InputMismatchException e){
					System.out.println("정수만 입력하세요!!!");
					sc.nextLine();
					// 입력 스트림에 존재하는 모든 데이터 제거 
					// sc.nextLine() 메소드 호출안할시 무한루프
				}
			
			}
			
			try{
				if(input_password != 1234){
					throw new PasswordMismatchException("입력한 비밀번호가 맞지 않습니다.");
				}
				System.out.println("입력한 비밀번호가 맞습니다.");
			}catch(PasswordMismatchException e){
				System.out.println(e.getMessage());
			}finally {
			sc.close();
			}
	}
}
