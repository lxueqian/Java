package javaCase.demo0327;

import java.util.Scanner;

public class ScannerSum {
    /*键盘输入两个int数字并且求和*
       Scanner三个步骤：导包、创建、使用
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input first number:");
        int a = sc.nextInt();
        System.out.println("input second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("result: "+sum);
    }

}
