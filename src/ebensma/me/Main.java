package ebensma.me;
import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import org.json.simple.JSONObject;

public class Main {

    public static void main(String[] args) throws IOException {
	    System.out.println("Hello Worlddd");
	    Properties prop = getKeys();
	    String access_token = prop.getProperty("access_token");
        System.out.println(access_token);
    }

    public static Properties getKeys() throws IOException {
        Properties prop=new Properties();
        FileInputStream fin= new FileInputStream("/Users/ebensman/IdeaProjects/GroupMeBots/config.properties");
        prop.load(fin);
        return prop;
    }

    public static String createJSON(String id, String message){
        /*JSONObject obj = new JSONObject();
        obj.put("bot_id", id);
        obj.put("text", message);
        return obj;*/
        return ("id:" + id + "&text:"+message);
    }

    public static boolean sendMessage(String url, String params) throws IOException {
        String urlParameters = params;
        byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
        URL myurl = new URL(url);
        HttpURLConnection con = (HttpURLConnection) myurl.openConnection();

    }

    public static String request(String access_token) throws IOException {
        String url = "https://localhost/?access_token=" + access_token;
        URL myurl = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) myurl.openConnection();
        con.setRequestMethod("GET");
        return "hello";
    }
}
