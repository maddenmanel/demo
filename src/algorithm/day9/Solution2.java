package algorithm.day9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {

    public static class TreeNode {
        Integer val;
        TreeNode left;
        TreeNode right;

        TreeNode(Integer x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            for(int i = 0; i < queue.size(); i++){
                TreeNode treeNode = queue.poll();
                tmp.add(treeNode.val);
                if (treeNode.left != null){
                    queue.add(treeNode.left);
                }

                if (treeNode.right != null){
                    queue.add(treeNode.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        TreeNode rightLeft = new TreeNode(15);
        TreeNode rightRight = new TreeNode(7);
        root.left = left;
        root.right = right;
        right.left = rightLeft;
        right.right = rightRight;
        Solution2 solution = new Solution2();
        List<List<Integer>> result = solution.levelOrder(root);
        System.out.println(result);
    }


}
