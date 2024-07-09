package leetcode;



import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode n1 = new TreeNode(6);
        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(9);
        TreeNode n5 = new TreeNode(10);
        TreeNode n6 = new TreeNode(2);

    }

    public static List<Integer> inorderTraversal(leetcode.TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root,list);
        return list;
    }

    static void  inorderTraversal(leetcode.TreeNode root, List<Integer> list){
        if(root == null) return;
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
}























