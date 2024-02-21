package com.jap;
public class GameDemo {

    public String divideByNumber(int firstNumber, int secondNumber){
        int finalNumber = 0;
        try {
            // write logic
            if (secondNumber == 0) {
                throw new ArithmeticException("/ by zero");
            }
            finalNumber = firstNumber / secondNumber;
        } catch (ArithmeticException exception) {
            return exception.toString();
        }
        return String.valueOf(finalNumber);
    }

    public static void main(String[] args) {
        GameDemo gameDemo = new GameDemo();
        int firstNumber1 = 10;
        int secondNumber1 = 2;
        String result1 = gameDemo.divideByNumber(firstNumber1, secondNumber1);
        System.out.println("Result 1: " + result1);
        int firstNumber2 = 10;
        int secondNumber2 = 0;
        String result2 = gameDemo.divideByNumber(firstNumber2, secondNumber2);
        System.out.println("Result 2: " + result2);
    }
}