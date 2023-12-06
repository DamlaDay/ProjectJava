package ProjectJava;

public class Question8 {
    public static void main(String[] args) {
        /*

        Maximum and minimum number in the array
         */

        int[] numbers={1,54,12,4,23,999,55,226,52,230,92,14,55};
        int maxN=numbers[0];
        int minN=numbers[0];
        for (int i = 0; i < numbers.length ; i++) {
            if(maxN<numbers[i]){
                maxN=numbers[i];
            }else{

            }

        }
        System.out.println("Minimum number in the Array is:"+maxN);
        System.out.println("Minimum number in the Array is:"+minN);





    }
}
