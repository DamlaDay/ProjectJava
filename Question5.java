package ProjectJava;

public class Question5 {
    public static void main(String[] args) {
        /*
        Write a program to swap 2 numbers without a temporary variable?
         */
int num1=11;
int num2=1;
        System.out.println("Before swapping: a="+num1+" and "+"b="+num2);
        num1=num1+num2;
        num2=num1-num2;
num2=num1+num2;
        System.out.println("After swapping : a="+num1+" and "+"b="+num2);

    }
}
