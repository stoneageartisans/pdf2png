package com.stoneageartisans.pdf2png;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Logger
{
    public static final String LOG_FILE = "pdf2png.log";
    
    public static void log(String message)
    {
        BufferedWriter writer;
        
        try
        {
            writer = new BufferedWriter(new FileWriter(LOG_FILE));
            writer.append(message);     
            writer.append(System.getProperty("line.separator"));
            writer.close();
        }
        catch(IOException ex)
        {
            System.out.println("Unable to open '" + LOG_FILE + "' file.");
        }
    }
}
