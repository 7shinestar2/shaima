import java.util.Scanner;

/**
 * Created by students on 13/01/22.
 */
public class InputArray {
    public static void main(String[] args) {

        int []array = new int[5];
        InputArray(array);
        PrintArray(array);

    }

    //method
    public static void PrintArray(int[] array)
    {
        System.out.println("print 5 numbers");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }//first method

    public static void InputArray(int[] array)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 5 numbers ");
        for (int i = 0; i <array.length ; i++) {
            array[i]=input.nextInt();
        }

    }//second method

}
