package net.ubilife.hellogit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleLibraryExample {

	private static final String jsonFilePath = "C:\\Users\\Mark\\Documents\\College\\UMUC\\CMSC495\\jsonFile.json";

	public static void main(String[] args) {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("URL", "www.javacodegeeks.com");

		jsonObject.put("Site Name", "Java Code Geeks");

		jsonObject.put("Members", 120);

		JSONArray jsonArray = new JSONArray();

		jsonArray.add("Jack");
		jsonArray.add("James");

		jsonObject.put("Names", jsonArray);

		try {

			FileWriter jsonFileWriter = new FileWriter(jsonFilePath);
			jsonFileWriter.write(jsonObject.toJSONString());
			jsonFileWriter.flush();
			jsonFileWriter.close();
			System.out.print(jsonObject);

		} catch (IOException e) {
			e.printStackTrace();
		}

		JSONParser jsonParser = new JSONParser();

		try {

			FileReader fileReader = new FileReader(jsonFilePath);

			JSONObject jsonObject2 = (JSONObject) jsonParser.parse(fileReader);

			String siteName = (String) jsonObject2.get("Site Name");

			System.out.println("\nSite Name: " + siteName);

			long members = (long) jsonObject2.get("Members");

			System.out.println("Members: " + members);

			String url = (String) jsonObject2.get("URL");

			System.out.println("URL: " + url);

			JSONArray names = (JSONArray) jsonObject2.get("Names");

			Iterator i = names.iterator();

			while (i.hasNext()) {

				System.out.println(" " + i.next());

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
