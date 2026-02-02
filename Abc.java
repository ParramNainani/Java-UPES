//2nd Program

class Abc{

static int a=20; //called using static 
static void display()
{
System.out.println("inside the display function");
}

public static void main(String[] args)
{
System.out.println("Inside Main, This is lab-01");
display();
System.out.println(a);// called using static without making object
}

}