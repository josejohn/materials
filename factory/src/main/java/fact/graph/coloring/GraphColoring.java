package fact.graph.coloring;

import java.util.Arrays;

public class GraphColoring {

  int graph[][] = {{1,1,0,1},
                   {1,1,1,1},
                   {0,1,1,1},
                   {1,1,1,1}};

  int colors[] = {1,2,3};

  int vColors[] = {0,0,0,0};


  public static void main(String[] args) {
    GraphColoring gc = new GraphColoring();

//    gc.colorGraph(0);

    gc.colorGraphItirative();

    System.out.println(Arrays.toString(gc.vColors));
  }

  public void colorGraph(int v){
    for(int i = 0; i< colors.length; i++ ){
      if(isSafe(v, colors[i])){
        vColors[v] = colors[i];

        if(v+1 < graph.length)
          colorGraph(v+1);
        else{
          System.out.println(Arrays.toString(vColors));
          return;
        }
      }
    }
  }

  public void colorGraphItirative(){
    int numVertices = graph.length;
    for(int i = 0; i < numVertices; i++){
      for(int j = 1; j<= colors.length; j++){
        if(isSafe(i,j)){
          vColors[i] = j;
          break;
        }
      }
    }
  }

  public boolean isSafe(int v, int c){
    for(int i = 0; i<graph.length; i++){
      if((graph[v][i] == 1) && (vColors[i] == c))
        return false;
    }

    return true;
  }
}
