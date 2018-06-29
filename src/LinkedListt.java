import java.util.LinkedList;

public class LinkedListt {
    public LinkedListNode head;

    public LinkedListt(){
        this.head = null;
    }
    public class LinkedListNode {
        int data;
        LinkedListNode next;

        LinkedListNode(int d) {
            this.data = d;
            next = null;
        }
    }
    public void add_node_end(int d){
        if(this.head == null){
            this.head = new LinkedListNode(d);
        }
        else
        {
            LinkedListNode new_node = new LinkedListNode(d);
            LinkedListNode cursor = this.head;
            while(cursor.next!=null)
                cursor = cursor.next;
            cursor.next = new_node;
        }
    }

    public void add_node_start(int d){
        if(this.head == null){
            this.head = new LinkedListNode(d);
        }
        else
        {
            LinkedListNode new_node = new LinkedListNode(d);
            new_node.next = this.head;
            this.head = new_node;
        }
    }

    public void add_node_at_index(int d, int index){
        if(this.head==null)
            this.head = new LinkedListNode(d);
        else{
            int i=0;
            LinkedListNode new_node = new LinkedListNode(d);
            LinkedListNode cursor = this.head;
            while(cursor.next!=null && i<index-1) {
                cursor = cursor.next;
                i++;
            }
            new_node.next = cursor.next;
            cursor.next = new_node;

        }
    }

    public void delete_node(int d){
        LinkedListNode cursor = this.head;
        if(this.head.data == d) {
            this.head = this.head.next;
            return;
        }
        while(cursor.next!=null) {
            if (cursor.next.data == d)
                break;
            cursor = cursor.next;
        }
        if(cursor.next!=null){
            cursor.next = cursor.next.next;
        }
    }

    public void print_linked_list()
    {
        LinkedListNode cursor = this.head;
        System.out.println("******************************");
        while(cursor!=null){
            System.out.println(cursor.data);
            cursor = cursor.next;
        }
    }

    public void reverse_linked_list()
    {
        LinkedListNode prev = null, next = null,cursor = this.head;
        while(cursor!=null){
            next = cursor.next;
            cursor.next = prev;
            prev = cursor;
            cursor = next;
        }
        this.head = prev;
    }
    public boolean swap_nodes(int x, int y) {
        LinkedListNode xnode = null, ynode = null, cursor = this.head;
        LinkedListNode xprev = null, yprev = null;
        Boolean x_head = false, y_head = false;
        if (x == this.head.data) {
            xprev = null;
            xnode = this.head;
            x_head = true;
        }
        else if (y == this.head.data) {
            yprev = null;
            ynode = this.head;
            y_head = true;
        }
            while (cursor.next != null && (xnode == null || ynode == null)) {
                if (cursor.next.data == x) {
                    xnode = cursor.next;
                    xprev = cursor;
                }
                if (cursor.next.data == y) {
                    ynode = cursor.next;
                    yprev = cursor;
                }
                cursor = cursor.next;
            }

        if (xnode != null && ynode != null) {
            if(xprev != null)
                xprev.next = ynode;
            if(yprev !=null)
                yprev.next = xnode;
            LinkedListNode temp = ynode.next;
            ynode.next = xnode.next;
            xnode.next = temp;
            if(x_head)
                this.head = ynode;
            if(y_head)
                this.head = xnode;
            return true;
        } else {
            return false;
        }

    }

    public LinkedListNode merge_sorted_linkedlist(LinkedListNode ll1, LinkedListNode ll2)
    {
        LinkedListNode res = null;
        if(ll1 == null)
            return ll2;
        if(ll2 == null)
            return ll1;
        if(ll1.data<=ll2.data){
            res = ll1;
            res.next = merge_sorted_linkedlist(ll1.next, ll2);
        }
        else{
            res = ll2;
            res.next = merge_sorted_linkedlist(ll1, ll2.next);
        }
        return res;
    }
}
