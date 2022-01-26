package com.jikong.alg.structure.graph.list;

import com.jikong.alg.structure.graph.Point;

/**
 * 邻接表
 *
 * @author chengjunchao
 * @version 1.0.0
 * @date 2022/1/20 11:27
 */
public class Main {
    public static void main(String[] args) {
        GraphAdjList graphAdjList = new GraphAdjList();
        // 录入点
        EdgeNode edgeNode0 = new EdgeNode(2, 9);
        EdgeNode edgeNode01 = new EdgeNode(4, 2);
        edgeNode0.next = edgeNode01;
        VexNode vexNode0 = new VexNode(new Point("武汉"), edgeNode0, 0);

        EdgeNode edgeNode1 = new EdgeNode(2, 2);
        EdgeNode edgeNode11 = new EdgeNode(3, 5);
        EdgeNode edgeNode12 = new EdgeNode(4, 3);
        EdgeNode edgeNode13 = new EdgeNode(5, 4);
        edgeNode1.next = edgeNode11;
        edgeNode11.next = edgeNode12;
        edgeNode12.next = edgeNode13;
        VexNode vexNode1 = new VexNode(new Point("上海"), edgeNode1, 1);

        EdgeNode edgeNode2 = new EdgeNode(0, 9);
        EdgeNode edgeNode21 = new EdgeNode(1, 2);
        EdgeNode edgeNode22 = new EdgeNode(3, 2);
        edgeNode2.next = edgeNode21;
        edgeNode21.next = edgeNode22;
        VexNode vexNode2 = new VexNode(new Point("长沙"), edgeNode2, 2);

        EdgeNode edgeNode3 = new EdgeNode(1, 5);
        EdgeNode edgeNode31 = new EdgeNode(2, 2);
        EdgeNode edgeNode32 = new EdgeNode(5, 8);
        edgeNode3.next = edgeNode31;
        edgeNode31.next = edgeNode32;
        VexNode vexNode3 = new VexNode(new Point("南京"), edgeNode3, 3);

        EdgeNode edgeNode4 = new EdgeNode(0, 2);
        EdgeNode edgeNode41 = new EdgeNode(1, 3);
        EdgeNode edgeNode42 = new EdgeNode(5, 6);
        edgeNode4.next = edgeNode41;
        edgeNode41.next = edgeNode42;
        VexNode vexNode4 = new VexNode(new Point("成都"), edgeNode4, 4);

        EdgeNode edgeNode5 = new EdgeNode(1, 4);
        EdgeNode edgeNode51 = new EdgeNode(3, 8);
        EdgeNode edgeNode52 = new EdgeNode(4, 6);
        edgeNode5.next = edgeNode51;
        edgeNode51.next = edgeNode52;
        VexNode vexNode5 = new VexNode(new Point("广州"), edgeNode5, 5);

        VexNode[] vexNodes = new VexNode[]{vexNode0, vexNode1, vexNode2, vexNode3, vexNode4, vexNode5};
        graphAdjList.isVisited = new boolean[]{false, false, false, false, false, false};
        graphAdjList.vexNodes = vexNodes;
        graphAdjList.depthFirstSearch();
        System.out.println("-----------------------");
        graphAdjList.breadFirstSearch();
    }
}
