package com.company;


public class matrixgraph{
    int[][] matrixedgegraph;
    int[][] matrixweightgraph;

    matrixgraph(int vertices){
        matrixedgegraph=new int[vertices][vertices];
        matrixweightgraph=new int[vertices][vertices];      //constructor
    }

    public void addEdge(int from, int to, int weight)
    {
        matrixedgegraph[from][to]=1;
        matrixweightgraph[from][to]=weight;
    }

    public void printgraph(){
        for(int fromi=0;fromi< matrixedgegraph.length;fromi++){
            System.out.println("Edges from vertex" + fromi);
            for (int toj = 0; toj < matrixedgegraph.length; toj++) {
                if(matrixedgegraph[fromi][toj]==1)
                {
                    System.out.println(" To " + toj);
                    System.out.println(" weight " + matrixweightgraph[fromi][toj]);
                }
            }
            System.out.println("");
        }
    }
}