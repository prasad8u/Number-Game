import java.util.Random;
import java.util.Scanner;
public class numberGame{
	public static void main(String args[]){
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number  0-100 ");
		int x=sc.nextInt();
		Random random=new Random();
		number=random.nextInt(100);
		System.out.println("auto generate no is "+number);
		System.out.println("your choice is "+x);
		if(number==x){
			System.out.println("your choice is correct,you are win");
		}else{
			System.out.println("your choice is incorrect,you are lose");
		}
	}
}