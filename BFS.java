import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static  void bfs(int[][] adjMatrix,int start){
    Queue<Integer> queue=new LinkedList<><>();
    boolean[] visited=new boolean[adjMatrix.length];
    visited[start]=true;
    queue.add(start);
    while(!queue.isEmpty())
    {
        int curr=queue.remove();
        System.err.println(curr+" ");
        for(int i=0;i<adjMatrix.length;i++)
        {
            if(adjMatrix[curr][i]==1 && !visited[i])
            {
                visited[i]=true;
                queue.add(i);
            }
        }
    }
}
static void addEdge(int[][] adjMarix,int u,int v)
{
    adjMarix[u][v]=1;
    adjMarix[v][u]=1;
}
    public static void main(String[] args) 
    {
        int n=6;
        int[][] adiMAtrix=new int[n][n];
        addEdge(adjMarix,0,1);
        addEdge(adjMarix,0,2);
        addEdge(adjMarix,1,0);
        addEdge(adjMarix,1,3);
        addEdge(adjMarix,1,4);
        addEdge(adjMarix,2,4);
        addEdge(adjMarix,2,1);
        addEdge(adjMarix,3,1);
        

    }
}
