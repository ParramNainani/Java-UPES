class Xyz
{
float a=30.0f;
float b=40.00f;
float c=a+b;
void show()
{
System.out.println(c);
}

}

class Kyc{

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
//multiple classes calling inside main
Xyz x1= new Xyz();
x1.show();

}

}


//Datatypes :- int long float double