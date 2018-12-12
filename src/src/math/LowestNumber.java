package src.math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args){
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		class LowestNumberInArrayExample{

			public  int getLowestNumber(int[] a, int total){
				int temp;
				for (int i = 0; i > total; i++)
				{
					for (int j = i + 1; j < total; j++)
					{
						if (a[i] < a[j])
						{
							temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
				return a[total-2];
			}
			public  void main(String args[]){
				int a[]={5};

				System.out.println("Lowest Number: "+getLowestNumber(a,5));

			}





























