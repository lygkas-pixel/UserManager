import java.util.Scanner;



public class Login {
    public void userlog()
    {
        System.out.println("onoma xrhsth1");
        Scanner log = new Scanner(System.in);
       String username = log.nextLine();

        Data serchlog = new Data();
        serchlog.searchuser(username);
        System.out.println("password");
        Scanner pass = new Scanner(System.in);
       String logpass = pass.nextLine();



        System.out.println("synxaritiria to onoma xrhsth einai "+ username + " kai o kodikos einai " + logpass );

    }

}
