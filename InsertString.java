public class InsertString
{
    public static void main(String[] args)
    {
        String original = "Hello World!";
                String toInsert = " Java";
                int position = 5;
        String result = original.substring(0, position) + toInsert + original.substring(position);
        System.out.println(result);
}
}