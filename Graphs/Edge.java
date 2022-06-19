package Graphs;

public class Edge {
    private int source;
    private int neighbour;
    private int weight;

    public Edge (int s, int n, int w) {
        source = s; neighbour = n; weight = w;
    }

    public int getSource() {
        return source;
    }

    public int getNeighbour() {
        return neighbour;
    }

    public int getWeight() {
        return weight;
    }
}
