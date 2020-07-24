package base;

import org.openqa.selenium.By;

import java.io.*;
import java.util.Properties;

public class ProUtil {
    Properties prop = new Properties();
    BufferedInputStream inputFile;
    String path;

    public ProUtil(String path) {
        this.path = path;
        this.prop = readPro();
    }
    private Properties readPro(){
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(path);
            inputFile = new BufferedInputStream(inputStream);
            properties.load(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
    public String getPro(String str){

        if (prop.containsKey(str)){
            return prop.getProperty(str);
        }
        else
            return "key未找到";
    }

    public static By proBy(String type , String value){
        if("name".equals(type)){
           return By.name(value);
        }
        if("id".equals(type)){
            return By.id(value);
        }
        if ("classname".equals(type)){
            return By.className(value);
        }
        if("xpath".equals(type)) {
            return By.xpath(value);
        }
        return null;
    }
}
