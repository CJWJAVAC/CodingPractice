package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    String data;
    Node left;
    Node right;

    public Node(String data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree(String rootData) {
        root = new Node(rootData);
    }

    public void setLeftNode(Node node, String value) {
        node.left = new Node(value);
    }

    public void setRightNode(Node node, String value) {
        node.right = new Node(value);
    }

    public Node findNode(Node node, String value) {
        if (node == null) {
            return null;
        }
        if (node.data.equals(value)) {
            return node;
        }

        Node leftNode = findNode(node.left, value);
        if (leftNode != null) {
            return leftNode;
        }
        return findNode(node.right, value);
    }

    public StringBuilder preorder(Node node) {
        StringBuilder pre = new StringBuilder();
        if (node != null) {
            pre.append(node.data);
            pre.append(preorder(node.left));
            pre.append(preorder(node.right));
        }
        return pre;
    }

    public StringBuilder inorder(Node node) {
        StringBuilder in = new StringBuilder();
        if (node != null) {
            in.append(inorder(node.left));
            in.append(node.data);
            in.append(inorder(node.right));
        }
        return in;
    }

    public StringBuilder postorder(Node node) {
        StringBuilder post = new StringBuilder();
        if (node != null) {
            post.append(postorder(node.left));
            post.append(postorder(node.right));
            post.append(node.data);
        }
        return post;
    }
}

public class TreeCircuit {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        BinaryTree tree = new BinaryTree("A");

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] nodes = str.split(" ");
            String parentData = nodes[0];
            String leftData = nodes[1];
            String rightData = nodes[2]; 

            Node parentNode = tree.findNode(tree.root, parentData);
            if (parentNode != null) {
                if (!leftData.equals(".")) { 
                    tree.setLeftNode(parentNode, leftData);
                }
                if (!rightData.equals(".")) { 
                    tree.setRightNode(parentNode, rightData);
                }
            }
        }

        sb.append(tree.preorder(tree.root)+"\n"+tree.inorder(tree.root)+"\n"+tree.postorder(tree.root));
        System.out.println(sb);
    }
}
