package b_22_06.RefactorFilesHomework1;

public class RefactorSmallestNumberArray {

    public static void main(String[] args) {
        System.out.println("Smallest number is:" + smallestNumberArray());

    }

    public static int smallestNumberArray() {
        int array[] = {10, 7, 20, 25, 13, 5};
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }
}
