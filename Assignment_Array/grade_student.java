package DSAAssignment_Array;
import java.util.*;
public class grade_student {
	public static void main(String[] abcd) {
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[3];
		int sum=0;
		for(int i=0; i<3; i++) {
			marks[i] = sc.nextInt();
			sum += marks[i];
		}
		float avg= sum/3;
			if(avg>=80) {
				System.out.println("Grade A");
			}
			if(avg>=70 & avg <=79) {
				System.out.println("Grade B");
				
			}
			if(avg>=60 & avg <=69) {
				System.out.println("Grade C");
				
			}
			if(avg>=50 & avg <=59) {
				System.out.println("Grade D");
				
			}
			if(avg>=40 & avg <=49) {
				System.out.println("Grade E");
				
			}
			if(avg<=39) {
				System.out.println("Grade R");
				
			}
			
		
	}

}
