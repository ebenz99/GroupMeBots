package ebensma.me;
import java.io.*;
import java.util.Properties;

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

    public static void auth(){
        //https://oauth.groupme.com/oauth/authorize?client_id=+clientid
        int a = 1;
    }
}
