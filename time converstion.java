import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static String timeConversion(String s) {
        String ap=s.substring(8);
        String hour=s.substring(0,2);
        if(ap.equals("AM")){
            if(hour.equals("12")){
                hour="00";
            }
        }
        if(ap.equals("PM")){
            if(hour.equals("12")){
                hour="12";
            }
            else
            {
                hour=""+(Integer.parseInt(hour)+12);
            }      
            }
            
             return hour+s.substring(2,8);
        } 
    }
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
