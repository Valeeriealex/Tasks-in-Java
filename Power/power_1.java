package Power;

import java.io.*;
import java.util.Scanner;

public class power_1 {
    public static void main(String[] args){
        int a=0, b=0, z=0;
        try{
            Scanner sc = new Scanner(new File("C:\Users\valer\OneDrive\Рабочий стол\Tasks in Java\Tasks in Java\Power\input.txt"));
            while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();}
            sc.close();
            }catch(FileNotFoundException e){e.printStackTrace();}
        
        try{
            PrintWriter pw = new PrintWriter(new File("output.txt"));
            pw.println(Math.pow(a, b));
            pw.close();}catch(Exception e){e.printStackTrace();}            
        }
}
