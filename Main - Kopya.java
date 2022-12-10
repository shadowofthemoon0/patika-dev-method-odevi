import java.util.Scanner;

public class Main {
	static boolean isPalindrom(int number){
		int temp=number,reverse=0,lastNumber;
		while(temp!=0) {
			 lastNumber=temp%10;
			 reverse= (reverse*10)+lastNumber;
			 temp/=10;
			 
		}
		if(reverse==number) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Palidrom özelliği sorgulanacak sayıyı giriniz:");
		int num=scan.nextInt();
		if(isPalindrom(num)) {
			System.out.println(num + " palindrom bir sayıdır");
		}
		else {
			System.out.println(num +" palindrom bir sayı değildir");
		}

	}

}
