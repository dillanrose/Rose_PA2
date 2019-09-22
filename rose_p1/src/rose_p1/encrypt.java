package rose_p1;

import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var in = new Scanner (System.in);
		
		System.out.println("Please enter four digit number to be encrypted.");
		String num = in.next();
		
		
		
		System.out.print("Your encrypted number is ");
		System.out.print(((num.charAt(2)-48)+7)%10);
	    System.out.print(((num.charAt(3)-48)+7)%10);
	    System.out.print(((num.charAt(0)-48)+7)%10);
	    System.out.print(((num.charAt(1)-48)+7)%10);
		
		
		
	}

}
