package tree;
	import java.util.*;

	class Node {
	    String data;
	    Node left, right;

	    Node(String data) {
	        this.data = data;
	        left = right = null;
	    }
	}

	public class expression {

	    // Check operator
	    static boolean isOperator(String s) {
	        return s.equals("+") || s.equals("-") ||
	               s.equals("*") || s.equals("/");
	    }

	    // Build tree from postfix
	    static Node buildTree(String[] postfix) {
	        Stack<Node> stack = new Stack<>();

	        for (String s : postfix) {
	            Node node = new Node(s);

	            if (!isOperator(s)) {
	                stack.push(node);
	            } else {
	                node.right = stack.pop();
	                node.left = stack.pop();
	                stack.push(node);
	            }
	        }
	        return stack.pop();
	    }

	    // Evaluate expression tree
	    static int evaluate(Node root) {
	        if (root == null) return 0;

	        // If leaf node
	        if (!isOperator(root.data)) {
	            return Integer.parseInt(root.data);
	        }

	        int left = evaluate(root.left);
	        int right = evaluate(root.right);

	        switch (root.data) {
	            case "+": return left + right;
	            case "-": return left - right;
	            case "*": return left * right;
	            case "/": return left / right;
	        }
	        return 0;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter postfix expression (space separated):");
	        String input = sc.nextLine();

	        String[] postfix = input.split(" ");

	        Node root = buildTree(postfix);

	        int result = evaluate(root);

	        System.out.println("Result = " + result);
	    }
	}