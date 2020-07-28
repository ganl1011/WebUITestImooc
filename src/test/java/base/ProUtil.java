package base;

import org.openqa.selenium.By;

import java.io.*;
import java.util.*;

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
    public List<String> getPro(String str){

        if (prop.containsKey(str)){
            String strValue = prop.getProperty(str);
            List<String> strList = new ArrayList<String>();
            String[] strSplit = strValue.split(":");
            for(int i=0;i<strSplit.length;i++){
                String value = str.split(":")[i];
                strList.add(value);
            }
            return strList;
        }
        else
            return null;
    }
    public  By proBy(String key){
        List<String> strList = new ArrayList<String>();
        if (prop.containsKey(key)) {
            String strValue = prop.getProperty(key);
            String strSplit[] = strValue.split(":");
            for (int i = 0; i < strSplit.length; i++) {
                String value = strValue.split(":")[i];
                System.out.println(value);
                strList.add(value);
            }
        }
        if("name".equals(strList.get(0))){
           return By.name(strList.get(1));
        }
        if("id".equals(strList.get(0))){
            return By.id(strList.get(1));
        }
        if ("classname".equals(strList.get(0))){
            return By.className(strList.get(1));
        }
        if("xpath".equals(strList.get(0))) {
            return By.xpath(strList.get(1));
        }
        return null;
    }
}
