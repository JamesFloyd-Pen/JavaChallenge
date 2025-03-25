package com.paimon.Practice;

public class MyRotation {
    public static void main(String[] args) {
        MyRotation rotation = new MyRotation();
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotation.rotateString(s, goal));
        
    }

    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;

        s=s+s;
        System.out.println(s);
        return s.lastIndexOf(goal)>=0;
    }


}
