import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Scanner;

public class User implements Accounts {
        ArrayList<String> PasswordList=new ArrayList<String>();
        ArrayList<String> EmailList=new ArrayList<String>();
        ArrayList<String> UsernamesList=new ArrayList<String>();
        boolean flag = true;
    @Override
    public void SignIn() {
        while (flag){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String Username= myObj.nextLine();  // Read user input
        System.out.println("Enter Password");
        String Password = myObj.nextLine();  // Read user input


            for(int i = 0; i < UsernamesList.size(); i++)
            {
                if (Username.equals(UsernamesList.get(i)))
                {

                    if (!PasswordList.get(i).equals(Password))
                    {
                        System.out.println("invalid");
                    }
                    else {
                        System.out.println("valid");
                        flag =false;
                    }
                }
            }
        }}

    public void SignUp() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter username : ");
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Enter Email Address : ");
        String Email = myObj.nextLine();  // Read user input
        EmailList.add(Email);
        if(UsernamesList.isEmpty()){
            UsernamesList.add(userName);
            System.out.println("Enter New Password : ");
            String Password = myObj.nextLine();  // Read user input
            PasswordList.add(Password);        }
        else{
            for(int i = 0; i < UsernamesList.size(); i++)
            {

                if (userName.equals(UsernamesList.get(i)))
                {
                    System.out.println("username is already existing ...");
                }
                else if(Email.equals(EmailList.get(i)))
                {
                    System.out.println("Email is already existing ...");

                }
                else{
                    UsernamesList.add(userName);
                    System.out.println("Enter New Password : ");
                    String Password = myObj.nextLine();  // Read user input
                    PasswordList.add(Password);
            }
            }
        }
    }
}
