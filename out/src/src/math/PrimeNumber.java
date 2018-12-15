package src.math;

public class PrimeNumber {

	public static void main(String[] args) {

		for (int i=1;i<= 100000; i++){
			boolean flag= true;
			for (int j=2;j<=i-1;j++){
				if (i%j==0){
					flag=false;
					break;

				}
			}
			if (flag==true){
				System.out.println(i);
				System.out.println("\t");
			}
		}





		/*
		 * Find list of Prime numbers from number 2 to 1 million.Try the best solution as possible.
		 * Which will take less CPU life cyce Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

	}

}
