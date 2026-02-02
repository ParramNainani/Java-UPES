class subjects
{
String sub1="Maths";
String sub2="Java";
String sub3="DSA";
int score1 = 90;
int score2 = 91;
int score3 = 93;

void Sub()
{
System.out.println("Subjects Are:");
System.out.println(sub1);
System.out.println(sub2);
System.out.println(sub3);
}
void Score()
{
System.out.println("Scores Are:");
System.out.println(score1);
System.out.println(score2);
System.out.println(score3);
}
}


class Id
{
String name="Param";
int sap= 590014818;

public static void main(String[] args)
{
Id a1 = new Id();
System.out.println(a1.name);
System.out.println(a1.sap);

subjects s1 = new subjects();
s1.Sub();
s1.Score();
}
}
