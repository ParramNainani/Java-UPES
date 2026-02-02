//Constructors
class Book
{
Book(){
this("java");
System.out.println("Inside 0-Arg Constructor");
}
Book(String name){
this("Python",25);
System.out.println("Inside 1-Arg Constructor");
}
Book(String name, int id){
System.out.println("Inside 2-Arg Constructor");
}
}

class Main{
public static void main(String[] ar){
Book B1= new Book();
}
}
