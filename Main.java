import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        boolean cont = false;
        String FinalPassWord;

        Scanner getPassword = new Scanner(System.in);

        //loop ensures that only the ideal password gets through
        do{
            System.out.println("Enter your password");
            String passCandidate = getPassword.nextLine();
            FinalPassWord = passCandidate;
            cont = Password.checkPassword(passCandidate);

        }while(!cont);

        Password userPassword = new Password(FinalPassWord);

    }
}