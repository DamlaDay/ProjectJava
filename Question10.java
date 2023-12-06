package ProjectJava;

public class Question10 {
    public static void main(String[] args) {
        /*
        Write a program to print out duplicate elements from an Array of Strings?
         */

        String [] duplicate= {"California","Texas","Florida","Ohio","Hawaii","Texas","Arizona","Florida"};

        for (int i = 0; i < duplicate.length ; i++) {
            for (int j =i+1; j <duplicate.length ; j++) {
                if (duplicate[i].equals(duplicate[j])){
                    System.out.println(duplicate[i]);
                }

            }
        }

        }

            }







