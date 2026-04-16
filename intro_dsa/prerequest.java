package intro_dsa;
	import java.util.*;

	public class prerequest {
	    public static boolean checkNested(int[] completed, int[] prereq) {
	        for (int i = 0; i < prereq.length; i++) {
	            boolean found = false;

	            for (int j = 0; j < completed.length; j++) {
	                if (prereq[i] == completed[j]) {
	                    found = true;
	                    break;
	                }
	            }

	            if (!found) return false;
	        }
	        return true;
	    }
	    public static boolean checkHash(int[] completed, int[] prereq) {
	        HashSet<Integer> set = new HashSet<>();

	        for (int c : completed) {
	            set.add(c);
	        }

	        for (int p : prereq) {
	            if (!set.contains(p)) {
	                return false;
	            }
	        }

	        return true;
	    }
	    public static boolean checkHybrid(int[] completed, int[] prereq) {

	        if (prereq.length <= 2) {
	            return checkNested(completed, prereq);
	        } else {
	            return checkHash(completed, prereq);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of completed courses: ");
	        int n = sc.nextInt();

	        int[] completed = new int[n];
	        System.out.println("Enter completed course IDs:");
	        for (int i = 0; i < n; i++) {
	            completed[i] = sc.nextInt();
	        }

	        System.out.print("Enter number of prerequisites: ");
	        int m = sc.nextInt();

	        int[] prereq = new int[m];
	        System.out.println("Enter prerequisite course IDs:");
	        for (int i = 0; i < m; i++) {
	            prereq[i] = sc.nextInt();
	        }

	        System.out.println("Nested Loop Result: " + checkNested(completed, prereq));
	        System.out.println("HashSet Result: " + checkHash(completed, prereq));
	        System.out.println("Hybrid Result: " + checkHybrid(completed, prereq));
	    }
	}