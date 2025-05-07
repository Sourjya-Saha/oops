import java.io.*;
class EmailValidator {
    public boolean isValid(String email) {
        if (email == null || email.isEmpty()) return false;
        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');
        if (atIndex == -1 || atIndex != lastAtIndex) return false;
        if (atIndex == 0 || atIndex == email.length() - 1) return false;
        int dotIndex = email.indexOf('.', atIndex);
        if (dotIndex == -1 || dotIndex == email.length() - 1) return false;
        if (email.contains(" ")) return false;
        if (email.contains("..")) return false;
        return true;
    }
}
 class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your email: ");
        String email = reader.readLine();
        EmailValidator validator = new EmailValidator();
        if (validator.isValid(email)) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }
    }
}
