/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class TinyCompiler {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        keyin.next(); // int
        keyin.next(); // result
        keyin.next(); // =
        int first = keyin.nextInt(); // 第一個整數
        keyin.next(); // +
        int second = keyin.nextInt(); // 第二個整數
        keyin.next(); // ;
        int third = keyin.nextInt(); // 第三個整數
        keyin.next();
        System.out.println("MOVI R1, " + first);
        System.out.println("MOVI R2, " + second);
        System.out.println("ADD R0, R1, R2");
        System.out.println("MOVI R2, " + third);
        System.out.println("ADD R0, R0, R2");
        System.out.println("STORE [0], R0");
 }
}
