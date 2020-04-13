package com.yedam.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) throws IOException {
		List<String> list = Arrays.asList("홍길동", "김유신", "하준원", "홍성우");
		// ==> name.txt 파일로 출력해보기
		File file = new File("c:/Temp/name.txt");
		FileOutputStream fos = new FileOutputStream(file);
		for (String b : list) {
			fos.write(b.getBytes());
		}
		fos.flush();
		fos.close();
	}
}