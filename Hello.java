class Hello
{
int a=10;
int b=100;
int c=a+b;
void fun()
{
System.out.println(c);
}
public static void main(String[] args)
{
System.out.println("This is inside main");
Hello h1 = new Hello();
h1.fun();
}



}