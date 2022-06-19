package Graphs;

import java.util.Scanner;

public class UseDirectedGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DirectedGraph graph = new DirectedGraph();
        int choice;

        do {
            System.out.println("MENU:");
            System.out.println("1. ADD VERTEX");
            System.out.println("2. ADD EDGE");
            System.out.println("3. REMOVE EDGE");
            System.out.println("4. VISUALISE");

            System.out.println("ENTER CHOICE: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1: {
                    System.out.println("Vertex Number: ");
                    graph.addVertex(scanner.nextInt());
                }; break;
                case 2: {
                    System.out.println("Source: ");
                    int source = scanner.nextInt();
                    System.out.println("Destination: ");
                    int destination = scanner.nextInt();
                    System.out.println("Weight: ");
                    int weight = scanner.nextInt();
                    graph.addEdge(source, destination, weight);
                }; break;
                case 3: {
                    System.out.println("Source: ");
                    int source = scanner.nextInt();
                    System.out.println("Destination: ");
                    int destination = scanner.nextInt();
                    System.out.println("Weight: ");
                    int weight = scanner.nextInt();
                    graph.removeEdge(source, destination, weight);
                }; break;
                case 4: {
                    graph.visualise();
                }
            }
        } while (choice >= 1 && choice <= 4);
        scanner.close();
    }
}
