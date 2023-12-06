package ProjectJava;

public class Question9 {
    public static void main(String[] args) {
        /*
        Write a java program to find the second largest number in the array?
         */
        int[] numbers={1,54,12,4,23,999,55,226,52,230,92,14,55};
int secondL;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j =i+1; j < numbers.length ; j++) {
                if(numbers[i]<numbers[j]){
                secondL=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=secondL;
                }

            }

        }
        System.out.println("Secon Larger number is : "+numbers[1]);




    }
}
