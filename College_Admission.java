import java.util.*; 
class College_Admission{
static int num;
public static void main(String args[]){
Regis obj[] = new Regis[10];
int d = 0;
while (d==0){
System.out.print("\n\n********** College Admission Management System **********\n\n");
System.out.print("1. Enter Application Form\n");
System.out.print("2. Display All Application Form\n");
System.out.print("3. Exit\n");
System.out.print("Enter the option : ");
Scanner ch= new Scanner(System.in);
int c = ch.nextInt(); 
switch(c){
	
		case 1 :System.out.print("How many form you want to enter : ");
			num = ch.nextInt();
			for(int i=0;i<num;i++)
			{
			obj[num].Register();
			}
			for(int i=0;i<num;i++)
			{
			  obj[num].Display();
			 }
			break;
		case 2 :for(int i=0;i<num;i++)
			{
			  obj[num].Display(1);
			 }
			break;
		
		case 3 :
			System.out.print("\nHello World");
			d = 1;
			break;
		default :
			System.out.println("\nWrong input!!"); 
		



}
}
}
}

class Regis{
    static int studentId,ph;
    static String fname,lname,email;
    static String University = "Christ University";
public static void Register(){
Scanner ct= new Scanner(System.in);
Scanner nu= new Scanner(System.in);
Random rand = new Random(); 
studentId  = rand.nextInt(1000);
System.out.print("\n\n********** Application Form **********\n\n");
System.out.print("\nEnter first name : ");
fname= ct.nextLine(); 
System.out.print("\nEnter last name : ");
lname= ct.nextLine(); 
System.out.print("\nEnter Email : ");
email= ct.nextLine(); 
System.out.print("\nEnter phone number : ");
ph = nu.nextInt();
  

}

//Display
public static void Display(){
System.out.println("\n\n********** Display Application Form **********\n\n");
System.out.println("Student Id : "+studentId);
System.out.println("\nStudent Name : "+fname+" "+lname);
System.out.println("\nPhone number : "+ph);
System.out.println("\nStudent email : "+email);    
}

//function overloading
public static void Display(int n){
System.out.println("\n\n********** Display Application Form **********\n\n");
System.out.println("Student Id : "+studentId);
System.out.println("\nStudent Name : "+fname+" "+lname);
System.out.println("\nPhone number : "+ph);
System.out.println("\nStudent email : "+email);  
System.out.println("\nUniversity : "+University);    
}
}
