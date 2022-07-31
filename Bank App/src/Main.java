import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// Auto-generated method stub
		
		//Log in section
	
		String username, password;
		
		Scanner input = new Scanner(System.in);
		System.out.println("This is CASE SENSITIVE");
        System.out.print("Enter username:");//username:user
        username = input.nextLine();
        System.out.print("Enter password:");//password:user
        password = input.nextLine();
        System.out.println();
        
        
        if(username.equals("Ethan") && password.equals("123"))
        {
        	Account ethan = new Account("Ethan Humphrey", "A00001");
    		ethan.showMenu();
        }
        else if(username.equals("Miranda") && password.equals("123"))
        {
        	Account miranda = new Account("Miranda Bailey", "A00002");
    		miranda.showMenu();
        }
        
        else
        {
            System.out.println("Authentication Failed");
        }
    
	
	}
	
	
	
}
