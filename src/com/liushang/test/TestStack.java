package com.liushang.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author shang_liu
 * @Description
 * @WeChat liushang
 * @Date 2022/7/1 14:04
 */
public class TestStack {

    public static void main(String[] args) {
        //声明一个栈对象，并向内压入三个元素
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //判断是否为空栈
        System.out.println(stack.isEmpty());//输出：false
        // 使用peek()方法查询栈顶元素，使用pop()方法取出栈顶元素
        System.out.println(stack.peek());//输出：3
        System.out.println(stack.pop());//输出：3
        System.out.println(stack.peek());//输出：2
        System.out.println(stack.pop());//输出：2
        System.out.println(stack.peek());//输出：1
        System.out.println(stack.pop());//输出：1
        System.out.println(stack.isEmpty());//输出：true
    }
}
