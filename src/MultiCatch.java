import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiCatch {
	private int num1, num2;

	public void inputNumber() throws IOException, NumberFormatException {
		// �Է� ��Ʈ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// System.out.print("ù��° ���� �Է� >>");
		// readLine() : Ű����� �Էµ� ���ڸ� ����
		// br.readLine();
		// ��ȯ�ϴ� �޼ҵ�
		// => IO Exception �߻�
		// => try- catch�� ����ó��
		// or throws IOException
		// parseInt(String) : ���ڿ��� ������ ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => NumberFormatException �߻�
		System.out.print("ù ��° ���� �Է� >>");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� >>");
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
			System.out.println(" ���ڸ� �Է����ּ��� ");
		} catch (ArithmeticException e) {
			System.out.println(" 0���� ���� �� �����ϴ�. ");
		} catch (Exception e) { // ��� ���ܿ� ���� ó���� �����ϴ�.
			System.out.println("��޵��� ���� ���ܰ� �߻��Ͽ����ϴ�.");
		}*/
		try {
			new MultiCatch().inputNumber();
		} catch (NumberFormatException | ArithmeticException e) { // JDK 1.7 Version~
			System.out.println("���ڸ� �Է����� �ʾҰų�, 0���� ������ ���� ��Ȳ�Դϴ�.");
		} catch (Exception e) { // ��� ���ܿ� ���� ó���� �����ϴ�.
			System.out.println("��޵��� ���� ���ܰ� �߻��Ͽ����ϴ�.");
		}
	}
}
