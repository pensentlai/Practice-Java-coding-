/*
��С���μ�Java���ԣ����͸�������Ⱥ��ɳ�ŵ��
�����
�ɼ�Ϊ100��ʱ������һ��BMW��
�ɼ�Ϊ(80��99]ʱ������һ̨iphone xs max��
���ɼ�Ϊ[60,80]ʱ������һ�� iPad��
����ʱ��ʲô����Ҳû�С�
��Ӽ���������С������ĩ�ɼ����������ж�

*/

import java.util.Scanner;
class IfTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��������С����ĩ�ɼ���(0-100)");
		int score = scan.nextInt();

		if(score == 100){
			System.out.println("����һ��BMW");//be my wife!  BMW <---> MSN
		}else if(score > 80 &&  score <= 99){
			System.out.println("����һ̨iphone xs max");
		}else if(score >= 60 && score <= 80){
			System.out.println("����һ�� iPad");
		}else{
			System.out.println("ʲô����Ҳû��");
		}
	}
}
