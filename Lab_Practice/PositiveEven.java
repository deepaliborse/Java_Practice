class PositiveEven
{
public static void main(String args[])
{
int i;
i = -11;

if (i > 0)
{
if(i%2==0)
{
System.out.println("Positive Even Integer!");
}
else
{
System.out.println("Positive Odd Integer!");
}
}


else if (i < 0)
{
if (i%2==0)
{
System.out.println("Negative Even Integer!");
}
else
{
System.out.println("Negative Odd Integer!");
}
}

else
{
System.out.println("Zero Integer!");
}

}

}
