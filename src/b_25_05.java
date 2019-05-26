public class b_25_05 {


    public static void main(String[] args) {

        //Display the smallest number from an array of number (2 versions: with normal for and with foreach)
        // loop

            int temp, size;
            int array[] = {10, 20, 25, 63, 96, 57};
            size = array.length;

            for(int i = 0; i<size; i++ ){
                for(int j = i+1; j<size; j++){
                    if(array[i]>array[j]){
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println("Smallest element of the array is: "+array[0]);

                  // foreach loop

    }
    }
