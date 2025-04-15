class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderHelper(root, list);
        return list;
    }

    private void inorderHelper(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorderHelper(root.left, list);
        list.add(root.val);
        inorderHelper(root.right, list);
    }
}
