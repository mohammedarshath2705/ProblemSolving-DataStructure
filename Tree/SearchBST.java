package Tree;
public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        }
        return searchBST(root.left, val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        SearchBST searchTree = new SearchBST();
        int value = 2;

        TreeNode result = searchTree.searchBST(root, value);

        if (result != null) {
            System.out.println("Node with value " + value + " found: " + result.val);
        } else {
            System.out.println("Node with value " + value + " not found in the BST.");
        }
    }
}
