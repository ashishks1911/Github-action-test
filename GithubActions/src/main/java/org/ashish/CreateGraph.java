package org.ashish;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Breadth First Search (BFS)
 *  -It is a graph traversal algorithm .
 *  -It visits all the vertices of a graph in breadth-first order.
 *  -It starts at a given vertex and explores the neighbouring vertices
 *  before moving to the next level of vertices.
 */

public class CreateGraph {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Vertices :");
        int vertex = sc.nextInt();

        //create graph with specified number of vertices...
        ArrayList<Edge> graph[] = new ArrayList[vertex];

        //initialize the graph to avoid NullPointerException
        for (int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        for (int i=0;i<vertex;i++){
            System.out.println("Enter the No. of Neighbours of : "+i);
            int nos = sc.nextInt();
            for (int k=0;k<nos;k++){
                System.out.println("Enter Vertex of Neighbours (one by one)");
                int no =sc.nextInt();
                graph[i].add(new Edge(k,no));
                System.out.println("Added");
            }
        }

        System.out.println("_________Graph Created________");

        int p =567;
        System.out.println("FDFF");
    }
}