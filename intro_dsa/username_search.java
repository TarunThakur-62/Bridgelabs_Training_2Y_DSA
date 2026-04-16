package intro_dsa;
	import java.util.*;

	public class username_search {

	    public static boolean linearSearch(String[] userList, String target) {
	        for (int i = 0; i < userList.length; i++) {
	            if (userList[i].equals(target)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static boolean binarySearch(String[] userList, String target) {
	        int left = 0;
	        int right = userList.length - 1;

	        while (left <= right) {
	            int mid = (left + right) / 2;

	            int cmp = userList[mid].compareTo(target);

	            if (cmp == 0) {
	                return true;
	            } else if (cmp < 0) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return false;
	    }

	    public static boolean hashSearch(HashSet<String> userSet, String target) {
	        return userSet.contains(target);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of users: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        String[] users = new String[n];

	        System.out.println("Enter usernames:");
	        for (int i = 0; i < n; i++) {
	            users[i] = sc.nextLine();
	        }

	        System.out.print("Enter username to search: ");
	        String target = sc.nextLine();

	        boolean foundLinear = linearSearch(users, target);
	        System.out.println("Linear Search: " + foundLinear);

	        Arrays.sort(users);
	        boolean foundBinary = binarySearch(users, target);
	        System.out.println("Binary Search: " + foundBinary);

	        HashSet<String> userSet = new HashSet<>(Arrays.asList(users));
	        boolean foundHash = hashSearch(userSet, target);
	        System.out.println("Hash Search: " + foundHash);

	    }
	}