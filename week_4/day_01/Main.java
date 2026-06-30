
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main {

    public static int solve(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = solve(root.left);
        int right = solve(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(solve(root));
    }
}