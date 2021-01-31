import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;


public class Question1 {
     
    public static void main(String[] args) {

        Question1 u = new Question1();

        int [] car = new int[50];
        int [] car1 = new int [50];
        String [] fliths = {"red","green","yellow"};
        

      int a = new Random().nextInt(car.length);
      int b = new Random().nextInt(car1.length);
      int c = new Random().nextInt(fliths.length);
      
    for ( int i = 0 ; i < new Random().nextInt(fliths.length); i++ )

    
    if  ((fliths[new Random().nextInt(fliths.length)])== fliths[0])
    { 
    System.out.println("The flights " + fliths[0]);
    System.out.println(a + " cars waiting ");
    a+=b;
    Question1.timea();
    System.out.println( a + " cars waiting for the deaprture "); 
      System.out.println("they fligths is green ");
    // a -=1;
    while(a>0)
    
    // Question1.timed();
  
    // a-=1;
    Question1.timed();
    System.out.println( a-=1 );
    // a-=1;
    
    Question1.timed();
    
    
    // System.out.println(  a-=1);
    // System.out.println(a);




    

    
    

}


    else if ((fliths[new Random().nextInt(fliths.length)])== fliths[1])
   
    {System.out.println("The flights " + fliths[1]);
    System.out.println(a + " for the depature ");
    Question1.timeb();
    // System.out.println( a + " cars waiting for the deaprture "); 
    //   System.out.println("they fligths is green ");
    while(a>0)
    // Question1.timeb();
    System.out.println( a-=1 );
    Question1.timed();




}
    

    else if ((fliths[new Random().nextInt(fliths.length)])== fliths[2])

    {System.out.println("The flights " + fliths[2]  );}

    System.out.println(a + " for the depature ");
    Question1.timec();
    // System.out.println( a + " cars waiting for the deaprture "); 
    //   System.out.println("they fligths is green ");
    while(a>0)
    // Question1.timeb();
    System.out.println( a-=1 );
    Question1.timec();
    System.out.println("The flights " + fliths[0]);
    System.out.println(a + " cars waiting ");
    a+=b;
    Question1.timea();
    System.out.println( a + " cars waiting for the deaprture "); 
      System.out.println("they fligths is green ");

      Question1.timea();

      while(a>0)
    
      // Question1.timed();
    
      // a-=1;
      Question1.timed();
      System.out.println( a-=1 );
      // a-=1;
      


    }

 
    public static void timea()
    {
        try{
            Thread.sleep(20000);
        }
        catch(Exception a){

        }

    }
    public static void timeb()
    {
        try{
            Thread.sleep(30000);
        }
        catch(Exception a){

        }

    }

    public static void timec()
    {
        try{
            Thread.sleep(10000);
        }
        catch(Exception a){

        }
    }

    public static void timed()
    {
        try{
            Thread.sleep(10000);
        }
        catch(Exception a){

        }
    }
    
}
