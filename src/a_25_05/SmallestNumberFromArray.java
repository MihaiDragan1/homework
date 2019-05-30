package a_25_05;

public class SmallestNumberFromArray {


    public static void main(String[] args) {

        //Display the smallest number from an array of numbers


        //int temp, size;
        int array[] = {10, 7, 20, 25, 13, 5};
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("Smallest number is:" +smallest);
    }
}
