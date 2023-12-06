package ProjectJava;

public class Question4 {
    public static void main(String[] args) {
      /*
      Create a 2D array of integers. Develop a program which will calculate the
sum of even and odd numbers for that array.
       */
        int [][] allNumbers={
                {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30},
                {1,3,5,7,9,11,13,15,17,19,21,23,25,27,30},
        };
        int sumOdd=0;
        int sumEven=0;
        for (int i = 0; i < allNumbers.length; i++) {
            for (int j = 0; j <allNumbers[i].length ; j++) {
                if(allNumbers[i][j]%2==0){
                    sumEven=sumEven+allNumbers[i][j];
                }else if(allNumbers[i][j]%2!=0){
                    sumOdd=sumOdd+allNumbers[i][j];
                }

            }

        }
        System.out.println("The sum of the Even numbers: "+sumEven);
        System.out.println("The sum of the Odd numbers: "+sumOdd);


    }
}
