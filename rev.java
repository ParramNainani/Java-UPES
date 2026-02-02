//Reverse a number
import java.util.*;
class Rev{
public static void main(String[] ar){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int rev=0;
int temp=0;
while(a>0){
temp = a%10;
rev = rev*10+temp;
a=a/10;
}
System.out.println("The reversed number is");
System.out.println(rev);
}
}
