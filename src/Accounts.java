import java.util.ArrayList;

public interface Accounts {
    ArrayList<String> passwordList=new ArrayList<String>();
    ArrayList<String> EmailList=new ArrayList<String>();
    ArrayList<String> UsernamesList=new ArrayList<String>();

    public void SignIn();
    public void SignUp();
}
