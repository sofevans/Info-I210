import java.io.*;
import java.util.*;

public class Exercise17_01 {
    public static void main(String[] args) throws // catch no longer needed
            IOException { //satisfies nonexistent file; preform I/O operation
        try ( //defined block of code to be tested, will throw 
                // IOException if error present
                 //output stream for file Exercise17_01.txt
                PrintWriter output =                           
                        new PrintWriter(new FileOutputStream(  
                        "Exercise17_01.txt", true));
                ) {
            // displays random integer from 0-99999 as when i is less than 100
            for (int i = 0; i < 100; i++)
                // printed output String to the file
                output.print((int)(Math.random() * 100000) + " ");
        }
    }
}
