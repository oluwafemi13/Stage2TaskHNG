import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AcceptName acceptName = new AcceptName();

        System.out.println("please Input your first Name:\n");
        String firstname = input.nextLine();
        System.out.println("please input your Last Name:\n");
        String lastname = input.nextLine();

        acceptName.setName(firstname, lastname);

        String fullname = firstname+" "+lastname;

        System.out.println("your Names are:\n"+"First Name: "+acceptName.getFirstName()+"\n"+"Last Name: "+acceptName.getLastName());
        System.out.println("your full names are: "+ fullname);
    }
}
