import java.util.Stack;

public class LT_StackAndQueue {

    public static void showStack(Stack<Integer> st){
        for (Integer stack : st){
            System.out.print(stack + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        showStack(st);

        st.pop();

        showStack(st);

        st.peek();

        showStack(st);
    }
}
