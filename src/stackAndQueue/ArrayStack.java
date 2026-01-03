package stackAndQueue;

public class ArrayStack {
    private int[] stackArray;
    private int capacity;
    private int topIndex;

    public ArrayStack(int size) {
        this.capacity = size;
        this.stackArray = new int[capacity];
        this.topIndex = -1;
    }

    public ArrayStack() {
        this(1000);
    }

    public void push(int x) {
        if (this.topIndex >= capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        this.topIndex++;
        this.stackArray[this.topIndex] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1
        }
        
        topIndex--;
        return stackArray[topIndex];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stackArray[topIndex];
    }

    public boolean isEmpty() {
        return this.topIndex == -1;
    }
}
