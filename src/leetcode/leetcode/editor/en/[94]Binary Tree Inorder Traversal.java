package leetcode.leetcode.editor.en;//Given the root of a binary tree, return the inorder traversal of its nodes'
//values.
//
//
// Example 1:
//
//
// Input: root = [1,null,2,3]
//
//
// Output: [1,3,2]
//
// Explanation:
//
//
//
// Example 2:
//
//
// Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
//
//
// Output: [4,2,6,5,7,1,3,9,8]
//
// Explanation:
//
//
//
// Example 3:
//
//
// Input: root = []
//
//
// Output: []
//
// Example 4:
//
//
// Input: root = [1]
//
//
// Output: [1]
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100
//
//
//
//Follow up: Recursive solution is trivial, could you do it iteratively?
//
// Related Topics Stack Tree Depth-First Search Binary Tree 👍 13879 👎 826


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        inorderHelp(root, results);
        return results;
    }

    private void inorderHelp(TreeNode root, List<Integer> results) {
        if (root == null) return;
        inorderHelp(root.left, results);
        results.add(root.val);
        inorderHelp(root.right, results);
    }

    public static void main(String[] args) {
        // 创建一个二叉树
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        Solution solution = new Solution();

        // 获取排序后的数组
        List<Integer> sortedArray = solution.inorderTraversal(root);

        // 输出排序后的数组
        System.out.println("排序后的数组：");
        for (int num : sortedArray) {
            System.out.print(num + " ");  // 输出：1 2 3 4
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)
