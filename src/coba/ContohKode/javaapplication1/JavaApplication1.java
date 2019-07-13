package coba.ContohKode.javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Aleq
 */
public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String me, you, he;
        System.out.println("namaku: ");
        me = a.nextLine();
        System.out.println("namamu: ");
        you = a.next();
        System.out.println("dia: ");
        he = a.nextLine();
        System.out.printf("namaku %s\nnamamu %s\ndia %s",me,you,he);
    }
    
}
