package fact.tree.lca;

import java.util.Currency;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * Represents the Binary Search Tree.
 */

public class BinaryTree {

	// Refrence for the root of the tree.

	public Node root;

	public BinaryTree insert(int value) {

		Node node = new Node(value);

		if (root == null) {

			root = node;

			return this;

		}

		insertBFS(root, node);

		return this;

	}

	private void insertBFS(Node root, Node newNode) {
		Queue<Node> queue = new LinkedList<Node>();

		queue.add(root);
		while (!queue.isEmpty()) {
			Node currNode = queue.poll();

			if (currNode.left == null) {
				currNode.left = newNode;
				break;
			} else if (currNode.right == null) {
				currNode.right = newNode;
				break;
			}
			queue.add(currNode.left);
			queue.add(currNode.right);
		}
	}

	private void insertRec(Node latestRoot, Node node) {

		if (latestRoot.left == null) {

			latestRoot.left = node;

			return;

		} else if (latestRoot.right == null) {

			latestRoot.right = node;

			return;

		}

		insertRec(latestRoot.left, node);

		insertRec(latestRoot.right, node);

	}

	/**
	 * 
	 * Returns the minimum value in the Binary Search Tree.
	 */

	public int findMinimum() {

		if (root == null) {

			return 0;

		}

		Node currNode = root;

		while (currNode.left != null) {
			currNode = currNode.left;

		}

		return currNode.value;

	}

	/**
	 * 
	 * Returns the maximum value in the Binary Search Tree
	 */

	public int findMaximum() {

		if (root == null) {

			return 0;

		}

		Node currNode = root;

		while (currNode.right != null) {

			currNode = currNode.right;

		}

		return currNode.value;

	}

	/**
	 * 
	 * Printing the contents of the tree in an inorder way.
	 */

	public void printInorder() {

		printInOrderRec(root);

		System.out.println("");

	}

	/**
	 * 
	 * Helper method to recursively print the contents in an inorder way
	 */

	private void printInOrderRec(Node currRoot) {

		if (currRoot == null) {

			return;

		}

		printInOrderRec(currRoot.left);

		System.out.print(currRoot.value + ", ");

		printInOrderRec(currRoot.right);

	}

	/**
	 * 
	 * Printing the contents of the tree in a Preorder way.
	 */

	public void printPreorder() {

		printPreOrderRec(root);

		System.out.println("");

	}

	/**
	 * 
	 * Helper method to recursively print the contents in a Preorder way
	 */

	private void printPreOrderRec(Node currRoot) {

		if (currRoot == null) {

			return;

		}

		System.out.print(currRoot.value + ", ");

		printPreOrderRec(currRoot.left);

		printPreOrderRec(currRoot.right);

	}

	/**
	 * 
	 * Printing the contents of the tree in a Postorder way.
	 */

	public void printPostorder() {

		printPostOrderRec(root);

		System.out.println("");

	}

	/**
	 * 
	 * Helper method to recursively print the contents in a Postorder way
	 */

	private void printPostOrderRec(Node currRoot) {

		if (currRoot == null) {

			return;

		}

		printPostOrderRec(currRoot.left);

		printPostOrderRec(currRoot.right);

		System.out.print(currRoot.value + ", ");

	}

}
