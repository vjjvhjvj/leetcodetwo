package ikun;



public class IkunThree {
    long pre=Long.MIN_VALUE;


    public boolean isValidBST(TreeNode root) {
        if (root==null) {
            return false;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (root.val<=pre) {
            return false;
        }
        pre=root.val;
        return isValidBST(root.right);
    }
}
