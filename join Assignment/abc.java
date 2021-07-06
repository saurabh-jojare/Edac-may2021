public class Main
{

    public static void main(String[] args) 
    {
       // System.out.println(i);
        System.out.println(++i);
        System.out.println("in main");
     
    }

    static 
    {
        System.out.println("in static block");
        String[] args = new String[10];
        main(args);
        new Main().main(args);;
    }
    static int i =10 ;

	
}

