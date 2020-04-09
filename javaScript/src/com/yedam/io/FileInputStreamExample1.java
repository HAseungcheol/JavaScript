package com.yedam.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample1 {
	public static void main(String[] args) throws IOException {
		String path = "src/com/yedam/io/test.jpg";
		FileInputStream fis = new FileInputStream(path);
		
		
		int readByte; // readByte 값이 아무것도 못읽는 상태가 -1
		long start = System.nanoTime();
		while ((readByte = fis.read()) != -1) { // -1이 아무것도 안나올때 값이기 떄문에 반대로 != 부정을 붙힘

		}
		fis.close();
		long end = System.nanoTime();
			System.out.println((end - start)+"ns");
			System.out.println("===============end============");

			FileInputStream fis2 = new FileInputStream(path);
			byte[] buf = new byte[100];
			start = System.nanoTime();
			while((readByte = fis2.read(buf))!=-1) {		//buf 배열이 들어가서 배열의 크기가 나옴
			}
			fis2.close();
			end = System.nanoTime();
			System.out.print((end - start)+"ns");
	}
}
