package fact.tree.subtree;

import fact.tree.lca.Node;

public class FindSubTree {


  public static void main(String[] args) {
    Node main = new Node(10);
    main.left = new Node(8);
    main.right = new Node(2);
    main.left.left = new Node(3);
    main.left.right = new Node(5);
    main.right.left = new Node(2);


    Node sub = new Node(8);
    sub.left = new Node(3);
    sub.right = new Node(5);


    System.out.println(matchTree(main, sub));
  }

  private static boolean matchTree(Node big, Node sub){
    if(big == null )
      return false;
    else if(sub == null)
      return true;
    else if(big.value == sub.value){
      return match(big, sub);
    }else
      return matchTree(big.left, sub) || matchTree(big.right, sub);

  }

  private static boolean match(Node n1, Node n2){

    if(n1 == null && n2 == null)
      return true;
    else if(n1 == null || n2 == null)
      return false;
    else
      return (n1.value == n2.value) && match(n1.left, n2.left) && match(n1.right, n2.right);
  }
}
