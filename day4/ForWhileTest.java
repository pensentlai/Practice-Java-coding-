
import java.util.Scanner;

class ForWhileTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int positiveNumber = 0;//
		int negativeNumber = 0;//

		for(;;){
			
			int number = scan.nextInt();

			
			if(number > 0){
				positiveNumber++;
			}else if(number < 0){
				negativeNumber++;
			}else{
				
				break;
			}

		}

		System.out.println("�������������Ϊ��" + positiveNumber);
		System.out.println("����ĸ�������Ϊ��" + negativeNumber);
		

	}
}
