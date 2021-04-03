package javaCase.demo0327;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        /*1.准备牌 定义一个存储54张牌的ArrayList集合，泛型使用String*/
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","K","Q","J","10","9","8","7","6","5","4","3","2","1",};
        poker.add("大王");
        poker.add("小王");
        for(String number:numbers){
            for (String color : colors) { //colors.for
                //System.out.println(color+number);
                poker.add(color+number);
            }
        }

        /*2.洗牌 使用集合方法*/
        Collections.shuffle(poker);
        System.out.println(poker);

        /*3.发牌 定义四个集合存储玩家的牌和底牌*/
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if(i>=51){
                diPai.add(p);
            }else if(i%3==0){
                player01.add(p);
            }else if(i%3==1){
                player02.add(p);
            }else if(i%3==2){
                player03.add(p);
            }
        }

        /*4.看牌*/
        System.out.println("刘德华"+player01);
        System.out.println("周润发"+player02);
        System.out.println("周星驰"+player03);
        System.out.println("底牌"+diPai);


    }
}
