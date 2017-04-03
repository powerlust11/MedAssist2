package joeuser.medassist2.utilities;

/**
 * Created by power on 4/3/2017.
 */

import android.text.TextUtils;
import android.util.Patterns;

public class Validation {

    public static boolean validateFields(String name) {

        return !TextUtils.isEmpty(name);
    }

    public static boolean validateEmail(String string) {

        return !(TextUtils.isEmpty(string) || !Patterns.EMAIL_ADDRESS.matcher(string).matches());
    }
}
