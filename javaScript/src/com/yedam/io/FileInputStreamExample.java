package com.yedam.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		String path = "src/com/yedam/io/input.txt";
		FileInputStream fis = new FileInputStream(path);
		String outPath = "src/com/yedam/io/output.txt";  //output으로 인해 파일을 내보내면서 output.txt가 생긴다
		FileOutputStream fos = new FileOutputStream(outPath);
		int readByte; // readByte 값이 아무것도 못읽는 상태가 -1
		while ((readByte = fis.read()) != -1) { // -1이 아무것도 안나올때 값이기 떄문에 반대로 != 부정을 붙힘
			fos.write(readByte);
			System.out.print((char) readByte);
		}
		fis.close();
		fos.flush();
		fos.close();
	}

}
