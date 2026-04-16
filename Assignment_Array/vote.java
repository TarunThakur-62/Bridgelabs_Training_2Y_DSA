package DSAAssignment_Array;
import java.util.*;
public class vote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];
		for(int i=0; i<10; i++) {
			age[i] = sc.nextInt();
		}
		for(int j=0; j<10; j++) {
			if(age[j]>=18) {
				System.out.println("Can Vote");
			}
			else {
				System.out.println("Can not Vote");
				
			}
		}
	}

}
