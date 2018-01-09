import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiCatch {
	private int num1, num2;

	public void inputNumber() throws IOException, NumberFormatException {
		// 입력 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// System.out.print("첫번째 정수 입력 >>");
		// readLine() : 키보드로 입력된 문자를 얻어와
		// br.readLine();
		// 반환하는 메소드
		// => IO Exception 발생
		// => try- catch로 예외처리
		// or throws IOException
		// parseInt(String) : 문자열을 정수로 변환하여 반환하는 메소드
		// => NumberFormatException 발생
		System.out.print("첫 번째 정수 입력 >>");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 >>");
		num2 = Integer.parseInt(br.readLine());

		calcDisplay();
	}

	private void calcDisplay() throws ArithmeticException {
		System.out.println(num1 + " *  " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " /  " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " +  " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " -  " + num2 + " = " + (num1 - num2));
	}

	public static void main(String[] args) throws IOException {
		
		/*try {
			new MultiCatch().inputNumber();
		} catch (NumberFormatException e) {
			e.getMessage();
			System.out.println(" 숫자를 입력해주세요 ");
		} catch (ArithmeticException e) {
			System.out.println(" 0으로 나눌 수 없습니다. ");
		} catch (Exception e) { // 모든 예외에 대한 처리가 가능하다.
			System.out.println("언급되지 않은 예외가 발생하였습니다.");
		}*/
		try {
			new MultiCatch().inputNumber();
		} catch (NumberFormatException | ArithmeticException e) { // JDK 1.7 Version~
			System.out.println("숫자만 입력하지 않았거나, 0으로 나눌수 없는 상황입니다.");
		} catch (Exception e) { // 모든 예외에 대한 처리가 가능하다.
			System.out.println("언급되지 않은 예외가 발생하였습니다.");
		}
	}
}
