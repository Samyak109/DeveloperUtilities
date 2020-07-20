package com;
import java.io.*;
import java.util.Arrays;

public class fun {
    public static void main(String[] args) {
        String absPath = "C:\\Users..";//your folder path
        File dir = new File(absPath);
        File[] files = dir.listFiles();//all the files in that folder are now in this array
        for(File file:files){ //iterate over this array
        String newName = file.getName().replaceAll("eg- .docx"
                ,"eg- .pdf"); // replace all occurences of first parameter to second parameter
        String newPath = absPath+"\\"+newName;//a new File object with new file name
        file.renameTo(new File(newPath));//utility method to rename the file
        }
        System.out.println("Changed");//success
    }
}
