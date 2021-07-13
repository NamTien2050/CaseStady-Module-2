package hotelmanager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseNameRegex {
    public final String EMAIL_REGEX = "^[0-9a-z]{3,7}\\.(@[a-z]{4}\\.[a-z]{3})$";

    //        public final String password_REGEX= "^([A-Z]{1,}+[a-z]{1,}+[0-9]{1,}){12}$";
    public UseNameRegex() {
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
