package rose_p1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter four digit number to be decrypted.");
		String num = in.next();
		
		
		
		System.out.println("Your decrypted number is " +num);
		System.out.print((((num.charAt(2)-48)+10)-7)%10);
	    System.out.print((((num.charAt(3)-48)+10)-7)%10);
	    System.out.print((((num.charAt(0)-48)+10)-7)%10);
	    System.out.print((((num.charAt(1)-48)+10)-7)%10);
		
		
		
	}

}