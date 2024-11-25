public class reversed
{
    public static void main(String[] args)
    {
        String str="welcome";
        String b="";
        for(int i=str.length()-1;i>=0;i--)
        {
            b+=str.charAt(i);
        }
        System.out.println("reversed string:"+b);
    }
}