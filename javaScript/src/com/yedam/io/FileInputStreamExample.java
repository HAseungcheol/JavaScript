package com.yedam.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException{
		String path = "src/com/yedam/io/input.txt";
		FileInputStream fis = new FileInputStream(path);
		int readbyte = fis.read();
		System.out.println((char)readbyte);
		fis.close();
	}

}
