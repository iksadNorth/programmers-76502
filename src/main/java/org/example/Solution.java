package org.example;

import java.util.*;

class Solution {
    static Stack<Character> stack = new Stack<>();
    static Set<Character> open = new HashSet<>();
    static Map<Character,Character> close = new HashMap<>();

    static {
        open.add('('); close.put(')', '(');
        open.add('['); close.put(']', '[');
        open.add('{'); close.put('}', '{');
    }

    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++) {
            String head = s.substring(0, i);
            String tail = s.substring(i);

            String concat = tail + head;
            if(isClosed(concat)) answer++;
        }
        return answer;
    }

    boolean isClosed(String concat) {
        stack.clear();
        for(char c : concat.toCharArray()) {
            if(open.contains(c)) {
                stack.push(c);
            } else if(stack.isEmpty()) {
                return false;
            } else if(stack.pop() != close.get(c)) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}