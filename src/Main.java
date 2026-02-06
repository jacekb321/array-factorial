import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("how big array u want(at least 1 character inside;))");
        int arraySize = getInt();
        int[] array = new int[arraySize];
        System.out.println("Give me " +arraySize+" numbers");

        boolean isNextNumber = true;


        for(int i=0;i<arraySize;i++){
            int number = getInt();
            array[i] = number;
        }


        System.out.println(Arrays.toString(array));
        int [] newArray = new int[arraySize];
        int placeInArray = 0;

        for (int a : array){
            int factorial = factorialNumber(a);
            newArray[placeInArray]=factorial;
            placeInArray++;
        }
        System.out.println("Array with factorial of numbers u gave");
        System.out.println(Arrays.toString(newArray));


        }


    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int factorialNumber(int a){
        int factorial = 1;
        for(int i = 1;i<=a;i++){
            factorial = factorial*i;
        }
        return factorial;
    }

    }


