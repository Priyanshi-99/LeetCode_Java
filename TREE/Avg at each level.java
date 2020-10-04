/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();

        
        Queue <TreeNode> queue = new LinkedList<>();
        
        if(root == null){
            return res;
        }
        queue.offer(root);
        
        while(!queue.isEmpty()){
            Double levelsum = 0.0;
            int levelsize = queue.size();
            for(int i=0;i<levelsize;i++){
            TreeNode curr = queue.poll();
            levelsum += curr.val;
            if(curr.left!=null){
                queue.offer(curr.left);
            }
            if(curr.right!=null){
                queue.offer(curr.right);
            }
        }
        res.add(levelsum/levelsize);
        }
       return res; 
    }
}