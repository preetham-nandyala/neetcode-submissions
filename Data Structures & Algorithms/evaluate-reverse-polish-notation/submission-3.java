class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int a = 1;
        int b = 1;
        for(int i = 0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                b = s.pop();
                a = s.pop();
                s.push(a+b);
            }else if(tokens[i].equals("-")){
                b = s.pop();
                a = s.pop();
                s.push(a-b);
            }else if(tokens[i].equals("*")){
                b = s.pop();
                a = s.pop();
                s.push(a*b);
            }else if(tokens[i].equals("/")){
                b = s.pop();
                a = s.pop();
                s.push(a/b);
            }else {
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}
