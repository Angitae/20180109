import java.util.InputMismatchException;
import java.util.Scanner;

//Ű����� ��й�ȣ�� �Է¹޾� �񱳰���� ���
public class PasswordCheckMain {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int input_password;
			
			// Ű����� ������ �Է¹޾� ����
			// => ������ �ƴ� ���� �Է��� ��� ���Է�
			while(true){
				try{
					System.out.println(" ��й�ȣ�� �Է����ּ��� ~~~");
					// nextInt() �޼ҵ� ȣ��� IN
					input_password = sc.nextInt();	
					break;		
				}
				catch(InputMismatchException e){
					System.out.println("������ �Է��ϼ���!!!");
					sc.nextLine();
					// �Է� ��Ʈ���� �����ϴ� ��� ������ ���� 
					// sc.nextLine() �޼ҵ� ȣ����ҽ� ���ѷ���
				}
			
			}
			
			try{
				if(input_password != 1234){
					throw new PasswordMismatchException("�Է��� ��й�ȣ�� ���� �ʽ��ϴ�.");
				}
				System.out.println("�Է��� ��й�ȣ�� �½��ϴ�.");
			}catch(PasswordMismatchException e){
				System.out.println(e.getMessage());
			}finally {
			sc.close();
			}
	}
}
