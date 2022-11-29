import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    User u1=new User();
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
while(true) {
    System.out.println("1- Sign Up ");
    System.out.println("2- Sign In ");
    int choice = myObj.nextInt();  // Read user input

    if (choice == 1) {
        u1.SignUp();
    }
    else if (choice == 2) {
        u1.SignIn();

    }
}
    }
}
