package javaCase.demo0327.Inherit;

import java.util.ArrayList;

public class MainRedPackage {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member one = new Member("mem01",0);
        Member two = new Member("mem02",0);
        Member three = new Member("mem03",0);

        manager.showMoney();
        one.showMoney();
        two.showMoney();
        three.showMoney();
        System.out.println("======");

        //群主发50块钱 发给3个人
        ArrayList<Integer> redList = manager.send(50,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.showMoney();//50
        one.showMoney();
        two.showMoney();
        three.showMoney();
        System.out.println("======");

    }
}
