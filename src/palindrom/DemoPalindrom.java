package palindrom;

import java.util.Locale;

public class DemoPalindrom {

    public static void main(String[] args) {

        System.out.println("isPalindrom(\"Otto\") = " + isPalindrom("Otto".toLowerCase()));
        System.out.println("isPalindrom(\"Eine Horde bedrohe nie!\") = " + isPalindrom("Eine Horde bedrohe nie!".toLowerCase()));
    }
    
    public static boolean isPalindrom(String text) {
        System.out.println("text = " + text);
        // Ihr Code
        if (text.length() <= 1)
            return true;

        if (text.charAt(0) == text.charAt(text.length()-1)){
            // geht's weiter
            return isPalindrom(text.substring(1, text.length() - 1));
        }
        else
            return false;
    }
}
