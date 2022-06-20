package Searching;

import java.util.*;

import Graphs.*;
import Queue.*;

public class BFS {
    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph();
        int vertices[] = {0,1,2,3,4,5,6,7};
        graph.addVertices(vertices);
        final int weight = 1;
        graph.addEdge(0, 1, weight);
        graph.addEdge(0, 3, weight);
        graph.addEdge(1, 4, weight);
        graph.addEdge(2, 7, weight);
        graph.addEdge(2, 4, weight);
        graph.addEdge(3, 5, weight);
        graph.addEdge(4, 5, weight);
        graph.addEdge(5, 6, weight);
        graph.addEdge(6, 7, weight);

        graph.visualise();

        QueueSLL queue = new QueueSLL();
        ArrayList<Integer> path = new ArrayList<>();
        traversal (graph, 0, queue, path);

        for (int i: path) {
            System.out.print(i + " ");
        }
    }

    public static void traversal (UndirectedGraph graph, int root, QueueSLL vertices, ArrayList<Integer> visited) {
        vertices.enqueue(root);
        while (vertices.getSize() != 0) {
            for (int n: graph.getNeighbours(vertices.getFront().getData())) {
                if (!visited.contains(n) && !vertices.contains(n)) {
                    vertices.enqueue(n);
                }
            }
            visited.add(vertices.dequeue());
        }
    }
}
