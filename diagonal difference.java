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

public class Result {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int n ;
        int a = 0 ; int b = 0;
        n = Integer.parseInt(in.nextLine());
        for(int i =0 ; i < n; i++){
            String str[] = in.nextLine().split(" ");
            a = a + Integer.parseInt(str[i]);
            b = b + Integer.parseInt(str[n-1-i]);
        }
        
        int Diff = Math.abs(a - b);        
        System.out.println(Diff);
    }    
}
