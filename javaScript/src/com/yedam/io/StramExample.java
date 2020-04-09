package com.yedam.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StramExample {

	public static void main(String[] args) throws IOException {
		List<String> list = Arrays.asList("홍길동","김유신","하준원","홍성우");
		FileOutputStream fr = new FileOutputStream("src/com/yedam/io/name.text");
		for(String b: list) {
			fr.write(b.getBytes());
		}
		fr.flush();
		fr.close();
		System.out.println("복사가 잘 되었습니다");
		//name.txt
	}

}
