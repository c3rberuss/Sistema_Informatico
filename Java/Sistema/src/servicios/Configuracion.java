/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import factory.Factory;
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
    private static Factory factory;
    
    
    public Configuracion(){
        
        factory = new Factory();
        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.equals("linux")){
            setConfigFilePath("/home/"+System.getProperty("user.name")+"/config.properties");
        }else{
             setConfigFilePath("C:\\Users\\"+System.getProperty("user.name").toLowerCase()+"\\config.properties");
        }
        
       setConfigProp(factory.properties());
       input = null;
       output = null;
    }

    public static String getConfigFilePath() {
        return configFilePath;
    }

    public static void setConfigFilePath(String aConfigFilePath) {
        configFilePath = aConfigFilePath;
    }

    public static Properties getConfigProp() {
        return configProp;
    }

    public static void setConfigProp(Properties aConfigProp) {
        configProp = aConfigProp;
    }

    public static InputStream getInput() {
        return input;
    }

    public static void setInput(InputStream aInput) {
        input = aInput;
    }

    public static OutputStream getOutput() {
        return output;
    }

    public static void setOutput(OutputStream aOutput) {
        output = aOutput;
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
            setInput(factory.fileInputStream(getConfigFilePath()));
            
            // load config file
            getConfigProp().load(getInput());
            
            // get property value
            ret = getConfigProp().getProperty(propName);            
        } 
        catch (IOException ex)
        {
        }
        finally 
        {
            if (getInput() != null) 
            {
                try 
                {
                    getInput().close();
                }
                catch (IOException e) 
                {
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
        for (String[] config1 : config) {
            if (config1[0].equals(propName)) {
                config1[1] = propValue;
                System.out.println(config1[0] + " - " + config1[1]);
            }
        }
        
        // Save the new .properties file.
        try 
        {
            setOutput(new FileOutputStream(getConfigFilePath()));
            
            // sets value to property
            for (String[] config1 : config) {
                getConfigProp().setProperty(config1[0], config1[1]);
            }
            
            // save new changes on 'config.properties' file
            getConfigProp().store(getOutput(), null);
        
            ret = true;
        } 
        catch (IOException io) 
        {
        }
        finally 
        {
            if (getOutput() != null) 
            {
                try 
                {
                    getOutput().close();
                } catch (IOException e) 
                {
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
            InputStream is = factory.fileInputStream(getConfigFilePath());
            getConfigProp().load(is);
            
            ret = getConfigProp().size();
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
        
        for (Enumeration e = getConfigProp().keys(); e.hasMoreElements();)
        {
            Object obj = e.nextElement();
            
            ret[con][0] = obj.toString();
            ret[con][1] = getConfigProp().getProperty(obj.toString());
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

