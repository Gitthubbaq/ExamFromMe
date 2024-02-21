package topshiriq3;

import java.io.*;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

         InputStream in = null;
        OutputStream out = null;
        try {
             in = new FileInputStream("D:\\javafolder\\ExamFromMe\\hasnumber.txt");
            Scanner sc = new Scanner(in);
             int a1 = sc.nextInt();
             int a2 = sc.nextInt();
             int c = a1+a2;

            out = new FileOutputStream("CalculateNumber.txt");
                String result = Integer.toString(c);
                out.write(result.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
