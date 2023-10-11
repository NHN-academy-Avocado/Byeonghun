package programming.chapter11.dynamic_arrays;

import static programming.chapter11.dynamic_arrays.ListNode.*;

import java.util.List;

public class Exercise11p1 {
    public static void main(String[] args) {
        ListNode a = new ListNode("1");
        ListNode b = new ListNode("2");
        ListNode d = new ListNode("6");
        ListNode c = new ListNode("3", d);
        a.next = b;
        b.next = c;
        insertAfter(a, "1", "8");
        insertBefore(a, "2", "6");
        modify(a, "6" , "7");
        modifyAll(a, "6" , "7");
        ListNode copy = copy(a);
        System.out.println(length(a));
        printListNode(a);
        copy = invert(copy);
        printListNode(copy);
        System.out.println(search(a, b));
//        System.out.println(search(a, copy));

    }
}
class ListNode{
    String s;
    ListNode next;

    public ListNode(String s) {
        this.s = s;
    }
    public ListNode(){}

    public ListNode(String s, ListNode next) {
        this.s = s;
        this.next = next;
    }

    public static int length(ListNode lis) {
        int result = 0;
        while (lis != null){
            result++;
            lis = lis.next;
        }
        return result;
    }
    public static ListNode insertAfter(ListNode lis, String s, String given){
        ListNode p = lis;
        ListNode t = new ListNode(given);
        while (p != null ){
            if(p.s.equals(s)){
                t.next = p.next;
                p.next = t;
                break;
            }
            p = p.next;
        }
        return lis;
    }
    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode p = lis;
        while (p != null){
            if(p.s.equals(old)){
                p.s = ne;
                break;
            }
            p = p.next;
        }
        return lis;
    }
    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        ListNode p = lis;
        while (p != null){
            if(p.s.equals(old)){
                p.s = ne;
            }
            p = p.next;
        }
        return lis;
    }
    public static ListNode copy(ListNode lis) {
        ListNode result = new ListNode();
        ListNode tmp = result;
        while (lis != null) {
            tmp.next = new ListNode(lis.s);
            lis = lis.next;
            tmp = tmp.next;
        }
        return result.next;
    }
    public static ListNode insertBefore(ListNode lis, String s, String given){
        ListNode p = lis;
        ListNode t = new ListNode(given);
        while (p != null ){
            if(p.next.s.equals(s)){
                t.next = p.next;
                p.next = t;
                break;
            }
            p = p.next;
        }
        return lis;
    }
    public static ListNode deleteDoubles(ListNode lis) {
        lis.next = null;
        return lis;
    }
    public static ListNode invert(ListNode lis) {
        ListNode prev = null;
        ListNode current = lis;
        ListNode next = null;
        while (current != null) {
            next = current.next;      // 다음 노드 저장
            current.next = prev;      // 현재 노드의 next를 이전 노드로 변경
            prev = current;           // 이전 노드를 현재 노드로 업데이트
            current = next;           // 현재 노드를 다음 노드로 이동
        }
        lis = prev;
        return lis;
    }
    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        ListNode p = lis2;
        while (lis1 != null) {
            if(lis1.s.equals(p.s)){
                if(p.next == null) return true;
                p = p.next;
                lis1 = lis1.next;
            }else {
                p = lis2;
                lis1 = lis1.next;
            }
        }
        return false;
    }
    public static boolean search(ListNode l1, ListNode l2) {
        if(l2 == null) return true;
        if(l1 == null) return false;
        if(l1.s.equals(l2.s)){
            if(l2.next == null) return true;
            return search(l1.next, l2.next);
        }
        return search(l1.next, l2);
    }
    public static void printListNode(ListNode lis){
        while (lis != null){
            System.out.print(lis.s + " ");
            lis = lis.next;
        }
        System.out.println();
    }
}
