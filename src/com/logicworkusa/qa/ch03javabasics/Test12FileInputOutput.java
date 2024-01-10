package com.logicworkusa.qa.ch03javabasics;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test12FileInputOutput {
    
	public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\saifu\\station\\workspace-qa-01\\JavaBasics\\doc\\myfile.txt");
            writer.write("Hello, Java!");
            writer.close();

            FileReader reader = new FileReader("C:\\Users\\saifu\\station\\workspace-qa-01\\JavaBasics\\doc\\myfile.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
	
}