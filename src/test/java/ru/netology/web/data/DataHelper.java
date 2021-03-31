package ru.netology.web.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
@Data

public class DataHelper {
    private DataHelper() {}

    @Value
    public static class AuthInfo {
        private String id;
        private String login;
        private String password;
        private String passCode;
    }

    static String user1 = "$2a$10$HwcFKUs4qK.0ci/sczNrs.wrFgyl8ueJ4guLEsj1CbuFGf290JJEC";
    static String user2 = "$2a$10$juZ3z4hmOMnAjKfE.Y0kB.IVujBMeAMOTaGO4mO8jgklXoP.myzlq";


    public static AuthInfo getAuthInfo() {

        return new AuthInfo("1","vasya", "qwerty123", user2);
    }

    public static AuthInfo getOtherAuthInfo() {

        return new AuthInfo("2", "petya", "123qwerty", user1);
    }

    public static AuthInfo getInvalidPass() {
        return  new AuthInfo("1", "vasya", "password", "");
    }


    @Value
    public static class VerificationCode {
        private String code;
    }
}
