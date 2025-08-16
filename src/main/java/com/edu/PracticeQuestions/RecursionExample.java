package com.edu.PracticeQuestions;

public class RecursionExample {
    static int i = 0;
    /**
     * @param args
     *
     * Running this code will cause recursion error landing to Stack Overflow Error
     */
    public static void main(String[] args) {
        greeting();
    }

    static void greeting(){
        try {
            System.out.println("greeting is a static method");
            RecursionExample example = new RecursionExample();
            example.greet();
            i++;
        } catch (Error e) {
            System.out.println(e.getMessage());
            System.out.println(i);
            throw new RuntimeException();
        }

    }

    void greet()    {
        try {
            System.out.println("greet is a non static method");
            greeting();
            i++;
        } catch (Error e) {
            System.out.println(e.getMessage());
            System.out.println(i);
            throw new RuntimeException();
        }
    }
}
