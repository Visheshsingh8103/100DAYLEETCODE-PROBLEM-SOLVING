class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();

        //Push all characters into stack 
        for(char ch : s){
            stack.push(ch);
        }

        //Pop and put back into array 

        for(int i = 0 ; i < s.length ; i++){
            s[i] = stack.pop();
        }
    }
}