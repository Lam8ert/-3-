package �ӿڸ���ԭ��;

public class �ӿڸ���ԭ�� {
    public static void main(String[] args){
        door_100 d1=new door_100();
        d1.anti_theft();
        door_200 d2=new door_200();
        d2.anti_fire();
        d2.anti_theft();
    }
}
interface fire_defend{
    public abstract void anti_fire();
}
interface water_defend{
    public abstract void anti_water();
}
interface theft_defend{
    public abstract void anti_theft();
}
class door_100 implements theft_defend{
    public void anti_theft(){
        System.out.println("����");
    }
}
class door_200 implements theft_defend,fire_defend{
    public void anti_fire() {
        System.out.println("����");
    }
    public void anti_theft() {
        System.out.println("����");
    }
}
