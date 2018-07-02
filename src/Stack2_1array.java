public class Stack2_1array {
    private final int MAX = 1000;
    int[] container = new int[MAX];
    int top1 = -1;
    int top2 = MAX;

    public boolean push1(int d)
    {
        if(top1>= MAX-1 || top1>=top2) {
            System.out.println("Stack1 overflow!");
            return false;
        }
        else
        {
            top1++;
            container[top1] = d;
            return true;
        }
    }

    public boolean push2(int d)
    {
        if(top2<= 0 || top2 <= top1) {
            System.out.println("Stack overflow!");
            return false;
        }
        else
        {
            top2--;
            container[top2] = d;
            return true;
        }
    }

    public int pop1(){
        if(top1<0) {
            System.out.println("Stack1 Empty");
            return Integer.MIN_VALUE;
        }
        else{
            return container[top1--];
        }
    }

    public int pop2(){
        if(top2<0){
            System.out.println("Stack2 Empty");
            return Integer.MIN_VALUE;
        }
        else{
            return container[top2++];
        }
    }

    public int peek1(){
        if(top1>=0)
            return container[top1];
        else
            return Integer.MIN_VALUE;
    }

    public int peek2(){
        if(top2<=MAX)
            return container[top2];
        else
            return Integer.MIN_VALUE;
    }

    public void print1(){
        if(top1>=0)
            for(int i=0;i<=top1;i++)
                System.out.println(container[i]);
        else
            System.out.println("Empty Stack");
    }

    public void print2(){
        if(top2<=MAX)
            for(int i=MAX-1;i>=top2;i--)
                System.out.println(container[i]);
        else
            System.out.println("Empty Stack");
    }
}
