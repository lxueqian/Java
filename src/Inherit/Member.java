package javaCase.demo0327.Inherit;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包中随机抽取一个,即随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，删除对应金额给自己
        int delta = list.remove(index);
        //重新设置成员已有金额
        int money = super.getMoney();
        super.setMoney(money+delta);

    }
}
