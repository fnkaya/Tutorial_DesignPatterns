package design.patterns.facade;

public class Test {

    public static void main(String[] args) {

        Encryptor encryptor = new Encryptor();

        encryptor.encrypt("furkan kaya", Encryptor.EncryptMethods.AES);
        encryptor.encrypt("furkan kaya", Encryptor.EncryptMethods.MD5);
        encryptor.encrypt("furkan kaya", Encryptor.EncryptMethods.SHA);
    }
}
