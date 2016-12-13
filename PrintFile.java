package com.sd.io;

import java.io.File;
import java.io.FileReader;

public class PrintFile {
  void print() throws Exception {
    File f = new File("noname.txt");
    FileReader fr = new FileReader(f);
  }
  public static void main(String[] args){
		PrintFile pf=new PrintFile();
		try {
			pf.print();
		}
		catch(FileNotFoundException e){
			System.out.println("File not Found!");
		}
		catch (IOException e) { 
			e.printStackTrace(); 
		}  
	}
}