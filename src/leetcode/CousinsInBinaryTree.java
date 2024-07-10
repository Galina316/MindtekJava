package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            boolean xFound = false, yFound = false;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.val == x) xFound = true;
                if (node.val == y) yFound = true;

                if (node.left != null && node.right != null) {
                    if ((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x)) {
                        return false;
                    }
                }

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            if (xFound && yFound) return true;
        }

        return false;
    }
    public boolean isCousins1(TreeNode root, int x, int y) {
        Queue<TreeNode> que = new LinkedList<>();
    if(root!=null)que.add(root);
    boolean xfound =false, yFound = false;
    while(!que.isEmpty()){
        int size = que.size();
        while (size>0){
            TreeNode temp = que.poll();
            if(temp.left!=null && temp.right!=null) {
                if ((temp.left.val == x && temp.right.val == y) || (temp.left.val == y && temp.right.val == x))
                    return false;
            }
            if(temp.left!=null)que.offer(temp.left);
            if(temp.right!=null)que.offer(temp.right);
            if(temp.val==x)xfound= true;
            if(temp.val==y)yFound=true;

            size--;
        }
        if(xfound && yFound)return true;
        if(xfound && !yFound)return false;
        if(!xfound && yFound) return false;
    }
    return false;
    }
    }

