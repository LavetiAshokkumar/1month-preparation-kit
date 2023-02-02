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
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String a = sc.nextLine();
            String b = a.toLowerCase();
            b = b.replace(" ", "");
            
            Set<Character> AS = new HashSet<Character>();
            for (int i = 0; i < b.length(); ++i) {
                AS.add(b.charAt(i));
            }
            if (AS.size() != 26) {
                System.out.print("not ");
            }
            System.out.println("pangram");
        }
    }
}
