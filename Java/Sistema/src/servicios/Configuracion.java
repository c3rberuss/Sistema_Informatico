/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josuee
 */


public class Configuracion {
    
    private static String configFilePath;
    private static Properties configProp;
    private static InputStream input;
    private static OutputStream output;
    
    
    public Configuracion(){
        
        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.equals("linux")){
            configFilePath = "/home/"+System.getProperty("user.name")+"/config.properties";
        }else{
            configFilePath = "C:\\Users\\"+System.getProperty("user.name").toLowerCase()+"\\config.properties";
        }
        
       configProp = new Properties();
       input = null;
       output = null;
    }
    

    /**
     * Gets cofig property from config.properties file.
     * @param propName (Property name)
     * @return String
     */
    public String getConfProperty(String propName)
    {
        String ret = "";
        
        try 
        {
            input = new FileInputStream(configFilePath);
            
            // load config file
            configProp.load(input);
            
            // get property value
            ret = configProp.getProperty(propName);            
        } 
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        finally 
        {
            if (input != null) 
            {
                try 
                {
                    input.close();
                }
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
        
        return ret;
    }
    
    /**
     * Sets cofig property from config.properties file.
     * @param propName (Property name)
     * @param propValue (Property value)
     * @return Boolean
     */
    public Boolean setConfProperty(String propName, String propValue)
    {
        Boolean ret = false;
        
        int size = Configuracion.getNumKeysConfigFile();
        String config[][] = new String[size][2];
        
        // Array with the config file data
        config = Configuracion.getConfigFileValues();
        
        // Set the new value to the array
        for(int i=0; i < config.length; i++)
        {
            if(config[i][0].equals(propName))
            {
                config[i][1] = propValue;
                System.out.println(config[i][0] + " - " + config[i][1]);
            }
        }
        
        // Save the new .properties file.
        try 
        {
            output = new FileOutputStream(configFilePath);
            
            // sets value to property
            for(int i=0; i < config.length;i++)
            {
                configProp.setProperty(config[i][0], config[i][1]);
            }
            
            // save new changes on 'config.properties' file
            configProp.store(output, null);
        
            ret = true;
        } 
        catch (IOException io) 
        {
            io.printStackTrace();
        }
        finally 
        {
            if (output != null) 
            {
                try 
                {
                    output.close();
                } catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
        return ret;
    }
    
    /**
     * Gets the number of keys in the properties file.
     * @return int
     */
    private static int getNumKeysConfigFile()
    {
        int ret = 0;
        
        try
        {
            InputStream is = new FileInputStream(configFilePath);
            configProp.load(is);
            
            ret = configProp.size();
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    }
    
    /**
     * Returns an array with the keys and values from the properties file.
     * @return array[][]
     */
    public static String[][] getConfigFileValues()
    {
        int con = 0;
        int size = Configuracion.getNumKeysConfigFile();                
        
        String ret[][] = new String[size][2];
        
        for (Enumeration e = configProp.keys(); e.hasMoreElements();)
        {
            Object obj = e.nextElement();
            
            ret[con][0] = obj.toString();
            ret[con][1] = configProp.getProperty(obj.toString());
            con++;
        }
        
        return ret;
    }
    
    /**
     * Prints in console the content of the properties file.
     */
    public static void printPropertiesFile()
    {
        int size = Configuracion.getNumKeysConfigFile();                
        String ret[][] = new String[size][2];
        
        ret = Configuracion.getConfigFileValues();
        
        System.out.println("Properties file:\n");
        for(int i = 0; i < ret.length; i++)
        {
            System.out.println("[" + i + "] " + ret[i][0] + " => " + ret[i][1]);
        }
        System.out.print("\n");
    }
    
}

