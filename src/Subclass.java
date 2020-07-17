
import java.util.*;

public class Subclass {
	public int the() {
		Random rnd = new Random();
		int num  = rnd.nextInt(89) + 10;
		int num2  = rnd.nextInt(89) + 10;
		System.out.println(num + "+" + num2+ "=");
		int a = num+num2;	
		return a;
		
	}
	
	public void ox(int a, int b) {
		if(a == b) {
			System.out.println("맞습니다.");
		}
		else {
			System.out.println("틀렸습니다.");
		}
		
	}
	
	public int run() {
		Random rnd = new Random();
		int [] nums = new int [2];
		nums[0] = rnd.nextInt(89) + 10;
		nums[1] = rnd.nextInt(89) + 10;
		int a = nums[0]+nums[1];	
		return a;
		
	}
	
	public void Sub(int nums[]) {
		System.out.println(nums[0]); 
		
	}	
}
