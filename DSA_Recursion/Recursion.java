import java.util.*;

class FileNode {
    String name;
    int size;
    List<FileNode> children;

    FileNode(String name, int size) {
        this.name = name;
        this.size = size;
        this.children = new ArrayList<>();
    }
}

public class Problem1_Recursion {
    public static int getSize(FileNode node) {
        if (node.children.isEmpty()) {
            return node.size;
        }

        int total = 0;
        for (FileNode child : node.children) {
            total += getSize(child);
        }
        return total;
    }

    public static void main(String[] args) {
        FileNode root = new FileNode("project", 0);

        FileNode src = new FileNode("src", 0);
        src.children.add(new FileNode("main.java", 100));
        src.children.add(new FileNode("utils.java", 50));

        FileNode docs = new FileNode("docs", 0);
        docs.children.add(new FileNode("readme.txt", 10));

        FileNode guides = new FileNode("guides", 0);
        guides.children.add(new FileNode("setup.pdf", 200));
        docs.children.add(guides);

        root.children.add(src);
        root.children.add(docs);
        root.children.add(new FileNode("config.xml", 20));

        System.out.println("Total Size = " + getSize(root) + " KB");
    }
}