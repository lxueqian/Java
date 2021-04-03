package javaCase.demo0327.FanXing;

/*含有泛型的接口第二种使用方式：接口使用什么泛型，实现类就用什么泛型
* 创建的是一个使用泛型的类，创建对象时指定泛型类型
* public interface List<E>{
*   boolean add(E e);
*   E get(int index);
*
* Arraylist实现List接口并未指定类型
* public class ArrayList<E> implements List<E>{
*   public boolean add(E e){}
*   public E get(int index){}
* }*/
public class GenericInterfaceImpli2<I> implements GenericInterface<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
