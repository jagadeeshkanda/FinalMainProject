package Testdata;

import org.json.JSONObject;

public class TestData {

    private final DataLoader loader;

    public TestData(String fileName) {
        this.loader = DataLoader.getInstance(fileName);
    }

    // Example: Get user by index
    public String getUserEmail(int index) {
        return loader.getJsonArray().getJSONObject(index).optString("email");
    }

    // Example: Get application config from JSON
    public String getAppName() {
        return loader.getJsonData().optString("appName");
    }

    // Example: Get nested object safely
    public JSONObject getAddress(int index) {
        return loader.getJsonArray().getJSONObject(index).optJSONObject("address");
    }
}



