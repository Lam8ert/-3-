package 开闭原则;

public class 开闭原则 {
    public static void main(String[] args){

    }
}
abstract class USB{
    abstract void display();
}
class KeyBoard extends USB{
    void display(){
        System.out.println("连接键盘");
    }
}
class U盘 extends USB{
    void display(){
        System.out.println("连接U盘");
    }
}
class Mouse extends USB{
    void display(){
        System.out.println("连接鼠标");
    }
}
/*当有新的功能时，只需新的派生类实现新功能即可，*/