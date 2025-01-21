package dsa.stack;

public class Stack {
    int[] container;
    int top;
    int capacity;

    Stack (int size) {
        container = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack is Full");
        } else {
            container[++top] = x;
        }
    }

    public int pop(){
        return container[top--];
    }

    public int peek() {
        return container[top];
    }

    public void display() {
        for(int i=top; i>=0; i--){
            System.out.println(" --- ");
            System.out.println("| "+container[i]+" |");
            System.out.println(" --- ");
        }
    }

    public int getSize(){
        return capacity;
    }

    public boolean isFull(){
        return capacity == top;
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        s.pop();
        System.out.println("After Delete");
        s.display();
    }
}
