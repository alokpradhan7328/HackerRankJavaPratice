import java.io.*;
import java.util.*;

public class ParallelogramArea {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int B = sc.nextInt();
       int H = sc.nextInt();
       if(B<=0 || H<=0)
       {
           System.out.println("java.lang.Exception: Breadth and height must be positive");
       }
       else
       {
           int area = B*H;
           System.out.println(area);
       }
       sc.close();
    }
}