public class implementation {
    public static void main(String args[]) {
        linked_list_implementation();
    }

    public static void linked_list_implementation(){
        LinkedListt LinkedList1 = new LinkedListt();
        System.out.println("please insert number of data for the linkedlist:");
        int[] inp_arr = {1,3,5,6,10};
        for(int i=0;i<inp_arr.length;i++)
        {
            LinkedList1.add_node_end(inp_arr[i]);
        }

        LinkedListt LinkedList2 = new LinkedListt();
        System.out.println("please insert number of data for the linkedlist:");
        int[] inp_arr2 = {2,4,6,8,11};
        for(int i=0;i<inp_arr2.length;i++)
        {
            LinkedList2.add_node_end(inp_arr2[i]);
        }
        LinkedList1.add_node_start(10);
        LinkedList1.add_node_at_index(20,3);
        LinkedList1.print_linked_list();
        LinkedList1.delete_node(4);
        LinkedList1.print_linked_list();
        LinkedList1.reverse_linked_list();
        LinkedList1.print_linked_list();
        LinkedList1.swap_nodes(6,10);
        LinkedList1.print_linked_list();
        LinkedList2.print_linked_list();

        LinkedListt res = new LinkedListt();
        res.head = LinkedList1.merge_sorted_linkedlist(LinkedList1.head, LinkedList2.head);
        res.print_linked_list();
    }


}
