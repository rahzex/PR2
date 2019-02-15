package com.stackroute.practice;

import java.io.*;

public class FileText {
    public String textToUpperCase(File file) throws IOException {
        File f1 = file;
        String result = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String st;
        while ((st = br.readLine()) != null)
            result = result + st;
        return result.toUpperCase();
    }

}
