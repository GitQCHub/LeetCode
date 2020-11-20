package node;

import javafx.util.Pair;
import list.ListNode;

import java.util.LinkedList;
import java.util.*;
import java.util.Queue;

public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}