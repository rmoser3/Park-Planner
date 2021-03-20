package com.simplilearn.mavenproject;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.*;
public class program 
{
	static parkTable parkTable = new parkTable();
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }
	
	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
	    InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);
	      JSONObject json = new JSONObject(jsonText);
	      return json;
	    } finally {
	      is.close();
	    }
	  }

	public static void main(String[] args) throws IOException, JSONException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter park ID.");
//		int id = sc.nextInt();
		getData(0);		
	}
	
	public static void getData(int index) throws IOException, JSONException
	{
		System.out.println(parkTable.parkTable[index].name+", "+parkTable.parkTable[index].state);
		//Get activites
		String parkCode = parkTable.parkTable[index].parkCode;
		double latitude = parkTable.parkTable[index].latitude;
		double longitude = parkTable.parkTable[index].longitude;
		
		//Get campgrounds
		JSONObject json = readJsonFromUrl("https://developer.nps.gov/api/v1/campgrounds?parkCode="+parkCode+"&api_key=PGzlRku7ddyG0cVaQgWDemRomVMAUUBcpMC7lQ56");
		System.out.println(json);
		JSONArray campArray = json.getJSONArray("data");
//		System.out.println(campArray.length());
		JSONObject campJson = campArray.getJSONObject(0);
		JSONObject campJson2 = campArray.getJSONObject(1);
		JSONObject campJson3 = campArray.getJSONObject(2);
//		System.out.println(campJson);
//		System.out.println(campJson2);
//		System.out.println(campJson3);
		JSONArray campArray2 = campJson.getJSONArray("addresses"); //These arrays have two addresses per campsite - physical and mail
		JSONArray campArray3 = campJson2.getJSONArray("addresses"); //want description, addresses, contact, accessibility, amenities
		JSONArray campArray4 = campJson3.getJSONArray("addresses");
		System.out.println(campArray2.getString(0));
		System.out.println(campArray2.getString(1));
//	    JSONObject json = readJsonFromUrl("https://developer.nps.gov/api/v1/parks?parkCode="+parkCode+"&api_key=PGzlRku7ddyG0cVaQgWDemRomVMAUUBcpMC7lQ56");
//	    JSONArray actjarray = json.getJSONArray("data");
//	    JSONObject actjson2 = actjarray.getJSONObject(0);
//	    JSONArray actjarray2 = actjson2.getJSONArray("activities");
//	    for(int i = 0; i < actjarray2.length();i++)
//	    {
//	    	JSONObject actjson3 = actjarray2.getJSONObject(i);
//	    	System.out.println(actjson3.get("name"));
//	    }
		
	    //Get alerts
//	    json = readJsonFromUrl("https://developer.nps.gov/api/v1/alerts?parkCode="+parkCode+"&api_key=PGzlRku7ddyG0cVaQgWDemRomVMAUUBcpMC7lQ56");
//	    JSONArray jarray = json.getJSONArray("data");
//	    for(int i = 0; i < jarray.length(); i++)
//	    {
//	    	JSONObject json2 = jarray.getJSONObject(i);
//	    	System.out.println(json2.get("title"));
//	    	System.out.println(json2.get("description"));
//	    }
	    
	    //Get campgrounds
	    
	    
	    //Get weather
//	    json = readJsonFromUrl("https://api.weather.gov/points/"+String.valueOf(latitude)+","+String.valueOf(longitude));
//	    JSONObject properties = json.getJSONObject("properties");
//	    String forecastURL = properties.getString("forecast");
//	    json = readJsonFromUrl(forecastURL);
//	    JSONObject wJson = json.getJSONObject("properties");
//	    JSONArray wArray = wJson.getJSONArray("periods");
//	    for(int i = 0; i < wArray.length(); i++)
//	    {
//	    	JSONObject wJson2 = wArray.getJSONObject(i);
//	    	String time = wJson2.getString("name");
//	    	String temp = wJson2.getString("temperature");
//	    	String windSpeed = wJson2.getString("windSpeed");
//	    	String windDir = wJson2.getString("windDirection");
//	    	String forecast = wJson2.getString("detailedForecast");
//	    	System.out.print(time+": ");
//	    	System.out.print("The temperature is "+temp+"F. ");
//	    	System.out.print("The wind speed is "+windSpeed+" "+windDir+". ");
//	    	System.out.println(forecast);
//	    }	
	}
}
