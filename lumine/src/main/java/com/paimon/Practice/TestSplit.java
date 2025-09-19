package com.paimon.Practice;


public class TestSplit {
    
    public static void main(String[] args) {
        String str = "a,B,c! z, b, b, a";
        String[] banned = {"a", "b"};
        String[] arr = str.toLowerCase().split("[,!?';.\\s]+");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
