package Testdata;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;


public class DataLoader {
	
	private static DataLoader instance;
    private JSONObject jsonData;
    private JSONArray jsonDataArray;

	
	private DataLoader(String filename) {
		loadJson( filename);
	}
	

	public void loadJson(String fileName) {
        try  {
        	ClassLoader classloader = getClass().getClassLoader();
        	InputStream is = classloader.getResource("com/project/auto/testData/"+fileName).openStream();

        	if (is == null) {
                throw new RuntimeException("File not found: " + fileName);
            }
        	JSONTokener token = new JSONTokener (is);
        	Object parse = token.nextValue();
        	if(parse instanceof JSONObject) {
        		jsonData = (JSONObject)parse;
        		jsonDataArray =null;
        	}else if(parse instanceof JSONArray) {
        		jsonDataArray = (JSONArray)parse;
        		jsonData =null;
        	}
            
        } catch (IOException e) {
            throw new RuntimeException("Failed to read JSON file: " + fileName, e);
        }
    }
	
	public static DataLoader getInstance(String filename) {
		if(instance == null) {
			instance = new DataLoader(filename) ;
		}
		return instance;
	}
	
	public JSONObject getJsonData() {
        return jsonData;
    }

    public JSONArray getJsonArray() {
        return jsonDataArray;
    }
	
	// Get value by key (top-level)
	public String getValue(String key) {
	    if (jsonData != null) {
	        return jsonData.optString(key, null);
	    }
	    throw new RuntimeException("JSON data is not a single object");
	}


    // Get JSONObject (nested object)
	public JSONObject getObject(int index) {
	    if (jsonDataArray != null) {
	        return jsonDataArray.getJSONObject(index);
	    }
	    throw new RuntimeException("JSON data is not an array");
	}
    
 

    // Get value by key from a specific object in the array
    public String getValue(int index, String key) {
    	if (jsonDataArray != null) {
        return jsonDataArray.getJSONObject(index).optString(key, null);
    }
    throw new RuntimeException("JSON data is not an array");
    }
    
    // Get JSONArray by key from the top-level JSONObject
    public JSONArray getArray(String key) {
        if (jsonData != null) {
            return jsonData.optJSONArray(key);
        }
        throw new RuntimeException("JSON data is not a single object");
    }
    // Get total number of objects
    public int size() {
        if (jsonDataArray != null) return jsonDataArray.length();
        if (jsonData != null) return 1; // single object
        return 0;
    }
    
 // Get nested JSONArray from a parent array at a specific index
    public JSONArray getNestedArray(String key, int outerIndex) {
        JSONArray outer = getArray(key);
        if (outer != null) {
            return outer.optJSONArray(outerIndex);
        }
        throw new RuntimeException("No nested array found at index " + outerIndex);
    }

}
