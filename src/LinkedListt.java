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
        while(cursor!=null){
            System.out.println(cursor.data);
            cursor = cursor.next;
        }
    }
}
