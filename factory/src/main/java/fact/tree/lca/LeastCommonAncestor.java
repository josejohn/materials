package fact.tree.lca;

public class LeastCommonAncestor {

	
	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(1).insert(2).insert(3).insert(4).insert(5).insert(6).insert(7);
//		LeastCommonAncestor ancestor = new LeastCommonAncestor();
//		binaryTree.printInorder();
//		
////		Node lca = ancestor.findLca(binaryTree.root, 4, 6);
//		Node lca = ancestor.findLowestCommonAncestor(binaryTree.root, 6, 4);
//		
//		System.out.println(lca.value);
		
		/* Create a sample Binary Tree. A Binary tree does not have to maintain
         * left <root < right relationship.
         */
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(4);
//        root.left.left = new Node(6);
//        root.left.right = new Node(5);
// 
//        root.right.left = new Node(9);
//        root.right.right = new Node(11);
//        root.right.right.left = new Node(7);
//        root.right.right.right = new Node(3);
 
		Node root = binaryTree.root;
		binaryTree.printInorder();
		binaryTree.printPostorder();
		binaryTree.printPreorder();
        System.out.println("Lowest Common Ancestor of Node 3 and 9 is: "
                + findLowestCommonAncestor(root, 4, 5).value);
         
        System.out.println("Lowest Common Ancestor of Node 3 and null is: "
                + findLowestCommonAncestor(root, 3, 0).value);
         
        System.out.println("Lowest Common Ancestor of Node 11 and null is: "
                + findLowestCommonAncestor(root, 3, 0).value);
 
	}
	
	/*
	 * need a binary search tree
	 */
	public Node findLca(Node node, int t1, int t2) {
	    if(node == null) {
	        return null;
	    }
	    if(node.value > t2 && node.value > t1) {
	        // both targets are left
	        return findLca(node.left, t1, t2);
	    } else if (node.value < t2 && node.value < t1) {
	        // both targets are right
	        return findLca(node.right, t1, t2);
	    } else {
	        // either we are diverging or both targets are equal
	        // in both cases so we've found the LCA
	        // check for actual existence of targets here, if you like
	        return node;
	    }
	}
	
	public static Node findLowestCommonAncestor(Node root, int a, int b) {
		 
        Node left = null;
        Node right = null;
 
        if (root == null) {
            return null;
        }
 
        /**
         * If Node a or Node b is also the root, then the root itself is lowest common ancestor
         */
        if (root.value == a || root.value == b) {
            return root;
        }
 
        left = findLowestCommonAncestor(root.left, a, b);
        right = findLowestCommonAncestor(root.right, a, b);
 
        /**
         * If Node a and Node b lie in the left, their Lowest Common Ancestor is in the left.
         * If Node a and Node b lie in the right,their Lowest Common Ancestor is in the right.
         *
         * Otherwise, root is the Lowest common ancestor.
         */
        if (left != null && right != null) {
            return root;
        }
 
        return (left != null) ? left : right;
    }


}
