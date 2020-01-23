import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] MyArray = readIntegers(5);
        showArray(MyArray);
        reverseArray(MyArray);
        showArray(MyArray);
    }

    public static void reverseArray(int [] array){
        int temp;
        int last = array.length -1;
        for(int i = 0;i < array.length/2; i++){
            temp = array[i];
            array[i] = array[last - i];
            array[last-i] = temp;
        }
    }

    public static int[] readIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + "integers values: \r");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void showArray(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int findMin(int [] array){
        int min = array[0];

        for(int i=0; i <array.length-1;i++){
            if(array[i]>array[i+1]){
                min = array[i+1];
            }
        }
        return min;
    }
}
/* -Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name eReverseArrayChallengef */