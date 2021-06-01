import java.util.Scanner;
public class Main{
	public static void main(String[]arr){

		System.out.println("1.addition");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");

		System.out.print("Enter the choice");

		Scanner sc =new Scanner(System.in);
		int choice;
		choice =sc.nextInt();

		if (choice==1) {
			System.out.println("addition");
		}
		else if(choice==2){
			System.out.println("sub");
		}
		else if(choice==3){
			System.out.println("mul");
		}
		else if(choice==4){
			System.out.println("div");
		}
		

	}
}