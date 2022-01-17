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
//        graphAdjMatrix.vexs = new Point[]{new Point("a"), new Point("b"), new Point("c"), new Point("d")};
//        graphAdjMatrix.isVisited = new boolean[]{false, false, false, false, false};
//        graphAdjMatrix.edges = new int[graphAdjMatrix.vexs.length][graphAdjMatrix.vexs.length];
//        graphAdjMatrix.insertEdge(0, 0, 0);
//        graphAdjMatrix.insertEdge(0, 1, 1);
//        graphAdjMatrix.insertEdge(0, 2, 1);
//        graphAdjMatrix.insertEdge(0, 3, 1);
//
//        graphAdjMatrix.insertEdge(1, 0, 1);
//        graphAdjMatrix.insertEdge(1, 1, 0);
//        graphAdjMatrix.insertEdge(1, 2, 1);
//        graphAdjMatrix.insertEdge(1, 3, 0);
//
//        graphAdjMatrix.insertEdge(2, 0, 1);
//        graphAdjMatrix.insertEdge(2, 1, 1);
//        graphAdjMatrix.insertEdge(2, 2, 0);
//        graphAdjMatrix.insertEdge(2, 3, 0);
//
//        graphAdjMatrix.insertEdge(3, 0, 1);
//        graphAdjMatrix.insertEdge(3, 1, 0);
//        graphAdjMatrix.insertEdge(3, 2, 0);
//        graphAdjMatrix.insertEdge(3, 3, 0);
//        graphAdjMatrix.depthFirstSearch();
//        graphAdjMatrix.breadFirstSearch();

        // 最短路径优先
        graphAdjMatrix.vexs = new Point[]{new Point("武汉"), new Point("上海"), new Point("长沙"), new Point("南京"), new Point("成都"), new Point("广州")};
        graphAdjMatrix.isVisited = new boolean[]{false, false, false, false, false, false};
        graphAdjMatrix.edges = new int[graphAdjMatrix.vexs.length][graphAdjMatrix.vexs.length];
        graphAdjMatrix.insertEdge(0, 0, 0);
        graphAdjMatrix.insertEdge(0, 1, 0);
        graphAdjMatrix.insertEdge(0, 2, 9);
        graphAdjMatrix.insertEdge(0, 3, 0);
        graphAdjMatrix.insertEdge(0, 4, 2);
        graphAdjMatrix.insertEdge(0, 5, 0);

        graphAdjMatrix.insertEdge(1, 0, 0);
        graphAdjMatrix.insertEdge(1, 1, 0);
        graphAdjMatrix.insertEdge(1, 2, 2);
        graphAdjMatrix.insertEdge(1, 3, 5);
        graphAdjMatrix.insertEdge(1, 4, 3);
        graphAdjMatrix.insertEdge(1, 5, 4);

        graphAdjMatrix.insertEdge(2, 0, 9);
        graphAdjMatrix.insertEdge(2, 1, 2);
        graphAdjMatrix.insertEdge(2, 2, 0);
        graphAdjMatrix.insertEdge(2, 3, 2);
        graphAdjMatrix.insertEdge(2, 4, 0);
        graphAdjMatrix.insertEdge(2, 5, 0);

        graphAdjMatrix.insertEdge(3, 0, 0);
        graphAdjMatrix.insertEdge(3, 1, 5);
        graphAdjMatrix.insertEdge(3, 2, 2);
        graphAdjMatrix.insertEdge(3, 3, 0);
        graphAdjMatrix.insertEdge(3, 4, 0);
        graphAdjMatrix.insertEdge(3, 5, 8);

        graphAdjMatrix.insertEdge(4, 0, 2);
        graphAdjMatrix.insertEdge(4, 1, 3);
        graphAdjMatrix.insertEdge(4, 2, 0);
        graphAdjMatrix.insertEdge(4, 3, 0);
        graphAdjMatrix.insertEdge(4, 4, 0);
        graphAdjMatrix.insertEdge(4, 5, 6);

        graphAdjMatrix.insertEdge(5, 0, 0);
        graphAdjMatrix.insertEdge(5, 1, 4);
        graphAdjMatrix.insertEdge(5, 2, 0);
        graphAdjMatrix.insertEdge(5, 3, 8);
        graphAdjMatrix.insertEdge(5, 4, 6);
        graphAdjMatrix.insertEdge(5, 5, 0);

        // 上海 到 各地的最短路径

    }
}
