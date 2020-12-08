package com.jikong.design.structural.flyweight;

import java.util.Vector;

/**
 * @author chengjunchao
 * @title: ConnectionPool
 * @projectName algorithm-java
 * @description: 连接池
 * @date 2020/12/8 17:19
 */
public class ConnectionPool {
    private Vector<Connection> pool;
    private int poolSize = 100;

    private static ConnectionPool instance = null;
    Connection conn = null;

    /**
     * 构造方法，做一些初始化工作
     */
    private ConnectionPool() {
        pool = new Vector<Connection>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            try {
                conn = new Connection();
                pool.add(conn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 放回
     */
    public synchronized void release() {
        pool.add(conn);
    }

    /**
     * 使用
     *
     * @return
     */
    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        } else {
            return null;
        }
    }
}
