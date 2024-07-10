package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if(p.val !=q.val) return false;

        // Both trees are non-empty, check the current nodes and subtrees
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public boolean isSameTree2(TreeNode p, TreeNode q) {
        Queue<TreeNode>queue1 = new LinkedList<>();
        Queue<TreeNode>queue2 = new LinkedList<>();
        if(p!=null)queue1.offer(p);
        if(q!=null)queue2.offer(q);
        while (!queue1.isEmpty() &&!queue2.isEmpty()){
            TreeNode node1 = queue1.poll();
            TreeNode node2 = queue2.poll();
            if(node1.val!=node2.val)return false;
            if(node1.left!=null)queue1.offer(node1.left);
            if(node1.right!=null)queue1.offer(node1.right);

            if(node2.left!=null)queue2.offer(node2.left);
            if(node2.right!=null)queue2.offer(node2.right);


        }
        return queue1.size()==queue2.size();
    }
}
