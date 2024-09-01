package S2024;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/add-two-numbers/">add-two-numbers</a>
 */
public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 =
                new ListNode(2,
                        new ListNode(4,
                                new ListNode(3
                                )
                        )
                );
        ListNode l2 =
                new ListNode(5,
                        new ListNode(6,
                                new ListNode(4
                                )
                        )
                );


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }

    public static class ls extends ListNode {

        public List<Integer> sort() {
            List<Integer> sorted = sort(new ArrayList<>(), this);
            Collections.reverse(sorted);
            return sorted;
        }

        private List<Integer> sort(List<Integer> list, ListNode listNode) {
            if (next == null)
                return null;
            list.add(listNode.val);
            return sort(list, listNode.next);
        }

    }


    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
