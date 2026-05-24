import java.util.Scanner;

public class Menus {

    public void menu() {
        while (true) {
            System.out.println("pakalw patiste 1 gia eisodo");
            System.out.println("pakalw patiste 2 gia dhmioyrgia xrhsth");
            System.out.println("pakalw patiste 3  gia oles tis egrafes");
            System.out.println("pakalw patiste 4 gia exodo");
            Scanner x = new Scanner(System.in);
            int choice = x.nextInt();

            if (choice == 1) {
                Login log = new Login();
                log.userlog();
            }
            if (choice == 2) {
                Create create = new Create();
                create.create();
            }
            if (choice == 3) {
                for (User a : Data.datas) {
                    System.out.println(a.username);
                    System.out.println(a.password);
                    System.out.println(a.email);
                }
                }
            if (choice == 4) {
                break;
            }
            return;
    }

    }
}

