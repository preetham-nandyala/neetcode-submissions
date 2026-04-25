class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();

        for(String token : tokens){
            switch(token){
                case "+": 
                        st.push(st.pop()+st.pop());
                        break;
                case "-":
                        int a = st.pop(), b = st.pop();
                        st.push(b - a);
                        break;
                case "*": 
                        st.push(st.pop()*st.pop());
                        break;
                case "/": 
                        int c = st.pop(), d = st.pop();
                        st.push(d / c);
                        break;
                default: st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}
