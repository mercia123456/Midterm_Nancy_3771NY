package src.math;


public class FindMissingNumber {

   public static void main(String[] args){

         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

         static public void MissingNumber();{

    }    System.out.print("given array(already sorted): ");
        for (int j = 0; j < array.length; j++)
            System.out.print(array[j] +" "); // display it

        System.out.print("\nNumbers missing between 1 to 10 in array :  ");

        int j=0;
        for(int i=1;i<=100;i++){
            if(j<array.length && i==array[j])
                j++;
            else
                System.out.print(i+" ");

        }

    }

    }




































