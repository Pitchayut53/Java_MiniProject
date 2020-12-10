/**
 * Write a description of Admission here.
 * 
 * @author (Pitchayut Khumkrongsap) 
 * @version (10/12/2020)
 */

import java.util.*; 
//import Regis.Login;
import java.lang.Thread;

interface Testinterface
{
static String University = "Christ University";
}

class Register implements Testinterface {
    int studentId,ph;
    double gpa;
    String name,email;    
    StringBuffer course = new StringBuffer("Course"); 
    Scanner obj2 = new Scanner(System.in);
    public void read()
    {
        Random rand = new Random(); 
        studentId  = rand.nextInt(1000);
        System.out.print("Enter Your Name : ");
        this.name = obj2.nextLine();
        System.out.print("Enter Your email : ");
        this.email = obj2.nextLine();
        System.out.print("Enter Your Phone number : ");
        this.ph = obj2.nextInt();
    }
    public void display()
    {
        System.out.print("\n\n=================== Display Student Details ===================\n");
        System.out.println("\nStudent Id is : "+this.studentId);
        System.out.println("Student Name is : " + this.name);
        System.out.println("Student email is : " + this.email); 
        System.out.println("Student phone number is : " + this.ph); 
        System.out.println("University : " + this.University); 
    }
}

class Courses extends Register {

    public void select()
    {
        System.out.print("1. BCA\n");
        System.out.print("2. BSC\n");
        System.out.print("3. MSC\n");
        System.out.print("Enter the option : ");
        Scanner ch= new Scanner(System.in);
        int c = ch.nextInt(); 
        if(c == 1)
        {
        this.course = course.append(" BCA");
        System.out.println("\nYou've selected : ");
        System.out.println(course);
        }
        else if(c == 2)
        {
        this.course = course.append(" BSC");
        System.out.println("\nYou've selected : ");
        System.out.println(course);
        }
        else if(c == 3)
        {
        this.course = course.append(" MSC");
        System.out.println("\nYou've selected : ");
        System.out.println(course);
        }
        else
        {
            System.out.print("\nWrong input!!");
        }   
    }
    
}

class TestGenetic<G> 
{ 
    // An object of type T is declared 
    G obj; 
    TestGenetic(G obj) {  this.obj = obj;  }  // constructor 
    public G getObject()  { return this.obj; } 
} 

public class College_Admission {
    static int nos;
   public static void main(String args[])
   {
       //Courses[] gobj = new Courses[10];
      //Courses saveval[] = null; 
       int d = 0;
       double sum = 0;
    List<Double> list = new ArrayList<Double>();
    TestGenetic <String> sObj = new TestGenetic<String>("Thank you for Using"); 
       String testex = null; 
    Login Login_obj=new Login();
        Login_obj.Registation(); 
       while (d==0)
       {
        System.out.print("\n\n=================== College Admission Management System ===================\n");
        System.out.print("===========================================================================\n\n");
        System.out.print("1. Enter Application Form / Display Application Form\n");
        System.out.print("2. Select Course\n");
        System.out.print("3. Calculate Grade using Collection Class\n");
        System.out.print("4. Exit\n");
        System.out.print("Enter the option : ");
        Scanner ch= new Scanner(System.in);
        int c = ch.nextInt(); 
        switch(c)
        {
            case 1 :    System.out.print("Enter Number of Students: ");
                        Scanner ns = new Scanner(System.in);
                        nos = Integer.parseInt(ns.nextLine());
                        Courses[] gobj = new Courses[nos];
                        for (int i=0;i<nos;i++){
                            gobj[i] = new Courses();
                            System.out.printf("\n========== Enter %d Student Details ==========\n",i+1);
                            gobj[i].read();
                            } 
                        for(Courses n:gobj){
                            n.display();
                        }
                        
            
            break;
            case 2 :    gobj = new Courses[nos];
                        for (int i=0;i<nos;i++){
                            gobj[i] = new Courses();
                            System.out.printf("\n========== %d Student Selects Courses ==========\n",i+1);
                            gobj[i].select();
                            } 
            break;
            
            case 3 :  for(int i=0;i<5;i++){
                        System.out.printf("Enter Grade for %d semester : ",i+1);
                        Scanner gd = new Scanner(System.in);
                        double gds = gd.nextDouble();
                        list.add(gds); }
                        for(double num : list) {
                            sum = sum+num;
                        }
                        double summ = sum/5;
                        System.out.println("\nYour GPA is:"+summ);
            
              
            break;           
            case 4 :
            System.out.println(sObj.getObject()); 
            d = 1;
            break;
            default :
            System.out.println("\nWrong input!!");
        }
       }
   }
}
    



