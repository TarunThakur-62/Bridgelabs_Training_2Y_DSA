package DSAAssignment_Array;
import java.util.*;
public class upper_lower_case {
	    static String toLowerManual(String s) {
	        String result = "";
	        for(int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if(ch >= 'A' && ch <= 'Z') {
	                ch = (char)(ch + 32);
	            }
	            result += ch;
	        }
	        return result;
	    }

	    static boolean compare(String a, String b) {
	        if(a.length() != b.length()) return false;
	        for(int i = 0; i < a.length(); i++) {
	            if(a.charAt(i) != b.charAt(i)) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String input = sc.nextLine();

	        String manual = toLowerManual(input);
	        String builtin = input.toLowerCase();

	        boolean result = compare(manual, builtin);

	        System.out.println(manual);
	        System.out.println(builtin);
	        System.out.println(result);
	    
	}

}
