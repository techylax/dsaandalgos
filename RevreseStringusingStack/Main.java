package com.laxman;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = "abcd";
        Stack <Character> st = new Stack<>();

        for ( int i= 0; i<str.length(); i++ )
        {
            st.push(str.charAt(i));
        }

        while(!st.isEmpty())
        {
            Character ch = st.pop();
            System.out.println(ch);
        }
    }
}
