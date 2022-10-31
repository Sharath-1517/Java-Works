package dataStructures;
import java.util.*;
 
public class BreadthFirstSearch {
    // Function to perform breadth first search
    static void breadthFirstSearch(int[][] matrix, int source){
        boolean[] visited = new boolean[matrix.length];
        System.out.println("matrix length"+matrix.length);
        visited[source-1] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        System.out.println("The breadth first order is");
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            int x = queue.poll();
            int i;
            for(i=0; i<matrix.length;i++){
                if(matrix[x-1][i] == 1 && visited[i] == false){
                    queue.add(i+1);
                    visited[i] = true;
                }
            }
        }
    }
    // Function to read user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices,source;
        vertices = sc.nextInt();
        source = sc.nextInt();
        int[][] matrix = new int[vertices][vertices];
        int i,j;
        for(i=0; i<vertices; i++){
            for(j=0; j<vertices; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        breadthFirstSearch(matrix,source);
    }
}