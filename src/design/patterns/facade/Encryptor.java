package design.patterns.facade;

import design.patterns.facade.methods.AESEncryptor;
import design.patterns.facade.methods.MD5Encryptor;
import design.patterns.facade.methods.SHAEncryptor;

import java.util.UUID;

public class Encryptor {

    private AESEncryptor aesEncryptor = new AESEncryptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();
    private SHAEncryptor shaEncryptor = new SHAEncryptor();

    public void encrypt(String text, EncryptMethods method){
        switch (method){
            case AES:
                aesEncryptor.encrypt(text);
                break;
            case MD5:
                md5Encryptor.encrypt(UUID.randomUUID().toString(), text);
                break;
            case SHA:
                shaEncryptor.encrypt(UUID.randomUUID().toString(), text, true);
        }
    }

    public enum EncryptMethods {
        AES,
        MD5,
        SHA
    }
}
