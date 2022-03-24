package se.lexikon;

public class Calculator {

    public static void main(String[] args) {
        
        int number1 = 10;
        int number2 = 5;
        int additionResult = addition(number1,number2);
        int subtractionResult = subtraction(number1, number2);

        int additionresult2 = addition(5,4);

    }

    // [access modifier] static [return type] [method name] ([params]) {}
    public static int  addition(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

public static int subtraction(int n1, int n2){
        return n1 - n2;

}

// * & /

}
