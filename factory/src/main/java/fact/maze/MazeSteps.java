package fact.maze;

public class MazeSteps {

  public static void main(String[] args) {

    int [][]maze={{1,0,0,0}, {1,1,1,1},{0,0,0,1},{0,0,0,1}};
    int visited[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    int steps = findSteps(maze, 3, 3, 3, 3, visited);

    System.out.println(steps);


  }

  public static int findSteps(int [][]maze, int i,int j, int rows, int cols,int visited[][]){
    if(i>rows || j>cols){
      return 0;
    }else if(i<0 || j<0){
      return 0;
    }else if(maze[i][j] == 0){
      visited[i][j] = 1;
      return 0;
    }else if(visited[i][j] == 1){
       return 0;
    }else {//if(visited[i][j] == 0){
      visited[i][j] = 1;
      return 1+ max(findSteps(maze, i-1, j, rows, cols,visited),
          findSteps(maze, i, j-1, rows, cols,visited),
          findSteps(maze, i, j+1, rows, cols,visited),
          findSteps(maze, i+1, j, rows, cols,visited)
          );
    }

//    return 0;
  }

  public static int max(int i, int j, int k, int l){
    int max = 0;
    if(i>j)
      max = i;
    else
      max = j;

    if(k>max)
      max = k;

    if(l>max)
      max = k;

    return max;
  }
}
