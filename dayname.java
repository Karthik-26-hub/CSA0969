public class dayname
{
    public static void main(String[] args)
    {
        int day=5;
        String dayname;
        switch(day)
        {
            case 1:
            dayname="monday";
            break;
            case 2:
            dayname="tuesday";
            break;
            case 3:
            dayname="wednesday";
            break;
            case 4:
            dayname="thursday";
            break;
            case 5:
            dayname="friday";
            break;
            case 6:
            dayname="saturday";
            break;
            case 7:
            dayname="sunday";
            break;
            default:
            dayname="invalid input";
            break;
        }
        System.out.println(dayname);
    }
}