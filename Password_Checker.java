import java.util.*;
public class Password_Checker{
    public static int checkStrength(String password){
        if(password.length()<8){
           return 1;
        }
        if(!isdigit(password)){
            return 1;
        }
        if(!containsUppercase(password)){
            return 2;
        }
        if(!containSpecialCharS(password)){
            return 2;
        }
    return 3;  
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("\n--------:: PasswordnStrength Checker ::--------");
        System.out.println();
        System.out.print("Enter your password :: ");
        String password = s.nextLine();
        System.out.println();
        System.out.println("Feedback On Your Provided Password :: ");
        System.out.println("-----------------------------------------------");
        System.out.println();
        int Strength = checkStrength(password);
        switch (Strength) {
            case 1:System.out.println("Weak password, Reset Again!!");
                break;
        
            case 2:System.out.println("Moderate password, Add some Special Characters!!");
                break;
             
            case 3:System.out.println("Strong password, You Can Go!!");
                break; 
                
            default:System.out.println("INVALID, Enter Again!!");  
        }
        System.out.println();
    }

    public static boolean isdigit(String password){
        for(char c: password.toCharArray()){
            if(Character.isDigit(c)){
            return true;
            }
        }
    return false;
    }

    public static boolean containSpecialCharS(String password){
        String spchars="!@#$%^&*_+-:<>";
        for(char c: password.toCharArray()){
            if(spchars.contains(String.valueOf(c))){
                return true;
            }
        }
    return false;
    }

    public static boolean containsUppercase(String password){
        for(char c: password.toCharArray()){
            if(Character.isUpperCase(c)){
                return true;
            }
        }
    return false;
    
    }
}