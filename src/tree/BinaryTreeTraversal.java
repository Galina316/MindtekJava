package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {
    public static void main(String[] args) {



    // Traversal:
    // 1 Depth first search (DFS): preorder (current-left-right), in order(left- current- right) post order (left -right- current)
    //2 Breath first search(BFS): level order (from left to right)
    Node root = new Node(5);
    Node n1 = new Node(6);
    Node n2 = new Node(7);
    Node n3 = new Node(8);
    Node n4 = new Node(9);
    Node n5 = new Node(10);
    Node n6= new Node(2);

    root.left=n1;
    root.right=n2;
    n1.left =n3;
    n1.right=n5;
    n2.right=n4;
    n2.left=n6;
        System.out.println("Preorder ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder: ");
        postOrder(root);
        System.out.println();
        System.out.print("BFS");
        levelOrderTraversal(root);
    }


    public static void preorder(Node root){
        if(root==null)return;
        System.out.print(root.val+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void postOrder(Node root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");

    }

    public static void levelOrderTraversal(Node root){
        if(root==null)return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.val+" ");
            //push left
           if(temp.left!=null)q.offer(temp.left);
           if(temp.right!=null)q.offer(temp.right);
        }
    }

}
