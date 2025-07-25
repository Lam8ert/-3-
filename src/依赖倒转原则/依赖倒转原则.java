package 依赖倒转原则;

public class 依赖倒转原则 {
    public static void main(String[] args){
        Computer com=new Computer(new Intel("intel"),new KeyBoard());
        com.show();
    }
}



class Computer{//1//第二次提交

    private CPU cpu;//应该是抽象类或者接口  来接收具体类！！！！！！！！！！
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
        System.out.println("Intel's CPU 启动");
    }

}
class AMD extends CPU{
    public AMD(String name){
        super(name);
    }
    public void start(){
        System.out.println("AMD's CPU 启动");
    }
}
interface USB{
    public abstract void start();
}
class Mouse implements USB{
    public void start(){
        System.out.println("Mouse 启动");
    }
}
class KeyBoard implements USB{
    public void start(){
        System.out.println("KeyBoard 启动");
    }
}