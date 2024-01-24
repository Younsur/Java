import java.util.LinkedList;
import java.util.Scanner;

public class MyStack<T> {
    private LinkedList<T> values = new LinkedList<T>();
    public void push(T t){
        values.push(t);
    }
    public T pull(){
        return values.pop();
    }
    public T peek(){
        return values.peek();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        MyStack<Integer> myStack = new MyStack<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            myStack.push(num);
        }
        System.out.println(myStack.pull());
        System.out.println(myStack.peek());
    }
}
