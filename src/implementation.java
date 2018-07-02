public class implementation {
    public static void main(String args[]) {
//        linked_list_implementation();
        // stack_implementation();
        implement_circular_queue();
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
    public static void print_int_list(int[] list) {
        System.out.println("*********************");
        for (int i=0; i<list.length;i++){
            System.out.println(list[i]);
        }
    }

    public static void stack_implementation(){
        int[] list = {16,15,29,19,18};
        Stackk st1 = new Stackk();
        for(int i=0; i<list.length;i++){
            st1.push(list[i]);
        }
        st1.print();
        st1.print_min_stack();
        System.out.println(st1.pop());
        st1.print_min_stack();
        System.out.println(st1.pop());
        System.out.println(st1.pop());
        System.out.println(st1.pop());
        st1.print_min_stack();
    }

    public static void queue_implementation(){
        Queuee q1 = new Queuee();
        int[] list = {10,80, 90, 30, 40, 50, 70};
        for(int i=0; i<list.length;i++){
            q1.enqueue(list[i]);
        }
        q1.print();
        System.out.println("top element:" + q1.peek());
        q1.print();
        System.out.println("Deque element:" + q1.dequeue());
        q1.print();
    }

    public static void two_stack_one_array_implementation(){
        Stack2_1array dual_stack = new Stack2_1array();
        int[] list1 = {16,15,29,19,18};
        int[] list2 = {10,12,18,21,38,42,55};
        for(int i=0; i<list1.length;i++){
            dual_stack.push1(list1[i]);
        }
        for(int i=0; i<list2.length;i++){
            dual_stack.push2(list2[i]);
        }
        System.out.println("Stack1");
        dual_stack.print1();
        System.out.println("Stack2");
        dual_stack.print2();

        System.out.println("Stack1 pop:" + dual_stack.pop1());

        System.out.println("Stack2 pop:" + dual_stack.pop2());

    }

    public static void implement_circular_queue(){
        Circular_Queue cq1 = new Circular_Queue();
        int[] list = {16,15,29,19,18,21,22};
        for(int i=0; i<list.length;i++){
            cq1.enqueue(list[i]);
        }
        cq1.print_queue();
        System.out.println("dequeue:" + cq1.dequeue());
        System.out.println("dequeue:" + cq1.dequeue());
        System.out.println("dequeue:" + cq1.dequeue());
        cq1.print_queue();
        cq1.enqueue(99);
        cq1.enqueue(98);
        cq1.enqueue(97);
        cq1.enqueue(96);
        cq1.print_queue();
    }
}
