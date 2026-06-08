import javax.swing.*;
import java.util.Scanner;
import  java.util.ArrayList;


public class Data {
    static ArrayList<User> datas = new ArrayList<>();


    public void usersdata() {


        User d1 = new User();
        System.out.println("parakalw vale username");
        Scanner username = new Scanner(System.in);
        d1.username = username.nextLine();
        Data data = new Data();
        boolean exist = data.searchuser(d1.username);                                    // poy mpainei auto????
        if (exist) {
            System.out.println("username arleady exist");
            Data repait = new Data();
            repait.usersdata();                                                                                             //epistrefi apo thn arxh
        } else {

        }
        datas.add(d1);
        System.out.println("parakalw vale password");
        Scanner password = new Scanner(System.in);
        d1.password = password.nextLine();
        System.out.println("parakalw valte email");
        Scanner emails = new Scanner(System.in);
        d1.email = emails.nextLine();

        System.out.println(d1.username + " " + d1.password + " " + d1.email);
    }

    public boolean searchuser(String username) {                                                                        // elenxi an yparxei to username ston pinaka kai yparxei se vgazei sthn arxi toy menu

        for (User u : Data.datas) {
            if (u.username.equals(username)) {
                System.out.println("username already exist");
                return true;
            }


        }

        return false;
    }
        public boolean searchuserlog(String username) {                                                                        // elenxi an yparxei to username ston pinaka

            for (User u : Data.datas) {
                if (u.username.equals(username)) {
                    return true;
                }

                else{
                    System.out.println("false");

                }

            }
            return false;
    }
    public boolean login (String username ){

        for (User u :Data.datas){

        if(u.username.equals(username)){

            System.out.println("login succesfull");

            return true;



        }

        else
            System.out.println("login fail");

    }
        return false;


}

}