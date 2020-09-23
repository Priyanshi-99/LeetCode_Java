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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        List<List<Integer>> result = new ArrayList<>();
        if(root!=null){
        Stack<TreeNode> stk = new Stack<>();
        Stack<TreeNode> temp = new Stack<>();
        List<Integer> level = new ArrayList<>();
        boolean isLeft = true;
        stk.push(root);
        while(stk.isEmpty()!=true){
                TreeNode curr = stk.pop();            
                level.add(curr.val);

                    
        if(isLeft){
        if(curr.left!=null)temp.add(curr.left);
        if(curr.right!=null) temp.add(curr.right);
        }
    else{
        if(curr.right!=null) temp.add(curr.right);
        if(curr.left!=null)temp.add(curr.left);
    }

                if(stk.isEmpty()){
                    result.add(level);
                    stk = temp;
                    level = new ArrayList<>();
                    temp = new Stack<>();
                    isLeft = !isLeft;
                }
                }
            
           
        }
        
        
        return result;
     
        
    }
   
}