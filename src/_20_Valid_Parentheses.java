import java.util.Stack;

public class _20_Valid_Parentheses {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c=='{' || c=='['){
                st.push(c);
            } else {
                if (st.size() > 0) {
                    if (st.peek() == '(' && c == ')') {
                        st.pop();
                    } else if (st.peek() == '[' && c == ']') {
                        st.pop();
                    } else if (st.peek() == '{' && c == '}') {
                        st.pop();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        return st.size() == 0;
    }

    public static void main(String[] args) {
        String s = "{";
        System.out.println(isValid(s));
    }

}
