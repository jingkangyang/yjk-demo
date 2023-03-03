package com.yjk.demo;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.io.UnsupportedEncodingException;

/**建行密钥解密
 * Created by yangjingkang on 2020/10/22.
 */
public class TestCCB {

    public static void main(String[] args){
        String desKey = "0123456789201102";//DES密钥（用来解密从建行下载的密钥）
        String data = "测试加密内容abc123!@#asdasd";//从建行下载的密钥
        try {
            byte[] realDesKey = asc2bin(desKey);
            String desEncryptData = desEncrypt(data,realDesKey);
            System.out.println(desEncryptData);
            String desDecryptData = desDecrypt(desEncryptData,realDesKey);
            System.out.println(desDecryptData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] asc2bin(String hexString) throws UnsupportedEncodingException {
        byte[] hexbyte = hexString.getBytes("UTF-8");
        byte[] bitmap = new byte[hexbyte.length / 2];
        for (int i = 0; i < bitmap.length; i++) {
            hexbyte[i * 2] -= hexbyte[i * 2] > '9' ? 7 : 0;
            hexbyte[i * 2 + 1] -= hexbyte[i * 2 + 1] > '9' ? 7 : 0;
            bitmap[i] = (byte) ((hexbyte[i * 2] << 4 & 0xf0) | (hexbyte[i * 2 + 1] & 0x0f));
        }
        return bitmap;
    }

    /**
     * DES加密
     */
    public static String desEncrypt(String source, byte[] desKey) throws Exception {
        try {
            // 从原始密匙数据创建DESKeySpec对象
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(new DESKeySpec(desKey));
            // Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance("DES");
            // 用密匙初始化Cipher对象
            cipher.init(Cipher.ENCRYPT_MODE, securekey);
            // 现在，获取数据并加密
            byte[] destBytes = cipher.doFinal(source.getBytes("UTF-8"));
            StringBuilder hexRetSB = new StringBuilder();
            for (byte b : destBytes) {
                String hexString = Integer.toHexString(0x00ff & b);
                hexRetSB.append(hexString.length() == 1 ? 0 : "").append(hexString);
            }
            return hexRetSB.toString();
        } catch (Exception e) {
            throw new Exception("DES加密发生错误", e);
        }
    }

    /**
     * DES解密
     */
    public static String desDecrypt(String source, byte[] desKey) throws Exception {
        // 解密数据
        byte[] sourceBytes = new byte[source.length() / 2];
        for (int i = 0; i < sourceBytes.length; i++) {
            sourceBytes[i] = (byte) Integer.parseInt(source.substring(i * 2, i * 2 + 2), 16);
        }
        try {
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(new DESKeySpec(desKey));
            Cipher cipher = Cipher.getInstance("DES");
            // 用密匙初始化Cipher对象
            cipher.init(Cipher.DECRYPT_MODE, securekey);
            // 现在，获取数据并解密
            byte[] destBytes = cipher.doFinal(sourceBytes);
            return new String(destBytes,"UTF-8");
        } catch (Exception e) {
            throw new Exception("DES解密发生错误", e);
        }
    }

}
