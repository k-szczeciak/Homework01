package pl.coderslab.collection;

public class Main3 {

    public static final String EMAIL_PATTERN = "[^0-9]{1}[a-zA-Z0-9|_|-|.]{4,}@([a-zA-Z0-9]{2,}\\.)+[a-zA-Z]{2,3}";

    public static void main(String[] args) {
        String testString = "szczeciak@poczta.pl";
        System.out.println(verifyLogin(testString));
    }

    static boolean verifyLogin(String email){
        return email.matches(EMAIL_PATTERN);
    }
}
