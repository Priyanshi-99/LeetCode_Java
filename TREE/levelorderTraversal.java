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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> q = new LinkedList <>();
        
        if(root == null){
            return new ArrayList();
        }
        q.add(root);
        while(q.isEmpty()!= true){
            int count = q.size();
               
            List<Integer> list = new ArrayList<>(); 
 
            for(int i=0;i<count;i++){
                TreeNode curr = q.remove();               
                list.add(curr.val);
                if(curr.left!=null) {q.add(curr.left);}
                if(curr.right!=null) {q.add(curr.right);}
            }
             result.add(list);
        }
       
        return result;
        
    }
    
}