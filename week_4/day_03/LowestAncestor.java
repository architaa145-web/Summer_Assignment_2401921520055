class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LowestAncestor {

    public static TreeNode solve(TreeNode root, TreeNode p, TreeNode q) {

        if (p.val < root.val && q.val < root.val) {
            return solve(root.left, p, q);
        }

        if (p.val > root.val && q.val > root.val) {
            return solve(root.right, p, q);
        }

        return root;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        TreeNode p = root.left;      // 2
        TreeNode q = root.right;     // 8

        TreeNode ans = solve(root, p, q);

        System.out.println(ans.val);
    }
}