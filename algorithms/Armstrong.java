package com.bridgelabz.Algorihm;

public class Armstrong {


	public static void main(String[] args) {
		
		 int n = 371; //371 = 3*3*3 + 7*7*7 + 1*1*1
		 int a;
         int n1 = 0;
         int temp;
         temp = n;
         while (n>0)
         {
                 a = n % 10;
                 n = n / 10;
                 n1 = n1 +(a* a* a); 
         }
         if (temp == n1)
         {
                 System.out.println("The "+temp+" is armstrong number");
         }
         else
                 System.out.println("The "+temp+" is not armstrong number");

	}

}
	


