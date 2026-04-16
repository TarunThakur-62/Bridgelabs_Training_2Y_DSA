package intro_dsa;
	import java.util.Scanner;

	public class algorithem {

	    public static double findAverage(int[] temperature, int n) {
	        if (n == 0) {
	            System.out.println("Invalid input (n=0)");
	            return 0;
	        }

	        int total = 0;

	        for (int i = 0; i < n; i++) {
	            total += temperature[i];
	        }

	        return (double) total / n;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of days: ");
	        int n = sc.nextInt();

	        if (n <= 0) {
	            System.out.println("Invalid input!");
	            return;
	        }

	        int[] temperature = new int[n];

	        System.out.println("Enter temperatures:");
	        for (int i = 0; i < n; i++) {
	            temperature[i] = sc.nextInt();
	        }
	        double avg = findAverage(temperature, n);
	        System.out.println("Average Temperature = " + avg);
	    }
	}