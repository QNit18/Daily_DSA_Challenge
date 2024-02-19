package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _225_Implement_Stack_using_Queues {
    static class MyStack {

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        public MyStack() {

        }

        public void push(int x) {
            queue1.add(x);
        }

        // Xóa phần tử ở đầu stack và trả về giá trị
        public int pop() {
            int value = -1;
            while (!queue1.isEmpty()){
                if (queue1.size() == 1){
                    value = queue1.remove();
                }else {
                    queue2.add(queue1.remove());
                }
            }

            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;

            return value;
        }

        // Lấy phần tử ở đầu
        public int top() {
            int value = -1;
            while (!queue1.isEmpty()){
                if (queue1.size() == 1){
                    value = queue1.remove();
                    queue2.add(value);
                }else {
                    queue2.add(queue1.remove());
                }
            }

            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;

            return value;
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.push(5);
        stack.pop();
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
