class Solution {
    public int calculate(String s) {
        
        Stack<Integer> stack = new Stack<>();
        int number = 0;
        int sign = 1;
        int result = 0;
        for(char c: s.toCharArray()) {

            if(c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if(c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if(c == '(') {
                stack.add(result);
                stack.add(sign);
                result = 0;
                sign = 1;
            } else if(c == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop();
                result += stack.pop();
            } else if(c != ' ') {
                number = number * 10 + (c - '0');
            }
        }

        if(number != 0) result += sign * number;
        return result;
    }
}