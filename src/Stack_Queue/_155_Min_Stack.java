package Stack_Queue;

import java.util.Stack;

public class _155_Min_Stack {

    class MinStack {

        static class Node {
            int values;
            int MIN;
            Node(int values) {
                this.values = values;
            }
        }

        Stack<Node> st = new Stack<>();

        public MinStack() {

        }

        public void push(int val) {
            Node newNode = new Node(val);
            newNode.MIN = st.isEmpty() ? val :  Math.min(newNode.values, st.peek().MIN);
            st.add(newNode);
        }

        public void pop() {
            st.pop();
        }

        public int top() {
            return st.peek().values;
        }

        public int getMin() {
            return st.peek().MIN;
        }
    }
}
