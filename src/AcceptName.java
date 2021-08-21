import java.util.Scanner;

public class AcceptName {
    Scanner input = new Scanner(System.in);
    private String FirstName;
    private String LastName;




    public void setName(String firstname, String lastname){

       this.LastName = lastname;
       this.FirstName = firstname;

       //this.FullName = lastname+firstname;

    }

    public String getFirstName(){

       // String firstname = this.FirstName;
        return FirstName;
    }

    public String getLastName(){

        return LastName;
    }


}
