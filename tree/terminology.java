package tree;
	class Node {
	    String data;
	    Node left, right;

	    Node(String data) {
	        this.data = data;
	        left = right = null;
	    }
	}

	public class terminology {
	    public static void main(String[] args) {

	        Node CEO = new Node("CEO");
	        Node CTO = new Node("CTO");
	        Node CFO = new Node("CFO");
	        Node devLead = new Node("Dev Lead");
	        Node HR = new Node("HR");
	        Node dev1 = new Node("Dev1");
	        Node dev2 = new Node("Dev2");

	        CEO.left = CTO;
	        CEO.right = CFO;

	        CTO.left = devLead;
	        CTO.right = HR;

	        devLead.left = dev1;
	        devLead.right = dev2;

	        System.out.println("Leaf Nodes:");
	        printLeafNodes(CEO);
	    }
	    static void printLeafNodes(Node root) {
	        if (root == null) return;

	        if (root.left == null && root.right == null) {
	            System.out.println(root.data);
	        }

	        printLeafNodes(root.left);
	        printLeafNodes(root.right);
	    }
	}