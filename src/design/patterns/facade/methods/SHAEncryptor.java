package design.patterns.facade.methods;

public class SHAEncryptor {

    public void encrypt(String key, String text, boolean condition) {

        if (condition)
            System.out.println("<SHA>" + key + text + key + "<SHA>");
        else
            System.out.println("<SHA>" + key + text + "<SHA>");
    }
}
