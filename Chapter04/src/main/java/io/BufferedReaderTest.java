package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// 보조 스트림
		BufferedReader br = null;
		// 기반 스트림
		try {
			FileReader fr = new FileReader("./src/main/java/io/BufferedReaderTest.java");
			
			
			br = new BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found" + e);
		} catch (IOException e) {
			System.out.println("File Not Found" + e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("Error : " + e);
			}
		}
	}
}
