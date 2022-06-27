package com.liushang.structure;

/**
 * @author shang_liu
 * @Description
 * @WeChat liushang
 * @Date 2022/6/27 16:58
 */
public class ListNode {

    int val;

    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {
    }

    public static ListNode createTestData() {
        ListNode firstNode = new ListNode(0);
        ListNode curNode = firstNode;
        for (int i = 1; i < 10; i++) {
            ListNode node = new ListNode(i);
            curNode.next = node;
            curNode = node;
        }
        return firstNode;
    }

    public static void print(ListNode listNode) {
        if (listNode == null) {
            System.out.println("null");
            return;
        }
        StringBuilder str = new StringBuilder("[" + String.valueOf(listNode.val));
        ListNode next = listNode.next;
        while (next != null) {
            str.append(",").append(String.valueOf(next.val));
            next = next.next;
        }
        System.out.println(str.append("]"));
    }
}
