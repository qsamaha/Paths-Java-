package com.example.quickMaths;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        try {
            Path fileToDelete =  FileSystems.getDefault().getPath("Examples",  "file1copy.txt");
            Files.delete(fileToDelete);

//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples" , "file1.txt");
//            Files.move(fileToMove, destination);
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
