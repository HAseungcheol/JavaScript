package com.yedam.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/com/yedam/io/test.jpg"); //읽기 전용
		BufferedInputStream bis = new BufferedInputStream(fis); //버퍼를 거치면 더 빨리 결과가 나온다
		FileOutputStream fos = new FileOutputStream("src/com/yedam/io/test.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// int readByte = bis.read(); //예외처리
		int readByte;
		while ((readByte = bis.read()) != -1) {
			bos.write(readByte);
		}
		bos.flush();bos.close();fos.flush();fos.close();
		bis.close();fis.close();	
		System.out.println("end");

	}
}
