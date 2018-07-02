public class Stackk {
    // array implementation
    // main functions Push, Pop, Peek and isEmpty
    // LIFO Data structure

    // This implementation was later extented to implement the following link
    // https://www.geeksforgeeks.org/design-and-implement-special-stack-data-structure/
    static final int MAX=1000;
    int top=-1;
    int[] a = new int[MAX];
    int[] a_min = new int[MAX];
    public boolean isEmpty()
    {
        return top>0;
    }

    public boolean push(int d)
    {
        if(top>= MAX-1) {
            System.out.println("Stack overflow!");
            return false;
        }
        else
        {
            top++;
            a[top] = d;
            if(d<peek_min())
                a_min[top] = d;
            else
                a_min[top] = peek_min();
            return true;
        }
    }

    public int pop(){
        if(top<0)
            return Integer.MIN_VALUE;
        else{
            return a[top--];
        }
    }

    public int peek(){
        if(top>=0)
            return a[top];
        else
            return Integer.MIN_VALUE;
    }

    public void print(){
        if(top>0)
            for(int i=0;i<=top;i++)
                System.out.println(a[i]);
        else
            System.out.println("Empty Stack");
    }

    public void print_min_stack(){
        if(top>=0)
            for(int i=0;i<=top;i++)
                System.out.println("min_" + i + " - " + a_min[i]);
        else
            System.out.println("Empty Stack");
    }

    public int peek_min(){
        // returns the smallest element in the stack
        if(top-1>=0)
            return a_min[top-1];
        else
            return Integer.MAX_VALUE;
    }
}
