public class LinkedListt {
    public static LinkedListNode head;
    public static class LinkedListNode {
        int data;
        LinkedListNode next;

        LinkedListNode(int d) {
            this.data = d;
            next = null;
        }
    }
    public static void add_node_end(int d){
        if(head == null){
            head = new LinkedListNode(d);
        }
        else
        {
            LinkedListNode new_node = new LinkedListNode(d);
            LinkedListNode cursor = head;
            while(cursor.next!=null)
                cursor = cursor.next;
            cursor.next = new_node;
        }
    }

    public static void add_node_start(int d){
        if(head == null){
            head = new LinkedListNode(d);
        }
        else
        {
            LinkedListNode new_node = new LinkedListNode(d);
            new_node.next = head;
            head = new_node;
        }
    }

    public static void add_node_at_index(int d, int index){
        if(head==null)
            head = new LinkedListNode(d);
        else{
            int i=0;
            LinkedListNode new_node = new LinkedListNode(d);
            LinkedListNode cursor = head;
            while(cursor.next!=null && i<index-1) {
                cursor = cursor.next;
                i++;
            }
            new_node.next = cursor.next;
            cursor.next = new_node;

        }
    }

    public static void delete_node(int d){
        LinkedListNode cursor = head;
        if(head.data == d) {
            head = head.next;
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

    public static void print_linked_list()
    {
        LinkedListNode cursor = head;
        System.out.println("******************************");
        while(cursor!=null){
            System.out.println(cursor.data);
            cursor = cursor.next;
        }
    }

    public static void reverse_linked_list()
    {
        LinkedListNode prev = null, next = null,cursor = head;
        while(cursor!=null){
            next = cursor.next;
            cursor.next = prev;
            prev = cursor;
            cursor = next;
        }
        head = prev;
    }
    public static boolean swap_nodes(int x, int y) {
        LinkedListNode xnode = null, ynode = null, cursor = head;
        LinkedListNode xprev = null, yprev = null;
        Boolean x_head = false, y_head = false;
        if (x == head.data) {
            xprev = null;
            xnode = head;
            x_head = true;
        }
        else if (y == head.data) {
            yprev = null;
            ynode = head;
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
                head = ynode;
            if(y_head)
                head = xnode;
            return true;
        } else {
            return false;
        }

    }
}
