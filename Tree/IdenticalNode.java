package Tree;

public class IdenticalNode {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    boolean isSame(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return (a.val == b.val) && isSame(a.left, b.left) && isSame(a.right, b.right);
    }

    public static void main(String[] args) {
        IdenticalNode tree = new IdenticalNode();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(3);
        root3.right = new TreeNode(2);

        System.out.println("Tree1 and Tree2 identical? " + tree.isSame(root1, root2)); // true
        System.out.println("Tree1 and Tree3 identical? " + tree.isSame(root1, root3)); // false
    }
}
