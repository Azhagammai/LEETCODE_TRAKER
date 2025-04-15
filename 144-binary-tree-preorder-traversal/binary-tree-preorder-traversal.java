class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);                      // Visit root
        preorderHelper(node.left, result);         // Visit left
        preorderHelper(node.right, result);        // Visit right
    }
}
