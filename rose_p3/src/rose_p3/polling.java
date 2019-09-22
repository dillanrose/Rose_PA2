package rose_p3;

import java.util.Scanner;

public class polling {
	  public static void main(String args[]) {
	Scanner in = new Scanner (System.in);
	String[] topics= {"political issues" , "environmental issues", "food", "video games", "ucf football"};
	int [][] responses = new int [5][10];
	{
	for(int i=0;i<4;i++){
        for(int j=1;j<=10;j++){
            responses[i][j]=0; //Initializing responses with zero
            
	System.out.print("How many people are taking the survey?");
	int numPeople =in.nextInt();
	int x=1;
	int results;
	while (x<= numPeople) {
		for ( j=0; j<5; j++) {
			System.out.println("Surveyor " +i+1+ ":" +topics[j]);
			results=in.nextInt();
			responses[j][results]=responses[j][results]+1;
		}
		i++;
	}
	System.out.println("                      1 2 3 4 5 6 7 8 9 10");
	System.out.println("political isssues   " +responses[i][j]);
	System.out.println("Enviromental issues " +responses[i][j]);
	System.out.println("food                " +responses[i][j]);
	System.out.println("video games         " +responses[i][j]);
	System.out.println("ucf football        " +responses[i][j]);
}
}
	}	
} 
	  }