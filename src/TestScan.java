import java.util.Scanner;

public class TestScan {


    public static void main(String[] a){

        Scanner myobj = new Scanner(System.in);

        System.out.println("Enter Username");

      String userName = myobj.nextLine();

      System.out.println("UserName is :" + userName);

        System.out.println("Enter your phone num");

        Long phnum =myobj.nextLong();
        System.out.println("Phone Number is :" + phnum);
    }
}
