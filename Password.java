import java.util.regex.*;

public class Password {
    private String password;

    Password(String n){
        password = n;
    }

    void printPassword(){
        System.out.println(password);
    }

    static boolean checkPassword(String pword){

        //Regular expresiiiion for the individual components of an Ideal password
        String DigitRegex = "\\d+";
        String UpperCaseRegex = "[A-Z]";
        String LowerCaseRegex = "[a-z]";
        String SpecialChatactersRegex = "[@$%&]";

        //Final Regular expression that combines all the criteria for an ideal password
        String FullPasswordValidator = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&]).{6,20}$";

        Matcher digiMatcher = Pattern.compile(DigitRegex).matcher(pword);
        Matcher uppMatcher = Pattern.compile(UpperCaseRegex).matcher(pword);
        Matcher lowMatcher = Pattern.compile(LowerCaseRegex).matcher(pword);
        Matcher spMatcher = Pattern.compile(SpecialChatactersRegex).matcher(pword);

        Matcher fullMatcher = Pattern.compile(FullPasswordValidator).matcher(pword);



        if (pword.length() < 6){
            System.out.println("Password too short must be 6 chars or longer\n");
            return false;
        }else if(!digiMatcher.find()){
            System.out.println("Password must contain a Digit \n");
            return false;
        }else if(!uppMatcher.find()){
            System.out.println("Password must constain an uppercase letter \n");
            return false;
        }else if(!lowMatcher.find()){
            System.out.println("Password must constain a lowercase letter \n");
            return false;
        }else if(!spMatcher.find()){
            System.out.println("Password must constain @ or $ or % or & \n");
            return false;
        }else {
            return true;
        }

    }

}
