package com.zwonb;

import java.io.*;

/**
 * Created by zyb on 2017/8/17.
 */
public class DataIOTest {
    
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("word.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            try {
                dataOutputStream.writeUTF("使用writeUTF写入数据");
                dataOutputStream.writeChars("使用writeChars写入数据");
                dataOutputStream.writeBytes("使用writeBytes写入数据");
                dataOutputStream.close();
                FileInputStream inputStream = new FileInputStream("word.txt");
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                System.out.println(dataInputStream.readUTF());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
