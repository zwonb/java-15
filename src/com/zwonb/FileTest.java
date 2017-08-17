package com.zwonb;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个文件
 * Created by zyb on 2017/8/16.
 */
public class FileTest {

   public static void main(String[] args) {
       File file = new File("word.txt");

       if (file.exists()) {
//           boolean delete = file.delete();
//           if (delete) {
//               System.out.println("word.txt文件删除成功");
//           }else {
//               System.out.println("word.txt文件删除失败");
//           }
       }else {
           try {
               boolean newFile = file.createNewFile();
               if (newFile) {
                   System.out.println("word.txt文件创建成功");
               }else {
                   System.out.println("word.txt文件创建失败");
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

       if (file.exists()) {
           System.out.println("文件的名字："+file.getName());
           System.out.println("文件的长度："+file.length());
           System.out.println("文件是否隐藏："+file.isHidden());
       }else {
           System.out.println("文件不存在");
       }
   }
}
