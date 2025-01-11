package Tree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == q) return true;
    if (p == null || q == null || p.val != q.val) return false;
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}

    public static void main(String[] args) {
        SameTree sameTree = new SameTree();

        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);
        p1.right = new TreeNode(3);

        TreeNode q1 = new TreeNode(1);
        q1.left = new TreeNode(2);
        q1.right = new TreeNode(3);

        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);

        TreeNode q2 = new TreeNode(1);
        q2.right = new TreeNode(2);

        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        p3.right = new TreeNode(1);

        TreeNode q3 = new TreeNode(1);
        q3.left = new TreeNode(1);
        q3.right = new TreeNode(2);

        System.out.println(sameTree.isSameTree(p1, q1)); // true
        System.out.println(sameTree.isSameTree(p2, q2)); // false
        System.out.println(sameTree.isSameTree(p3, q3)); // false
    }
}
