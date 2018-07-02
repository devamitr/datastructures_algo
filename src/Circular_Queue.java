public class Circular_Queue {
    int MAX = 5;
    int front = -1;
    int rear = -1;
    int[] arr = new int[MAX];

    public boolean enqueue(int d){
        // check if the queue is full
        if(front == (rear + 1)%MAX)
        {
            System.out.println("Queue is full!");
            return false;
        }
        // check if the queue is not initialised
        else if(front==-1)
        {
            front = 0;
            rear = 0;
            arr[rear] = d;
            return true;
        }
        else
        {
            rear = (rear+1)%MAX;
            arr[rear] = d;
        }

        return true;
    }

    public int dequeue()
    {
        //check if queue is empty
        if(front == -1)
        {
            System.out.println("The queue is empty");
            return Integer.MIN_VALUE;
        }
        else
        {
            int data = arr[front];
            arr[front] = -1;
            // check if that was the only element
            if (front==rear)
            {
                front = -1;
                rear = -1;
            }
            else
                front = (front+1)%MAX;
            return data;

        }
    }

    public void print_queue(){
        for(int i=front, j=0; j<MAX; i = (i+1)%MAX, j++)
        {
            System.out.println(arr[i]);
        }
    }
}
