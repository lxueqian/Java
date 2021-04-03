package javaCase.demo0327;

import java.util.Scanner;

public class StringCount {
    /*键盘输入一个字符串统计其中各个字符出现的次数，种类有大写字母、小写字母、数字、其他*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();//获取键盘输入的一个字符串

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A'<=ch &&'Z'>=ch){
                countUpper++;
            }else if('a'<=ch && 'z'>=ch){
                countLower++;
            }else if('0'<=ch && '9'>=ch){
                countNumber++;
            }else{
                countOther++;
            }
        }

        System.out.println("大写："+countUpper);
        System.out.println("小写："+countLower);
        System.out.println("数字："+countNumber);
        System.out.println("其他："+countOther);
    }
}
