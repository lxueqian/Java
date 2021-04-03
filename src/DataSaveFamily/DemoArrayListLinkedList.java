package javaCase.demo0327.DataSaveFamily;

import java.util.LinkedList;

/*ArrayList增删比较慢，每次增加都会重新开辟一块新的内存地址 or 原来的1.5倍开辟？
* LinkedList：1,底层时一个链表结构：查询慢，增删快
*             2,包含大量操作收尾的方法（此时不能使用多态）*/
public class DemoArrayListLinkedList {
    public static void main(String[] args) {
        show01();
    }

    private static void show01(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked); //[a, b, c]

        linked.addFirst("www"); //linked.push("www")等效 添加到开头，0位置
        System.out.println(linked); //[www, a, b, c]

        linked.addLast("com");//等效于linked.add() 添加到末尾
        System.out.println(linked); //[www, a, b, c, com]

    }

    private static void show02(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");

//        linked.clear();

        if(!linked.isEmpty()){
            System.out.println(linked.getFirst()); //列表开头 a
            System.out.println(linked.getLast()); //列表结尾 c
        }

    }
    private static void show03(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);//[a, b, c]

        String first = linked.removeFirst();//linked.pop() 列表第一个元素
        System.out.println(first); //a
        String last = linked.removeLast();
        System.out.println(last); //c
        System.out.println(linked);//[b]

    }
}
