package tree;

import java.util.Stack;

public class PostOrder {

  public void postorderRecursive(TreeNode root) {
    if (root != null) {
      postorderRecursive(root.left);
      postorderRecursive(root.right);
      System.out.printf("%d ", root.data);
    }
  }

  public void postorderIterative(TreeNode root) {
    if (root == null) 
      return;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode current = root;
    
    while (current != null) {
      if (current.right != null)
        stack.push(current.right); 
      stack.push(current); 
      current = current.left;
    }
  }

}
