package assignment10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java. util.Scanner;



public class FileCounter {
	
	 private String input;
	 private int words;
	 private FileCounter counter;
	 private int lines;
	 private boolean done;
	 private int chars;
	 private String file;
 /**
    Constructs a FileCounter object.
 */
	 public FileCounter(){
		 words = 0;
		 lines = 0;
		 chars = 0;
		 input = "";
  
	 }
 
 /**
    Processes an input source and adds its character, word, and line
    counts to this counter.
    @param in the scanner to process
 */
	 public void read(Scanner in) throws FileNotFoundException{
     
     boolean done = false;
     while (!done)
     {
           while(in.hasNextLine())
           {
             lines++;
             words++;
             int j = 0;
             file = in.nextLine();
             input = input + file;
             for(int i = 1; i < file.length(); i++)
             {
             if(file.substring(j, i).equals(" "))
             {
               words++;
             }
             
             
             j++;
            
          }
            }
             char[] array = input.toCharArray();
             int num = array.length;
             chars += num;
             if(in.hasNextLine() == false)
             done = true;
          }
       
     
	 }
 /**
    Gets the number of words in this counter.
    @return the number of words
 */
	 public int getWordCount(){
		 return words;
	 }
 /**
    Gets the number of lines in this counter.
    @return the number of lines
 */
	 public int getLineCount(){    
    return lines;
	 }    
 /**
    Gets the number of characters in this counter.
    @return the number of characters
 */
	 public int getCharacterCount(){
     
     return chars;
	 }
 

}
