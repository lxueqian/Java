package javaCase.demo0327;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    /*用代码模拟猜数字小游戏
    * 1.产生一个随机数字作为被猜的数字  2.键盘输入Scanner获取用户输入 3.猜错重试，循环while（true)*/
    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = r.nextInt(100)+1;//[1,100]
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("input:");
            int guessNum = sc.nextInt(); //键盘输入猜的数字

            if (guessNum > randomNumber) {
                System.out.println("guess large");
            } else if (guessNum < randomNumber) {
                System.out.println("guess small");
            } else {
                System.out.println("Congratulations!");
                break;
            }
        }

        System.out.println("game over");
    }

}
