package javaCase.demo0327.FanXing;

public class FanXingMain {
    /*泛型是一个任意数据类型
   public class ArrayList<E>{}
   * public boolean add(E e)
   * public E get(int index)
   * E 泛型元素 T 类型*/
    public static void main(String[] args) {
        //不写泛型默认是Object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();

        //泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);

        Integer name = gc2.getName();
        System.out.println(name);

        //泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("sss");

        String namee = gc3.getName();
        System.out.println(namee);

    }
}
