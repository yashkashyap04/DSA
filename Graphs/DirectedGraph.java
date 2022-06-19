package Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class DirectedGraph {
    protected HashMap<Integer, ArrayList<Edge>> graph;
    protected int numEdges;
    protected int numVertices;

    public DirectedGraph () {
        graph = new HashMap<>();
        numEdges = 0;
        numVertices = 0;
    }

    public void addEdge (int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);

        ArrayList<Edge> edges = graph.get(source);
        edges.add(edge);
        graph.put(source, edges);

        numEdges++;
    }

    public void addVertex (int source) {
        graph.put(source, new ArrayList<Edge>());
        numVertices++;
    }

    public void removeEdge (int source, int destination, int weight) {
        ArrayList<Edge> edges = graph.get(source);
        Edge toBeRemoved = null;
        for (Edge edge: edges) {
            if (edge.getSource() == source && edge.getNeighbour() == destination && edge.getWeight() == weight) {
                toBeRemoved = edge;
                break;
            }
        }
        edges.remove(toBeRemoved);
        graph.put(source, edges);
    }

    public int getNumEdges() {
        return numEdges;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void visualise () {
        for (int key: graph.keySet()) {
            System.out.print(key + " --> ");
            for (Edge edge: graph.get(key)) {
                System.out.print(edge.getNeighbour() + " ");
            }
            System.out.println();
        }
    }
}
