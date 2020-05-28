package com.zhaoqi.cpu;

import java.security.MessageDigest;

/**
 * @author zhaoqi
 * @since 2020-04-26
 */
public class Md5Utils {

    public static String md5(String input) {
        StringBuffer sb = new StringBuffer();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] b = md.digest();

            for (int offset = 0; offset < b.length; ++offset) {
                int i = b[offset];
                if (i < 0) {
                    i += 256;
                }

                if (i < 16) {
                    sb.append("0");
                }

                sb.append(Integer.toHexString(i));
            }
        } catch (Exception var6) {
            return null;
        }

        return sb.toString();
    }


}
