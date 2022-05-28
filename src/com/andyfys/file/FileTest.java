package com.andyfys.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Andyfys
 * @version 1.0
 */
public class FileTest {
    public static void main(String[] args) {

    }


    @Test
    public void fileCreate() throws IOException {
        String pathName = "e:\\news01.txt";
        File file = new File(pathName);
        System.out.println("创建成功");
        file.createNewFile();
    }

    @Test
    public void creatFile02() throws IOException {
        File parentPath = new File("e:\\");
        String childName = "news02.txt";
        File file = new File(parentPath, childName);
        System.out.println("创建成功");
        file.createNewFile();
    }

    @Test
    public void fileCreat03() throws IOException {
        String parentPath = "e:\\";
        String childPath = "news03.txt";
        File file = new File(parentPath, childPath);
        System.out.println("创建成功");
        file.createNewFile();

    }


    @Test
    public void fileMethod() {
        File file = new File("e:\\new1.txe");
        System.out.println("文件名：" + file.getName());
        System.out.println("文件父类路径：" + file.getParent());
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件大小：" + file.length());
        System.out.println("是否为文件：" + file.isFile());
        System.out.println("文件是否为绝对路径：" + file.isAbsolute());
        System.out.println("文件是否为目录：" + file.isDirectory());
        System.out.println("文件是否存在：" + file.exists());
    }

    @Test
    public void isExist() {
        String path = "e:\\news01.txt";
        File file = new File(path);
        if (file.exists()) {
            file.delete();
            System.out.println("删除成功");
        } else {
            System.out.println("删除不成功");
        }
    }


    @Test
    public void dirExist(){
        String dir = "d:\\demo";
        File file = new File(dir);
        if(file.exists()){
            file.delete();
            System.out.println("删除成功");
        } else {
            System.out.println("目录不存在");
        }
    }
    @Test
    public void dirsExist(){
        String dir = "d:\\demo\\a\\b\\c";
        File file = new File(dir);
        if(file.exists()){
            file.delete();
            System.out.println("删除成功");
        } else {
            file.mkdirs();
            System.out.println("目录创建成功");
        }
    }

}
