public class LeetCodeProblems{

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
        public List<List<Integer>> levelOrderBottom(TreeNode root) {

            List<List<Integer>> levelorder = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<TreeNode>();

            if(root == null){
                return levelorder;
            } else {
                q.offer(root);
            }

            TreeNode current;

            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> level = new LinkedList <Integer>();

                for(int i = 0; i < size; i++){
                    current = q.poll();
                    level.add(current.val);
                    if(current.left != null){
                        q.offer(current.left);
                    }
                    if(current.right != null){
                        q.offer(current.right);
                    }


                }
                levelorder.add(level);
            }

            levelorder = reverse(levelorder);

            return levelorder;


        }

        private static List<List<Integer>> reverse(List<List<Integer>> levelorder){

            List<List<Integer>> reverseorder = new ArrayList<>();

            for(int i = levelorder.size() - 1; i >= 0; i--){
                reverseorder.add(levelorder.get(i));
            }



            return reverseorder;


        }
    }
}