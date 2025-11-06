package Tree;

public class SymmetricTree {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return (a.val == b.val) && isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }

    boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public static void main(String[] args) {
        SymmetricTree st = new SymmetricTree();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);

        System.out.println("Tree1 symmetric? " + st.isSymmetric(root1)); // true


        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(3);

        System.out.println("Tree2 symmetric? " + st.isSymmetric(root2)); // false
    }
}
