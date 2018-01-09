
public class TryCatch {
	public void arrayDisplay(){
	 int map[] = {0 ,1 ,2 };
	try{
		for(int i = 0; i < 5; i++){
			System.out.println("map["+ i + "]" + map[i]);
		}
	}
	catch(ArrayIndexOutOfBoundsException e){
		// ������ ���� �ν��Ͻ��� ������ ��� ���ܸ� ó���ϱ� ���� ���
		// -> ������ ���� �ν��Ͻ��� �Ķ���� ���������� ����
		System.out.println("���ܸ޽��� ���"+e.getMessage()); // �̰� ���� ���� ���
		//System.out.println(e.getMessage());
//		e.printStackTrace();
		// ���ܰ� �߻��� ��θ� �����Ѵ�.
		// ������ ( Thread ) 
	}
	finally { // ������ ����ǰ� �����. 
		// �ڿ��� �ݳ��� �� �ַ� ����Ѵ� .
		// JDBC���� connection�� ��� .
		System.out.println("������ ���� �� ");
	}
	}
	
	public static void main(String[] args) {
		new TryCatch().arrayDisplay();
	}
}
