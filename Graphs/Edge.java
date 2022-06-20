package Graphs;

public class Edge {
    private int source;
    private int destination;
    private int weight;

    public Edge (int s, int d, int w) {
        source = s; destination = d; weight = w;
    }

    public int getSource() {
        return source;
    }

    public int getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
}
