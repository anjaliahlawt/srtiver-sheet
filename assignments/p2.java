public class p2
{
    public static void main(String[] args)
    {
        int units=150;
        double electricitybill;
        if (units>=1&&units<=150)
        {
            electricitybill=units*2.40;
            System.out.println(electricitybill);
        }
        else if(units>=151&&units<=300)
        {
            electricitybill=units*3.00;
            System.out.println(electricitybill);
        }
        else
        {
            electricitybill=units*3.20;
            System.out.println(electricitybill);
        }
    }
}
