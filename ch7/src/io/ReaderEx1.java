package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx1 {
	
	public static void main(String[] args) {
		// Reader, Writer : 문자기반
		Writer writer = null;
		Reader reader = null;
		try {
			reader = new FileReader("c:\\temp\\file1.txt");
			
			//appned : true => 기존 파일에 덧붙이기
			writer = new FileWriter("c:\\temp\\output1.txt",true);
			
			int data=0;
			while((data= reader.read())!=-1)
				writer.write(data);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
