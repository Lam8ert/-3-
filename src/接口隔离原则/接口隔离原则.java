package 接口隔离原则;

public class 接口隔离原则 {
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
        System.out.println("防盗");
    }
}
class door_200 implements theft_defend,fire_defend{
    public void anti_fire() {
        System.out.println("防火");
    }
    public void anti_theft() {
        System.out.println("防盗");
    }
}
