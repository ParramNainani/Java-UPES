//LOOPS and Switch 
import java.util.*;

class SwitchDemo{
public static void main(String[] ar){
Scanner sc = new Scanner(System.in);
String a = sc.nextLine();
switch (a) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("This is a vowel");
                break;

            default:
                System.out.println("This is a consonant");

}
}




}