package net.ubilife.hellogit;

import java.io.File;
import java.text.DecimalFormat;

import javafx.scene.control.Label;

public class TestTest {

	public static void main(String args[]) {
		
		Label userNameLabel;
		String userName;
		
		String homePath = System.getProperty("user.home"); //pulls home directory
		String[] arOfKeys = homePath.split(":?\\\\");
		userName = arOfKeys[2];
		
		userNameLabel = new Label("userName");

	}
}
