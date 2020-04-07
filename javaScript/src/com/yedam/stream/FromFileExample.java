package com.yedam.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileExample {
	public static void main(String[] args) throws IOException {  //IOExcepton 입출력 제외
		Path path = Paths.get("src/com/yedam/stream/list.txt");
		Stream<String> strStream = Files.lines(path, Charset.defaultCharset()); //Charset.defaultCharset 언어 인코딩하는거
		strStream.forEach(s -> System.out.println(s.toString()));
	}
}
