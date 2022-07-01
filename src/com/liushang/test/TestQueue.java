package com.liushang.test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author shang_liu
 * @Description
 * @WeChat liushang
 * @Date 2022/7/1 15:06
 */
public class TestQueue {

    public static void main(String[] args) {
        //声明一个队列
        Queue queue = new LinkedList();
        //先向队列中添加五个元素
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        //移除并返回队列头部的元素
        System.out.println(queue.remove());//输出：1
        // 返回队列头部的元素
        System.out.println(queue.element());//输出：2
        // 添加一个元素并返回true，如果队列已满则返回false
        System.out.println(queue.offer(6));//输出：true
        // 返回队列头部的元素
        System.out.println(queue.peek());//输出：2
        // 返问并移除队列头部的元素
        System.out.println(queue.poll());//输出：2
        System.out.println(queue.poll());//输出：3
        System.out.println(queue.poll());//输出：4
        System.out.println(queue.poll());//输出：5
        System.out.println(queue.poll());//输出：6
    }

}
