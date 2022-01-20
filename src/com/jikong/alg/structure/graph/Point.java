package com.jikong.alg.structure.graph;

/**
 * 矩阵
 *
 * @author chengjunchao
 * @version 1.0.0
 * @date 2022/1/12 16:46
 */
public class Point {
    public String name;

    public Point() {
    }

    public Point(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            return this.name == ((Point) obj).name;
        } else {
            return super.equals(obj);
        }
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = this.name.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
