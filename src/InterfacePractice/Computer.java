package javaCase.demo0327.InterfacePractice;

public class Computer {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }

    //使用USB的方法 使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();

        //遇到实现接口的不同类的独有方法时
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb; //向下转型(类似于强制类型转换）
            mouse.click();
        }else if(usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard)usb;
            keyBoard.type();
        }

        usb.close();
    }
}
