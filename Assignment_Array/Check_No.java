package DSAAssignment_Array;
import java.util.Scanner;
public class Check_No {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = new int[5];
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }	        
	        for (int i = 0; i < arr.length; i++) {
	            int num = arr[i];
	            if (num > 0) {
	                System.out.print(num + " is Positive and ");
	                if (num % 2 == 0) {
	                    System.out.println("Even");
	                } else {
	                    System.out.println("Odd");
	                }
	            } else if (num < 0) {
	                System.out.println(num + " is Negative");
	            } else {
	                System.out.println(num + " is Zero");
	            }
	        }
	        int first = arr[0];
	        int last = arr[arr.length - 1];
	        if (first == last) {
	            System.out.println("First and last elements are Equal");
	        } else if (first > last) {
	            System.out.println("First element is Greater than last element");
	        } else {
	            System.out.println("First element is Less than last element");
	        }

	        
	    }
	}


