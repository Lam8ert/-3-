package ����ģʽ;

public class ����ģʽ {
    public static void main(String[] args){
        Duck duck=new Fly_Duck();
        duck.Fly_Performance();
        duck.setFlybehavior(new FlyLikeRocket());
        duck.Fly_Performance();
    }
}
/*�����з�ʽ���г���ɽӿ�*/
/*�ӿڸ���ԭ��*/
interface FlyBehavior{
    public abstract void fly();
}
class FlyWithWings implements FlyBehavior{
    public void fly(){
        System.out.println("I can fly with wings");
    }
}
class FlyWithNoWings implements FlyBehavior{
    public void fly(){
        System.out.println("I can not fly");
    }
}
class FlyLikeRocket implements FlyBehavior{
    public void fly(){
        System.out.println("I can fly like Rocket");
    }
}
/*����ԭ��*/
abstract class Duck{
    private FlyBehavior flybehavior;/*������תԭ��*/
    public Duck(FlyBehavior flybehavior){
        this.flybehavior=flybehavior;
    }
    public void setFlybehavior(FlyBehavior flybehavior){
        this.flybehavior=flybehavior;
    }
    public  void Fly_Performance(){
        flybehavior.fly();
    }
}
class Fly_Duck extends Duck{
    public Fly_Duck() {
        super(new FlyWithWings());
    }
}
class NoFly_Duck extends Duck{
    public NoFly_Duck() {
        super(new FlyWithNoWings());
    }
}
class FlyRocket_Duck extends Duck{
    public FlyRocket_Duck() {
        super(new FlyLikeRocket());
    }
}
