public class implementation {
    public static void main(String args[]) {

    }

    public static void linked_list_implementation(){
        LinkedListt LinkedList1 = new LinkedListt();
        System.out.println("please insert number of data for the linkedlist:");
        int[] inp_arr = {1,2,3,4,5,6};
        for(int i=0;i<inp_arr.length;i++)
        {
            LinkedList1.add_node_end(inp_arr[i]);
        }
        LinkedList1.add_node_start(10);
        LinkedList1.add_node_at_index(20,3);
        LinkedList1.print_linked_list();
        LinkedList1.delete_node(4);
        LinkedList1.print_linked_list();
    }
}
