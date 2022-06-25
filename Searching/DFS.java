package Searching;

import java.util.ArrayList;

import Graphs.UndirectedGraph;
import Stack.StackSLL;

public class DFS {
    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph();

        // VERTICES
        // int vertices[] = {0,1,2,3,4,5,6,7};
        int vertices[] = {0,1,2,3,4};

        graph.addVertices(vertices);
        final int weight = 1;
        
        // EDGES
        // graph.addEdge(0, 1, weight);
        // graph.addEdge(0, 3, weight);
        // graph.addEdge(1, 4, weight);
        // graph.addEdge(2, 7, weight);
        // graph.addEdge(2, 4, weight);
        // graph.addEdge(3, 5, weight);
        // graph.addEdge(4, 5, weight);
        // graph.addEdge(5, 6, weight);
        // graph.addEdge(6, 7, weight);
        
        graph.addEdge(0, 1, weight);
        graph.addEdge(1, 4, weight);
        graph.addEdge(1, 2, weight);
        graph.addEdge(2, 3, weight);
        graph.addEdge(3, 0, weight);

        graph.visualise();

        StackSLL stack = new StackSLL();
        ArrayList<Integer> path = new ArrayList<>();
        traversal (graph, 0, stack, path);

        for (int i: path) {
            System.out.print(i + " ");
        }
    }

    private static void traversal(UndirectedGraph graph, int root, StackSLL stack, ArrayList<Integer> visited) {
        if (!visited.contains(root)) {
            visited.add(root);
            stack.push(root);
            for (int i: graph.getNeighbours(root)) {
                traversal (graph, i, stack, visited);
            }
            stack.pop();
        }
    }
}
