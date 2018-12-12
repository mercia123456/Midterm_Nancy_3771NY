package src.math;


   public class Factorial {

    public static void main(String[] args) {

        System.out.println(fact(  6));


        }
        static  int fact(int n){

        {

          int x;
          if (n==1) {
              return 1;}

          else {
              x = n*fact( n-1);
              return  x;}
          }


        }



        }









