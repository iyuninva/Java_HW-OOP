package Library_5.Views;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {

    String patternName = "^\\S+$";
    Pattern pattern = Pattern.compile(patternName, Pattern.MULTILINE);
    String patternNumberPhone= "^\\d{11}$";
    Pattern patternNumber = Pattern.compile(patternNumberPhone);

    public boolean checkFirstName(String firstName) {
        Matcher matcher = pattern.matcher(firstName);
        return !matcher.find();
    }

    public boolean checkLastName(String firstName) {
        Matcher matcher = pattern.matcher(firstName);
        return !matcher.find();
    }

    public boolean checkNumberPhone(String phone) {
        Matcher matcher = patternNumber.matcher(phone);
        return !matcher.find();
    }

}
