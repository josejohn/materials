package fact.graph;

public class GraphNode {

	int value;
	GraphNode[] neighbours;
	boolean visited;
	
	public GraphNode(int value) {
		 this.value=value;
		 this.visited = false;
	}
	
	public GraphNode[] getNeighbours() {
		return neighbours;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean getVisited() {
		return visited;
	}
	
	
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	
	
	public void setNeighbours(GraphNode[] neighbours) {
		this.neighbours = neighbours;
	}
	
}
