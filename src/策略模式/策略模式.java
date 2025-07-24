package 策略模式;

public class 策略模式 {
    public static void main(String[] args){
        Duck duck=new Fly_Duck();
        duck.Fly_Performance();
        duck.setFlybehavior(new FlyLikeRocket());
        duck.Fly_Performance();
    }
}
/*将飞行方式进行抽象成接口*/
/*接口隔离原则*/
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
/*开闭原则*/
abstract class Duck{
    private FlyBehavior flybehavior;/*依赖倒转原则*/
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
