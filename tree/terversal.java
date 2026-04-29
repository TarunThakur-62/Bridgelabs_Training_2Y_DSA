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

	public class terversal {
	    static Scanner sc = new Scanner(System.in);

	    static Node create() {
	        System.out.print("Enter node name (or 'null'): ");
	        String val = sc.next();

	        if (val.equals("null")) return null;

	        Node root = new Node(val);

	        System.out.println("Enter left child of " + val);
	        root.left = create();

	        System.out.println("Enter right child of " + val);
	        root.right = create();

	        return root;
	    }

	    static void inorder(Node root) {
	        if (root == null) return;
	        inorder(root.left);
	        System.out.print(root.data + " ");
	        inorder(root.right);
	    }

	    static void preorder(Node root) {
	        if (root == null) return;
	        System.out.print(root.data + " ");
	        preorder(root.left);
	        preorder(root.right);
	    }

	    static void postorder(Node root) {
	        if (root == null) return;
	        postorder(root.left);
	        postorder(root.right);
	        System.out.print(root.data + " ");
	    }

	    public static void main(String[] args) {
	        Node root = create();

	        System.out.println("\nInorder Traversal:");
	        inorder(root);

	        System.out.println("\nPreorder Traversal:");
	        preorder(root);

	        System.out.println("\nPostorder Traversal:");
	        postorder(root);
	    }
	}