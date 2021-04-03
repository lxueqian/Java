package javaCase.demo0327;

public class MathPractice {
    /*计算-10.8到5.9之间绝对值大于6或者小于2.1的整数有多少个
    * 向上（正方向）取整ceil(得到double)或者强转成int*/
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        /*for (double i = Math.ceil(min); i < max ; i++) {
            double abs = Math.abs(i);
            if(abs>6||abs<2.1){
                System.out.println(i);
                count++;
            }
        }*/
        for (int i = (int)min; i < max ; i++) {
            int abs = Math.abs(i);
            if(abs>6||abs<2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有："+count);
    }

}
