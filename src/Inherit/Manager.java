package javaCase.demo0327.Inherit;

import java.util.ArrayList;

public class Manager extends User {

    public Manager(){
        //super() 赠送
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> redList = new ArrayList<>();

        //发红包金额不能大于群主拥有的金额
        int leftMoney = super.getMoney();

        if (totalMoney>leftMoney){
            System.out.println("余额不足");
            return redList;
        }

        //扣钱,重新设置余额
        super.setMoney(leftMoney-totalMoney);

        //发红包平均拆分count份
        int avg = totalMoney/count;
        int mod = totalMoney%count; //除不开的部分 加到最后一个红包上

        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }

        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
