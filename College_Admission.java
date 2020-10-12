import java.util.*; 
/**
 * Write a description of Admission here.
 * 
 * @author (Pitchayut Khumkrongsap) 
 * @version (10/12/2020)
 */

class Register {
    int studentId,ph;
    String name,email;
    static String University = "Christ University";
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
        System.out.println("\nStudent Id is : "+this.studentId);
        System.out.println("Student Name is : " + this.name);
        System.out.println("Student email is : " + this.email); 
        System.out.println("Student phone number is : " + this.ph); 
        System.out.println("University : " + this.University); 
    }
}

public class Admission {
    
   public static void main(String args[])
   {
       Register[] obj = new Register[10];
       int d = 0;
       while (d==0)
       {
        System.out.print("\n\n=================== College Admission Management System ===================\n");
        System.out.print("===========================================================================\n\n");
        System.out.print("1. Enter Application Form\n");
        System.out.print("2. \n");
        System.out.print("3. Exit\n");
        System.out.print("Enter the option : ");
        Scanner ch= new Scanner(System.in);
        int c = ch.nextInt(); 
        
        switch(c)
        {
            case 1 :    System.out.print("Enter Number of Students: ");
                        Scanner ns = new Scanner(System.in);
                        int nos = Integer.parseInt(ns.nextLine());
                        Register[] gobj = new Register[nos];
                        for (int i=0;i<nos;i++){
                            gobj[i] = new Register();
                            System.out.printf("\n========== Enter %d Student Details ==========\n",i+1);
                            gobj[i].read();
                            } 
                        for(Register n:gobj){
                            n.display();
                        }
                        
            
            
            case 2 : 
            break;
            
            case 3 :
            System.out.print("\nThank you");
            d = 1;
            break;
            default :
            System.out.println("\nWrong input!!");
        }
       }
   }
    

}


