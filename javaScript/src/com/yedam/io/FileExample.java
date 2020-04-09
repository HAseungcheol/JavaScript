package com.yedam.io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;

public class FileExample {

	public static void main(String[] args) throws URISyntaxException, IOException {
		File dir = new File("c:/Temp/Dir");  //읽어 오는거
		File file1 = new File("c:/Temp/file1.text");
		File file2 = new File("c:/Temp/file2.text");
		File file3 = new File(new URI("file:///c:/Temp/file3.text"));
		
		if(dir.exists() == false) //c:/Temp/Dir 가 없으면 만들어라 밑에 디렉토리와 파일을
			dir.mkdirs();
		if(file1.exists() == false)
			file1.createNewFile();
		if(file2.exists() == false)
			file2.createNewFile();
		if(file3.exists() == false)
			file3.createNewFile();
	
		File temp = new File("c:/Temp");
		File[] files = temp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : files) {
			System.out.print(sdf.format(file.lastModified()));
			if(file.isDirectory())
				System.out.print("\t<Dir>\t\t" + file.length()+"\t"+ file.getName()); //디렉토리 크기
			else
				System.out.print("\t\t\t" + file.length()+"\t"+file.getName()); //파일크기
			System.out.println();
			
		}
	}

}
