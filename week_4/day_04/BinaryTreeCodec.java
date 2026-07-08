import java.util.*;

class BinaryTreeCodec {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString();
    }

    private void helper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }

        sb.append(root.val).append(",");
        helper(root.left, sb);
        helper(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        Queue<String> q = new LinkedList<>();

        for (String s : arr) {
            q.offer(s);
        }

        return build(q);
    }

    private TreeNode build(Queue<String> q) {
        String s = q.poll();

        if (s.equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = build(q);
        root.right = build(q);

        return root;
    }

    static void preorder(TreeNode root) {
        if (root == null) {
            System.out.print("null ");
            return;
        }

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeCodec obj = new BinaryTreeCodec();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        String str = obj.serialize(root);
        System.out.println("Serialized: " + str);

        TreeNode newRoot = obj.deserialize(str);

        System.out.print("Preorder after Deserialization: ");
        preorder(newRoot);
    }
}