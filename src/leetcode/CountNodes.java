package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        // Calculate the height of the tree
        int height = getHeight(root);

        // Binary search on the last level to find the number of nodes
        int left = 1, right = (1 << height) - 1; // 2^height - 1 is the max index for the last level
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (exists(root, mid, height)) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }

        // The number of nodes is the number of full levels plus the count on the last level
        // Number of nodes = (2^height - 1) + (last level nodes)
        return (1 << height) - 1 + right + 1;
    }

    // Method to get the height of the tree
    private int getHeight(TreeNode root) {
        int height = 0;
        while (root.left != null) {
            root = root.left;
            height++;
        }
        return height;
    }

    // Method to check if the k-th node exists in the last level
    private boolean exists(TreeNode root, int index, int height) {
        int left = 0, right = (1 << height) - 1; // 2^height - 1 is the max index for the last level
        for (int i = 0; i < height; i++) {
            int mid = left + (right - left) / 2;
            if (index <= mid) {
                root = root.left;
                right = mid;
            } else {
                root = root.right;
                left = mid + 1;
            }
        }
        return root != null;
    }


    public int countNodes2(TreeNode root) {
        if(root == null)return 0;
        return 1+ countNodes(root.left)+countNodes(root.right);

    }


    public int countNodes3(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0;
        if(root!=null)queue.add(root);
        {

        }
        while(!queue.isEmpty()){TreeNode temp = queue.poll();
            count++;
            if(temp.left!=null)queue.add(temp.left);
            if(temp.right!=null)queue.add(temp.right);
        } return count;
    }



}


