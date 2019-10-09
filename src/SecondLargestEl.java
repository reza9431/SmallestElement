public class SecondLargestEl {



    public static void secondLargest(int array[], int array_size) {

        int i, first, second;

        if (array_size < 2) {                                   // We need at least two Element
            System.out.println("The Wrong Number");
            return;
        }
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < array_size; i++) {

            if (array[i] > first) {              // CHECK THE CURRENT Element
                second = first;
                first = array[i];
            }
             else if (array[i] > second && array[i] != first) {

                second = array[i];
            }

            }

            if (second == Integer.MIN_VALUE) {
                System.out.println("No Largest Number\n");

            } else {
                System.out.println("The Second Largest Number is :" + second);



            }


    }

            public static void main(String[] args) {
                int array[] = {25,54,65,8889,6556, 7865 , 7932};
                int n=array.length;

                secondLargest(array , n);



        }


    }




