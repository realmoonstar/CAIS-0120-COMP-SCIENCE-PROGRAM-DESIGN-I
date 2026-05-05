public class LoginValidation {

    private String expectedUserName;
    private String expectedPassword;
    private int maxAttempts;
    private int curAttempts;

    public LoginValidation(String initExpectedUsername,
                           String initExpectedPassword,
                           int initMaxAttempts) {

        expectedUserName = initExpectedUsername;
        expectedPassword = initExpectedPassword;
        maxAttempts = initMaxAttempts;
        curAttempts = 0;
    }

    public boolean setParameters(String correctUserName,
                                 String correctPassword,
                                 int maxAttempts) {

        if (correctUserName == null || correctUserName.equals("")) return false;
        if (correctPassword == null || correctPassword.equals("")) return false;
        if (maxAttempts <= 0) return false;

        this.expectedUserName = correctUserName;
        this.expectedPassword = correctPassword;
        this.maxAttempts = maxAttempts;
        this.curAttempts = 0;

        return true;
    }

    public int validateLogin(String username, String password) {

        if (curAttempts >= maxAttempts) {
            return 4; // attempts exceeded
        }

        curAttempts++;

        boolean userOK = username.equals(expectedUserName);
        boolean passOK = password.equals(expectedPassword);

        if (userOK && passOK) return 0;
        if (!userOK && passOK) return 1;
        if (userOK && !passOK) return 2;
        if (!userOK && !passOK) return 3;

        return 3;
    }
}
