package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class UndirectedGraph {
    protected HashMap<Integer, ArrayList<Edge>> graph;
    protected int numEdges;
    protected int numVertices;

    public UndirectedGraph () {
        graph = new HashMap<>();
        numEdges = 0;
        numVertices = 0;
    }

    public void addEdge (int source, int destination, int weight) {
        Edge edge_s = new Edge(source, destination, weight);
        Edge edge_d = new Edge(destination, source, weight);

        ArrayList<Edge> edges_s = graph.get(source);
        edges_s.add(edge_s);
        graph.put(source, edges_s);

        ArrayList<Edge> edges_d = graph.get(destination);
        edges_d.add(edge_d);
        graph.put(destination, edges_d);

        numEdges++;
    }

    public void addVertex (int source) {
        graph.put(source, new ArrayList<Edge>());
        numVertices++;
    }

    public void addVertices (int [] arraySource) {
        for (int s: arraySource) {
            this.addVertex(s);
        }
    }

    public void removeEdge (int source, int destination, int weight) {
        ArrayList<Edge> edges_s = graph.get(source);
        ArrayList<Edge> edges_d = graph.get(destination);

        Edge toBeRemoved_s = null;
        Edge toBeRemoved_d = null;

        for (Edge edge: edges_s) {
            if (edge.getSource() == source && edge.getDestination() == destination && edge.getWeight() == weight) {
                toBeRemoved_s = edge;
                break;
            }
        }

        for (Edge edge: edges_d) {
            if (edge.getSource() == destination && edge.getDestination() == source && edge.getWeight() == weight) {
                toBeRemoved_d = edge;
                break;
            }
        }

        edges_s.remove(toBeRemoved_s);
        graph.put(source, edges_s);

        edges_d.remove(toBeRemoved_d);
        graph.put(destination, edges_d);
    }

    public int getNumEdges () {
        return numEdges;
    }

    public int getNumVertices () {
        return numVertices;
    }

    public Set<Integer> getVertices () {
        return graph.keySet();
    }

    public void visualise () {
        for (int key: graph.keySet()) {
            System.out.print(key + " --> ");
            for (Edge edge: graph.get(key)) {
                System.out.print(edge.getDestination() + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<Integer> getNeighbours (int vertex) {
        ArrayList<Integer> neighbours = new ArrayList<>();
        for (Edge e: graph.get(vertex))
            neighbours.add(e.getDestination());
        return neighbours;
    }
}
