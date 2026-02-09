interface BankAcc
{
void deposit(double amount);
void withdraw(double amount);
void inquiry();
}

class Savings implements BankAcc
{
double bal = 0;

@Override
public void deposit(double amount)
{
if (amount > 1000){
bal = bal + amount;
System.out.println("Money Deposited, Balance Is:" + bal);
}
else
{
System.out.println("Money Could not be Deposited (amount too low), Balance Is:" + bal);
}
}
@Override
public void withdraw(double amount)
{
if (amount <= bal){
bal = bal - amount;
System.out.println("Money Withdrawn, Remaining Balance Is:" + bal);
}
else
{
System.out.println("Insufficient Balance");
}
}
@Override
public void inquiry()
{
System.out.println("Your current Balance Is:" + bal);
}
}

class Current implements BankAcc
{
double bal = 3000;

@Override
public void deposit(double amount)
{
if (amount > 10000) {
bal = bal + amount;
System.out.println("Money Deposited, Balance Is:" + bal);
}
else
{
System.out.println("Money Not Deposited (amt too low for current acc), Balance Is:" + bal);
}
}


@Override
public void withdraw(double amount)
{
if (amount <= bal){
bal = bal - amount;
System.out.println("Money Withdrawn, Remaining Balance Is:" + bal);
}
else
{
System.out.println("Insufficient Balance");
}
}

@Override
public void inquiry()
{
if(bal<5000){
System.out.println("Your current Balance Is:" + bal + " and it is below minmimum balance of 5000");
}
else
{
System.out.println("Your current Balance Is:" + bal);
}
}
}


class Acc
{
public static void main(String ar[])
{
BankAcc c1 = new Current();
BankAcc s1 = new Savings();

s1.deposit(500);

s1.deposit(10001);
s1.withdraw(4000);
s1.inquiry();

c1.deposit(12000);
c1.withdraw(14000);
c1.inquiry();

c1.deposit(1000);
}
}

