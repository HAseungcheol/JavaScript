package com.yedam.io;

import java.io.IOException;
import java.io.PrintStream;

public class SystemOutExample {

	public static void main(String[] args) throws IOException {
		PrintStream ps = System.out;
		String text = "한글은달리처리해야합니다.";
		byte[] cbuf = text.getBytes(); //2개씩 잘라서 넣는다 위 text를
		int readChar; //변수 선언
		ps.write(cbuf);
		

	}

}
