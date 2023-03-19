package org.ashish;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Defines BFS and DFS algorithms for Graph Traversal.
 */
public final class GraphTraversal {

    /**
     *
     */
    private GraphTraversal() { }

    /**
     * BFS algorithm for graph traversal.
     * @param graph graph to be traversed
     * @param startIdx starting node for traversal
     * @param totalVertex total number of vertices of the graph
     *
     */
    public static void bfs(final ArrayList<Edge>[] graph,
                           final int startIdx, final int totalVertex) {
        Queue<Integer> queue = new LinkedList<>();

        //to track visited nodes
        boolean[] visited = new boolean[totalVertex];

        queue.add(startIdx);
        while (!queue.isEmpty()) {
            int curr = queue.remove();

            //checks if current node is visited or not
            if (!visited[curr]) {

                System.out.print(curr + ", ");
                //marks the node visited
                visited[curr] = true;
                //find its neighbours
                for (int i = 0; i < graph[curr].size(); i++) {
                    //adds all neighbours in the queue...
                    queue.add(graph[curr].get(i).des);
                }
            }
        }

    }


    /**
     * DFS algorithm for graph traversal.
     * @param graph graph to be traversed
     * @param start starting node for traversal
     * @param vertex total number of vertices of the graph
     */
    public static void dfs( final ArrayList<Edge>[] graph,
                            final int start, final int vertex){

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[vertex];
        stack.push(start);
        while (!stack.isEmpty()){
            int curr = stack.pop();
            if (!visited[curr]){

                System.out.print(curr + ", ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++){
                    stack.push(graph[curr].get(i).des);
                }
            }

        }
    }
}
