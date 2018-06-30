public class implementation {
    public static void main(String args[]) {
//        linked_list_implementation();
        sorting_implementation();
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
        res.head = LinkedListt.merge_sorted_linkedlist(LinkedList1.head, LinkedList2.head);
        res.print_linked_list();

        LinkedListt.pairwise_swap(LinkedList1.head);
        LinkedList1.print_linked_list();
    }

    public static void sorting_implementation(){
        int[] list = {10,80, 90, 30, 40, 50, 70};
        print_int_list(list);
        //int[] list2 = QuickSortt.sort(list, 0, list.length-1);
        MergeSortt.sort(list, 0, list.length-1);
        print_int_list(list);
    }
    public static void print_int_list(int[] list)
    {
        System.out.println("*********************");
        for (int i=0; i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
