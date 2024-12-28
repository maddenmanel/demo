package algorithm.day8;

public class Copilot {

    public Copilot() {
    }

    // print a message "hello world"
    public void printMessage() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        // different from the previous snippets, this snippet does not have a main method
        // so it will not be executed

    }

    // 根据github用户名获取密码
    private String getPassword(String username) {
        if (username == null) {
            return "empty username";
        }
        if (username.equals("github")) {
            return "github password";
        } else {
            return "unknown user";
        }
    }
}
