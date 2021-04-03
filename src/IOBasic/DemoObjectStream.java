package javaCase.demo0327.IOBasic;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/*对象的序列化和反序列化
    ObjectOutputStream extends OutputStream 写入 writeObject()
    ObjectInputStream extends InputStream 读取  readObject()
* */
public class DemoObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        SaveObject();
//        ReadObject();
        SerialCollections();
    }
    public static void SaveObject() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person_serializable.txt"));
        oos.writeObject(new PersonSerializable("小美女"));
        oos.close();
    }
    public static void ReadObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person_serializable.txt"));
        Object o = ois.readObject();
        PersonSerializable p = (PersonSerializable) o;
        System.out.println(p);
    }

    public static void SerialCollections() throws IOException, ClassNotFoundException {
        ArrayList<PersonSerializable> list = new ArrayList<>();
        list.add(new PersonSerializable("李雪倩"));
        list.add(new PersonSerializable("李雪妍"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SerialCollections.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SerialCollections.txt"));
        Object o = ois.readObject();
        ArrayList<PersonSerializable> arr = (ArrayList<PersonSerializable>)o;
        System.out.println(arr);
        oos.close();
        ois.close();
    }
}
