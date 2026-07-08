
class TreeDiameterFinder {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        ans = Math.max(ans, left + right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeDiameterFinder obj = new TreeDiameterFinder();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(obj.diameterOfBinaryTree(root));
    }
}