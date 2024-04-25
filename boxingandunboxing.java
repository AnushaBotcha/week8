public class BoxAndUnbox {
    public static void main(String[] args)
    {
        //Boxing
        Integer a=new Integer(50);
        Integer b=new Integer(30);
        //UnBoxing
        int c=b;
        System.out.println("Boxed Value : "+a);
        System.out.println("UnBoxed Value : "+c);
    }
}
