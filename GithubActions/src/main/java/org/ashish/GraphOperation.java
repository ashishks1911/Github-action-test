package org.ashish;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Provide Operations to be performed on the Graph...
 */
public class GraphOperation {

    /**
     * Operation menu for user to be performed on graph
     * @param graph graph to be used to perform operation
     * @param totalVertex total number of vertices of the graph
     */
    public static void operation(ArrayList<Edge> graph[],int totalVertex) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("_________________________");
            System.out.println("Option 1 : Find Neighbours :");
            System.out.println("Option 2 : Traverse the Graph (BFS) :");
            System.out.println("Option 3 : Traverse the Graph (DFS) :");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter a Vertex to find its Neighbours :");
                    int vr = sc.nextInt();
                    findNeighbours(graph, vr);
                    break;

                case 2:
                    System.out.println("Enter Starting element : ");
                    int st = sc.nextInt();
                    GraphTraversal.BFS(graph, st, totalVertex);
                    break;

                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("Enter 'q' to exit :");
            choice = sc.next().charAt(0);
        } while (choice != 'q');
    }

    //finds neighbours of a particular node
    public static void findNeighbours(ArrayList<Edge> graph[],int vertex) {

        for(int i = 0;i<graph[vertex].size();i++) {
            System.out.print(graph[vertex].get(i).des+", ");
        }
    }
}
