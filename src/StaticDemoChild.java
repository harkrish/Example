import java.util.LinkedList;

//interface MainInterface {
//   void mainMethod();
//}
//interface SubInterface extends MainInterface { // If we put implements keyword in place of extends, // compiler throws an error.
//   void subMethod();
//}
//class MainClass implements MainInterface {
//   public void mainMethod() {
//      System.out.println("Main Interface Method");
//   }
//   public void subMethod() {
//      System.out.println("Sub Interface Method");
//   }
//}

public class StaticDemoChild extends StaticDemo
{
     public static StaticDemoChild()
     {
          /*By default super() is hidden here */ 
//    	  super();
          System.out.println("StaticDemoChild");
     }
     public void display()
     {
          System.out.println("Just a method of child class");
     }
     public static void main(String args[])
     {
          StaticDemoChild obj = new StaticDemoChild();
          obj.display();
     }
}