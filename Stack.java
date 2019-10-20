import DS.DataStructure;

class StackDS implements DataStructure {
    final static int MAX = 1000;
    int[] array = new int[MAX];
    int top = -1;
    @Override
    public void push(int x) {
        array[++top] = x;
    }
    @Override
    public int pop() {
        return array[top--];
    }
    @Override
    public boolean isEmpty() {
        return top == -1;
    }
    @Override
    public boolean isFull() {
        return top == MAX - 1;
    }
    void display() {
        for(int i=0; i<=top; i++) {
            System.out.println(array[i]);
        }
    }
}

class QueueDS implements DataStructure {
    final static int MAX = 1000;
    int[] array = new int[MAX];
    int front = 0, rear = 0;
    @Override
    public void push(int x) {
        array[rear++] = x;
    }
    @Override
    public int pop() {
        return array[front++];
    }
    @Override
    public boolean isEmpty() {
        return rear == 0;
    }
    @Override
    public boolean isFull() {
        return rear == MAX - 1;
    }
    void display() {
        for(int i=front; i<rear; i++) {
            System.out.println(array[i]);
        }
    }
}

/**
 * InnerStack
 */
public class Stack {

    public static void main(String[] args) {
        StackDS s = new StackDS();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(-4);
        s.push(6);
        s.push(9);
        s.display();
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.display();
        System.out.println(s.isEmpty());
        QueueDS q = new QueueDS();
        System.out.println(q.isEmpty());
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.display();
        System.out.println("pop1 \n" + q.pop());
        System.out.println("pop2 \n" + q.pop());
        q.display();
        System.out.println(q.isEmpty());
    }
}