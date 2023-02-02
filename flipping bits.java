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
        int n = in.nextInt();
        long max = Integer.MAX_VALUE;
        max = max * 2 + 1;
        for(int i = 0; i < n; i++) {
            System.out.println(~in.nextLong() & max);
        }
    }
}
