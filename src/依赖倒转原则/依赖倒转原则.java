package ������תԭ��;

public class ������תԭ�� {
    public static void main(String[] args){
        Computer com=new Computer(new Intel("intel"),new KeyBoard());
        com.show();
    }
}



class Computer{//1//�ڶ����ύ

    private CPU cpu;//Ӧ���ǳ�������߽ӿ�  �����վ����࣡������������������
    private USB usb;
    public Computer(CPU cpu,USB usb){
        this.cpu=cpu;
        this.usb=usb;
    }
    public void show(){
        cpu.start();;
        usb.start();
    }
}
abstract class CPU{
    private String name;
    public CPU(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public abstract void start();
}
class Intel extends CPU{
    public Intel(String name){
        super(name);
    }
    public void start(){
        System.out.println("Intel's CPU ����");
    }

}
class AMD extends CPU{
    public AMD(String name){
        super(name);
    }
    public void start(){
        System.out.println("AMD's CPU ����");
    }
}
interface USB{
    public abstract void start();
}
class Mouse implements USB{
    public void start(){
        System.out.println("Mouse ����");
    }
}
class KeyBoard implements USB{
    public void start(){
        System.out.println("KeyBoard ����");
    }
}