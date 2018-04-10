package net.ubilife.hellogit;

import java.io.IOException;

public class HelloGit {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Hello, git");
		
		String path = "C:\\Users\\Mark\\Documents\\College";
		
		Runtime.getRuntime().exec("explorer.exe /select," + path);

	}
}