import java.util.*; 

class College_Admission{
public static void main(String args[]){
College_Admission Obj = new College_Admission();
int i = 0;
while (i==0){
System.out.print("\n\n********** College Admission Management System **********\n\n");
System.out.print("1. Enter Application Form\n");
System.out.print("2. ***\n");
System.out.print("3. Exit\n");
System.out.print("Enter the option : ");
Scanner ch= new Scanner(System.in);
int c = ch.nextInt(); 
switch(c){
	
		case 1 :
			Register();
			break;
		case 2 :
			break;
		
		case 3 :
			System.out.print("\nHello World");
			i = 1;
			break;
		default :
			System.out.println("\nWrong input!!"); 
		



}
}
}


public static void Register(){
Scanner ct= new Scanner(System.in);
System.out.print("\n\n********** Application Form **********\n\n");
System.out.print("\nEnter first name : ");
String fname= ct.nextLine(); 
System.out.print("\nEnter last name : ");
String lname= ct.nextLine(); 
System.out.print("\nEnter phone number : ");
int ph = ct.nextInt();  
//Display
System.out.print("\n\n********** Display Application Form **********\n\n");
System.out.print("\nStudent Name : "+fname+" "+lname);
System.out.print("\nPhone number : "+ph);   
}
}