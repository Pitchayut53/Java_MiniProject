import java.util.*; 

class College_Admission{
public static void main(String args[]){
Regis obj[] = new Regis[10];
int d = 0;
while (d==0){
System.out.print("\n\n********** College Admission Management System **********\n\n");
System.out.print("1. Enter Application Form\n");
System.out.print("2. ***\n");
System.out.print("3. Exit\n");
System.out.print("Enter the option : ");
Scanner ch= new Scanner(System.in);
int c = ch.nextInt(); 
switch(c){
	
		case 1 :System.out.print("How many form you want to enter : ");
			int n = ch.nextInt();
			for(int i=0;i<n;i++)
			{ 
			obj[n].Register();
			}
			break;
		case 2 :
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
public static void Register(){
Scanner ct= new Scanner(System.in);
Scanner nu= new Scanner(System.in);
System.out.print("\n\n********** Application Form **********\n\n");
System.out.print("\nEnter first name : ");
String fname= ct.nextLine(); 
System.out.print("\nEnter last name : ");
String lname= ct.nextLine(); 
System.out.print("\nEnter Email : ");
String email= ct.nextLine(); 
System.out.print("\nEnter phone number : ");
int ph = nu.nextInt();
  
//Display
System.out.println("\n\n********** Display Application Form **********\n\n");
System.out.println("\nStudent Name : "+fname+" "+lname);
System.out.println("\nPhone number : "+ph);
System.out.println("\nStudent email : "+email);    
}
}