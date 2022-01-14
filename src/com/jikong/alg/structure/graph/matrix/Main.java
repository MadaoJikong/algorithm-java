package com.jikong.alg.structure.graph.matrix;

/**
 * main
 *
 * @author chengjunchao
 * @version 1.0.0
 * @date 2022/1/14 10:58
 */
public class Main {
    public static void main(String[] args) {
        // write your code here
        GraphAdjMatrix graphAdjMatrix = new GraphAdjMatrix();
        graphAdjMatrix.vexs = new Point[]{new Point("a"), new Point("b"), new Point("c"), new Point("d")};
        graphAdjMatrix.isVisited = new boolean[]{false, false, false, false, false};
        graphAdjMatrix.edges = new int[graphAdjMatrix.vexs.length][graphAdjMatrix.vexs.length];
        graphAdjMatrix.insertEdge(0, 0, 0);
        graphAdjMatrix.insertEdge(0, 1, 1);
        graphAdjMatrix.insertEdge(0, 2, 1);
        graphAdjMatrix.insertEdge(0, 3, 1);

        graphAdjMatrix.insertEdge(1, 0, 1);
        graphAdjMatrix.insertEdge(1, 1, 0);
        graphAdjMatrix.insertEdge(1, 2, 1);
        graphAdjMatrix.insertEdge(1, 3, 0);

        graphAdjMatrix.insertEdge(2, 0, 1);
        graphAdjMatrix.insertEdge(2, 1, 1);
        graphAdjMatrix.insertEdge(2, 2, 0);
        graphAdjMatrix.insertEdge(2, 3, 0);

        graphAdjMatrix.insertEdge(3, 0, 1);
        graphAdjMatrix.insertEdge(3, 1, 0);
        graphAdjMatrix.insertEdge(3, 2, 0);
        graphAdjMatrix.insertEdge(3, 3, 0);
        //graphAdjMatrix.depthFirstSearch();
        graphAdjMatrix.breadFirstSearch();
    }
}
