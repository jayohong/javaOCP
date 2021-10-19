package com.lab.ocp.day17;

import java.io.File;
import java.io.IOException;


public class CreateTempFile {
    public static void main(String[] args) throws IOException {
        File path =new File("src\\main\\java\\com\\lab\\ocp\\day17\\temp");
        if(!path.exists()){//確認目錄是否存在
            path.mkdir();
        }
        File tempFile = File.createTempFile("temp", ".txt",path);
        System.out.println(tempFile.exists());
    }
}
