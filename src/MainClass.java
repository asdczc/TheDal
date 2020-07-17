import java.util.Scanner;

//메인 클래스
public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Myclass my = new Myclass();
//		Mycalls3 mc = new Mycalls3();
//		my.food();
//		
//		
//		int i = mc.z();
//		System.out.println("r1에사 받은 int 데이터"+ i);
		Subclass bc = new Subclass();
		Scanner sc = new Scanner(System.in);
		int a = bc.the();
		int b = sc.nextInt();
		System.out.println(bc.Sub(nums[1]));
	}
}

