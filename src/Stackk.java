public class Stackk {
    // array implementation
    // main functions Push, Pop, Peek and isEmpty
    // LIFO Data structure
    static final int MAX=1000;
    int top=-1;
    int[] a = new int[MAX];
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
        if(top<0)
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
}
