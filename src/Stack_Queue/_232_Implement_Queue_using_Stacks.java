package Stack_Queue;

import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {

    static class MyQueue {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            st1.add(x);
        }

        public int pop() {
            int value = -1;
            while (!st1.isEmpty()){
                if (st1.size() == 1){
                    value = st1.pop();
                }else{
                    st2.add(st1.pop());
                }
            }
            while (!st2.isEmpty()){
                st1.add(st2.pop());
            }
            return value;
        }

        public int peek() {
            int value = -1;
            while (!st1.isEmpty()){
                if (st1.size() == 1){
                    value = st1.pop();
                    st2.add(st1.pop());
                }else{
                    st2.add(st1.pop());
                }
            }
            while (!st2.isEmpty()){
                st1.add(st2.pop());
            }
            return value;
        }

        public boolean empty() {
            return st1.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.pop();
        queue.push(4);
        queue.push(5);
        queue.pop();
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
