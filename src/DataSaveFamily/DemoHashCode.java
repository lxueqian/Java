package javaCase.demo0327.DataSaveFamily;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

/*hashCode()方法 Object类中的一个方法
    int hashCode() 返回对象的哈希值，虚拟地址，是Object类中的一个方法
* hashCode方法源码：public native int hashCode();native表示调用本地操作系统方法
* 可以在类中重写该方法*/
public class DemoHashCode {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        int[] arr2 = new int[]{1, 2, 3, 4};
        System.out.println(arr.hashCode());
        System.out.println(arr2.hashCode());

        System.out.println(arr);

        //toString()方法的源码 return getClass().getName()+"@"+Integer.toHexString(hashCode());
        /*String类的哈希值：
         *       String类重写Object类的hashCode方法
         * */

        String s1 = new String("sss");
        String s2 = new String("sss");
        System.out.println(s1.hashCode()); //114195
        System.out.println(s2.hashCode()); //114195


    }





}
