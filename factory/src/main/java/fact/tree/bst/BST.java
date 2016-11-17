package fact.tree.bst;

import fact.tree.lca.Node;

public class BST {

  Node root;
  public static void main(String[] args) {

    BST bst = new BST();

    bst.root = bst.insert(null, new Node(4));
    bst.insert(bst.root, new Node(2));
    bst.insert(bst.root, new Node(6));
    bst.insert(bst.root, new Node(1));
    bst.insert(bst.root, new Node(3));
    bst.insert(bst.root, new Node(5));
    bst.insert(bst.root, new Node(7));


    System.out.print("inorder:");
    bst.inorder(bst.root);
    System.out.println();
    System.out.print("preorder:");
    bst.preorder(bst.root);
    System.out.println();
    System.out.print("postorder:");
    bst.postorder(bst.root);

    System.out.println();
    System.out.print("search:" +bst.search(bst.root, 5).value);

    System.out.println();
    bst.delete(bst.root, 4);
    System.out.print("inorder:");
    bst.inorder(bst.root);



  }

  private Node insert(Node root, Node newNode){
    if(root ==null)
      return newNode;

    if(root.value > newNode.value)
      root.left = insert(root.left, newNode);
    else if(root.value <newNode.value)
      root.right = insert(root.right, newNode);

    return root;
  }

  private Node delete(Node root, int value){
    if(root ==null)
      return null;
    else if(value > root.value)
      root.right = delete(root.right, value);
    else if(value < root.value)
      root.left = delete(root.left, value);
    else{
      if(root.left != null && root.right !=null){
        Node minNodeRight = minimum(root.right);
        root.value = minNodeRight.value;
        root.right = delete(root.right, minNodeRight.value);
      }else if(root.left !=null){
        root = root.left;
      }else if(root.right !=null){
        root= root.right;
      }else
        root = null;
    }

    return root;
  }

  private Node minimum(Node root){
    Node min=null;
    while(root !=null){
      min = root;
      root = root.left;
    }

    return min;
  }

  private Node search(Node root, int value){
    while(root !=null){
      if(root.value == value)
        return root;
      else if(value > root.value)
        root = root.right;
      else
        root = root.left;
    }

    return null;
  }

  private void inorder(Node root){
    if(root == null)
      return;

    inorder(root.left);
    System.out.print(" "+root.value);
    inorder(root.right);
  }

  private void postorder(Node root){
    if(root == null)
      return;

    postorder(root.left);
    postorder(root.right);
    System.out.print(" "+root.value);
  }

  private void preorder(Node root){
    if(root == null)
      return;

    System.out.print(" "+root.value);
    preorder(root.left);
    preorder(root.right);


  }
}
