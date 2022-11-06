package dataStructures;
import java.util.*;
 
public class DepthFirstSearch {
    // Function to perform depth first search
    static void depthFirstSearch(int[][] matrix, int source){
        boolean[] visited = new boolean[matrix.length];
        visited[source-1] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        int i,x;
        System.out.println("The depth first order is");
        System.out.println(source);
        while(!stack.isEmpty()){
            x = stack.pop();
            for(i=0; i<matrix.length; i++){
                if(matrix[x-1][i] == 1 && visited[i] == false){
                    stack.push(x);
                    visited[i] = true;
                    System.out.println(i+1);
                    x = i+1;
                    i = -1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices,source;
        System.out.println("Enter the number of vertices in the graph");
        vertices = sc.nextInt();
        System.out.println("Enter the source vertex");
        source = sc.nextInt();
        int[][] matrix = new int[vertices][vertices];
        System.out.println("Enter the adjacency matrix");
        int i,j;
        for(i=0; i<vertices; i++){
            for(j=0; j<vertices; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        depthFirstSearch(matrix,source);
    }
}