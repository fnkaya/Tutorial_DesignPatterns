package design.patterns.facade;

class MD5Encryptor {

    public void encrypt(String key, String text) {
        System.out.println("<MD5>" + key + text + "<MD5>");
    }
}
