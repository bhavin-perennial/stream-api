package org.example;

public class StringExamples {
    public static void main(String[] args)
    {
        String s1="Hello";
        String s2=new String("Hello");

        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2));//true

        String s3 = s2.intern();
        System.out.println(s1==s3);//true
        System.out.println(s2==s3);//false
    }
}
