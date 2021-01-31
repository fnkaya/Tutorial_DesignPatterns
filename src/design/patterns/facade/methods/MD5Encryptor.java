package design.patterns.facade.methods;

public class MD5Encryptor {

    public void encrypt(String key, String text) {
        System.out.println("<MD5>" + key + text + "<MD5>");
    }
}
