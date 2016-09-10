package com.company.BetterProgrammerTask;

/**
 * Created by Denis on 10.09.2016.
 */
public class BetterProgrammerTask {

    // Please do not change this interface
    interface ListNode {
        int getItem();
        ListNode getNext();
        void setNext(ListNode next);
    }

    public static ListNode reverse(ListNode node) {
        /*
          Please implement this method to
          reverse a given linked list.
         */

        if (node == null) {
            return null;
        }
        if (node.getNext() == null) {
            return node;
        }

        ListNode second = node.getNext();
        node.setNext(null);
        ListNode reverse = reverse(second);
        reverse.setNext(node);
        return reverse;
    }
}
