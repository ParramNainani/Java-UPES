interface Switchable
{
void OnOff(Boolean status);
}

interface Connectable
{
void wifi(Boolean connect);
}


class SmartLight implements Switchable,Connectable
{

@Override
public void OnOff(Boolean status){
if(status == true)
{
System.out.println("Light is ON");
}
else
{
System.out.println("Light is Off");
}
}
@Override
public void wifi(Boolean connect){
if(connect==true)
{
System.out.println("Light is connected to Wifi");
}
else
{
System.out.println("Light is not connected to Wifi");
}
}
}


class SmartFan implements Switchable,Connectable
{
@Override
public void OnOff(Boolean status){
if(status == true)
{
System.out.println("Fan is ON");
}
else
{
System.out.println("Fan is Off");
}
}

@Override
public void wifi(Boolean connect){
if(connect==true)
{
System.out.println("Fan is connected to Wifi");
}
else
{
System.out.println("Fan is not connected to Wifi");
}
}
}


class implement
{
public static void main(String ar[])
{
SmartLight l1 = new SmartLight();
SmartFan f1 = new SmartFan();

l1.OnOff(true);
l1.wifi(false);
f1.OnOff(false);
f1.wifi(true);
}
}