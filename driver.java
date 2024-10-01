
interface bank{
    public void calculateInterest();
}
    class SBI implements bank
    {
        double r,amt,Interest;
       public void calculateInterest()
        {
            r=0.7;
            Interest=amt*r;
            
        }
    }
class axis implements bank
{
    double r,amt,interest;
   public void calculateInterest()
    {
        r=0.12;
        interest=amt*r;
        System.out.println("Interest="+interest);
    }
}
class driver
{
    public static void main(String[]args)
    {
        SBI sbi=new SBI();
        sbi.calculateInterest();
        axis a=new axis();
        a.calculateInterest();
        
    }
}
