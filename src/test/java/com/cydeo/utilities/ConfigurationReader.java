package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    // 1- Create the object of Properties class
    // We need properties class to use methods coming from class like load(), getProperty("key")

    private static Properties properties = new Properties();
    // it is static bc we are using it in static method and static block----static part----
    //it is private bc I will be using only in this class----private part----


    static{// to use before everything else we put that bc I want to open the properties file and load to properties
        // object ONLY ONCE before reading.
        try {
            // 2- Create the object of FileInputStream
            // We need this object to open file as a stream in Java memory
            FileInputStream file = new FileInputStream("config.properties");

            // 3- Load the properties object using FileInputStream object
            // Load "properties" object with the "file" we opened using FileInputStream
            properties.load(file);
            //close the file after loading.If we do not close it will be not be giving any issue. it will be in java
            // memory, and it will take space from computer memory like Scanner
            file.close();

        }catch(IOException e) {
           e.printStackTrace();
            }
        }
    /**
     * This method is used to read value from a configuration.properties file
     * @param keyword --> key name in configuration.properties file
     * @return --> value for the key. returns null if key is not found
     * driver.get(ConfigurationReader.getProperty("env"))
     */


        public static String getProperty(String keyword){
        return properties.getProperty(keyword);
        }


}
