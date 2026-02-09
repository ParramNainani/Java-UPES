interface PaymentMethod
{
void payment(double amount);
}

class CCP implements PaymentMethod
{
double bal = 10000;
public void payment(double amount)
{
bal = bal - amount;
System.out.println("Amount Deducted Remaining Balance Is:"+bal+" Method: Credit Card");
}
}


class UPI implements PaymentMethod
{
double bal = 10000;
public void payment(double amount)
{
bal = bal - amount;
System.out.println("Amount Deducted Remaining Balance Is:"+bal+" Method: UPI");

}
}


class NBP implements PaymentMethod
{
double bal = 10000;
public void payment(double amount)
{
bal = bal - amount;
System.out.println("Amount Deducted Remaining Balance Is:"+bal+" Method: Net Banking");
}
}


class Processor
{
public static void main(String ar[])
{
PaymentMethod c1 = new CCP();
PaymentMethod u1 = new UPI();
PaymentMethod n1 = new NBP();

c1.payment(5000);
u1.payment(2000);
n1.payment(10000);

}
}