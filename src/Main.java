import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("how big array u want");
        int arraySize = getInt();
        int[] array = new int[arraySize];
        System.out.println("Give me " +arraySize+" numbers");
        System.out.println("First number ");

        boolean isNextNumber = true;

        do{

        }while (isNextNumber);



        System.out.println("Gimme number");
        int a = getInt();
        int factorial = factorialNumber(a);
        System.out.println(factorial);
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


