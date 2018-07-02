import java.util.LinkedList;

public class Queuee {
    // basic function enque, deque, peek, print
    private LinkedList<Integer> queue = new LinkedList<Integer>();


    public boolean enqueue(int d){
        queue.addLast(d);
        return false;
    }

    public int dequeue(){
        return queue.removeFirst();
    }

    public int peek(){
        return queue.peekFirst();
    }

    public void print(){
        System.out.println("current queue:" + queue);
    }
}
