package ����ԭ��;

public class ����ԭ�� {
    public static void main(String[] args){

    }
}
abstract class USB{
    abstract void display();
}
class KeyBoard extends USB{
    void display(){
        System.out.println("���Ӽ���");
    }
}
class U�� extends USB{
    void display(){
        System.out.println("����U��");
    }
}
class Mouse extends USB{
    void display(){
        System.out.println("�������");
    }
}
/*�����µĹ���ʱ��ֻ���µ�������ʵ���¹��ܼ��ɣ�*/