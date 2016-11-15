package fact.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	public static void main(String[] args) {

		GraphNode n1 = new GraphNode(1);
        GraphNode n2 = new GraphNode(2);
        GraphNode n3 = new GraphNode(3);
        GraphNode n4 = new GraphNode(4);
        GraphNode n5 = new GraphNode(5);
        GraphNode n6 = new GraphNode(6);
        GraphNode n7 = new GraphNode(7);
        GraphNode n8 = new GraphNode(8);
        GraphNode n9 = new GraphNode(9);
        GraphNode n10 = new GraphNode(10);
        GraphNode n11 = new GraphNode(11);
        GraphNode n12 = new GraphNode(12);
        
        n1.setNeighbours(new GraphNode[]{n2,n3,n4});
        n2.setNeighbours(new GraphNode[]{n5,n6});
        n3.setNeighbours(new GraphNode[]{});
        n4.setNeighbours(new GraphNode[]{n7,n8});        
        n5.setNeighbours(new GraphNode[]{n9,n10});
        n6.setNeighbours(new GraphNode[]{});
        n7.setNeighbours(new GraphNode[]{n11, n12});
        n8.setNeighbours(new GraphNode[]{});
        n9.setNeighbours(new GraphNode[]{});
        n10.setNeighbours(new GraphNode[]{});
        n11.setNeighbours(new GraphNode[]{});
        n12.setNeighbours(new GraphNode[]{});
 
//        n1.setNeighbours(new GraphNode[] {n2, n4, n5});
//        n2.setNeighbours(new GraphNode[] {n1, n3, n4});
//        n3.setNeighbours(new GraphNode[] {n2, n4, n7});
//        n4.setNeighbours(new GraphNode[] {n1, n2, n3, n5, n6, n7});
//        n5.setNeighbours(new GraphNode[] {n1, n4, n6});
//        n6.setNeighbours(new GraphNode[] {n4, n5, n7});
//        n7.setNeighbours(new GraphNode[] {n3, n4, n6});
//        
        Graph graph = new Graph();
//        graph.BFS(n1);
        
//        graph.DFS(n1);
        graph.DFSRecursive(n1);
	}
	
	public void BFS(GraphNode node){
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		
		node.setVisited(true);
		queue.add(node);
		System.out.println(node.getValue());
		
		while(!queue.isEmpty()){
			GraphNode currNode = queue.poll();
			
			for(GraphNode neighbour: currNode.getNeighbours()){
				if(!neighbour.getVisited()){
					System.out.println(neighbour.getValue());
					queue.add(neighbour);
					neighbour.setVisited(true);
				}
			}
		}
	}
	
	public void DFS(GraphNode node){
		Stack<GraphNode> stack = new Stack<GraphNode>();
		
		stack.push(node);
		
		while(!stack.isEmpty()){
			GraphNode currNode = stack.pop();
			
			if(!currNode.getVisited()){
				System.out.println(currNode.getValue());
				currNode.setVisited(true);
				
				for(GraphNode neighbour: currNode.getNeighbours()){
					stack.push(neighbour);
				}
			}
		}
	}
	
	public void DFSRecursive(GraphNode node){
		
		System.out.println(node.getValue());
		if(node.getNeighbours().length ==0)
			return;
		else{
			for(GraphNode neighbour: node.getNeighbours()){
				DFSRecursive(neighbour);
			}
		}
	}
}
