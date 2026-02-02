//WAP to check weather a number is prime or not
// WAP to calculate sum of digits of a number 
// WAP reverse a number

import java.util.*;

class Prime{
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
int z=0;
		for(int i=2; i <= a1/2 ; i++){
			if(a1%i == 0){
				System.out.println("The Number is Not prime");
				break;
				}
			else{
				z = 1;
				}

				}
if(z==1){
System.out.println("The number is prime");
}	
				}
}