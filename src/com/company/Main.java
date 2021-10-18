package com.company;

public class Main {

    public static void main(String[] args) {
        matrixgraph thisgraph = new matrixgraph(7);
        thisgraph.addEdge(0,1,1);
        thisgraph.addEdge(0,2,5);
        thisgraph.addEdge(0,4,3);
        thisgraph.addEdge(1,4,1);
        thisgraph.addEdge(1,5,7);
        thisgraph.addEdge(2,3,1);
        thisgraph.addEdge(3,4,1);
        thisgraph.addEdge(3,6,1);
        thisgraph.addEdge(4,2,1);
        thisgraph.addEdge(4,3,3);
        thisgraph.addEdge(4,5,3);
        thisgraph.addEdge(4,6,4);
        thisgraph.addEdge(5,6,1);
        thisgraph.printgraph();
    }
}
