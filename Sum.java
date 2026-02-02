// Sum of Digits
import java.util.*;
class Sum{
public static void main(String[] ar){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int sum = 0;
while(a > 0){
sum += a%10;
a = a/10;
}
System.out.println("Sum of digits is:");
System.out.println(sum);

}
}