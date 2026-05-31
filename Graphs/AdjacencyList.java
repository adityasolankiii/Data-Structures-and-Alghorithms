package Graphs;

import java.util.ArrayList;

public class AdjacencyList {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }


    public static void main(String[] args) {

        /*
        *           (5)
                0 ------- 1
                          /\
                      (1)/  \ (3)
                        /    \
                       /      \
                       2-------3
                       |  (1)
                       |
                       |(2)
                       |
                       |
                       4
        * */
        int V = 5;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        // Initialize adjacency lists
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges

        //0 vertex
        graph.get(0).add(new Edge(0, 1, 5));

        //1 vertex
        graph.get(1).add(new Edge(1, 0, 5));
        graph.get(1).add(new Edge(1, 2, 1));
        graph.get(1).add(new Edge(1, 3, 3));

        //2 vertex
        graph.get(2).add(new Edge(2, 1, 1));
        graph.get(2).add(new Edge(2, 3, 1));
        graph.get(2).add(new Edge(2, 4, 2));

        //3 vertex
        graph.get(3).add(new Edge(3, 1, 3));
        graph.get(3).add(new Edge(3, 2, 1));

        //4 vertex
        graph.get(4).add(new Edge(4, 2, 2));

        // Print graph
        for (int i = 0; i < graph.size(); i++) {
            System.out.print("Vertex " + i + " -> ");

            for (Edge e : graph.get(i)) {
                System.out.print("(" + e.dest + ", wt=" + e.wt + ") ");
            }

            System.out.println();
        }
    }
}