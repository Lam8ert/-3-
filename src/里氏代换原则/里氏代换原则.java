package 里氏代换原则;

public class 里氏代换原则 {
    public static void main(String[] args){
        //此时若有一个关于鸟类需要多长时间飞跃河流
        Bird bird=new Bird(10);
        System.out.println("100m宽的河流需要时间："+(100/bird.getspeed()));
        tuoBird tuobird=new tuoBird();
        //System.out.println("100m宽的河流需要时间："+100/tuobird.getspeed());
        /*由于子类的对象不能满足父类可以满足的情况，也就是子类应该可以替换任何基类能够出现的地方，并且经过替换以后，代码还能正常工作，所以这种情况下，就不应该使用继承关系*/
        /*而是应该抽象出来一个动物类，让Bird和tuoBird分别继承*/
        /*所有派生类的行为功能必须和使用者对其基类的期望保持一致，如果派生类达不到这一点，那么必然违反里氏替换原则*/
        /*鸵鸟不会飞行，不应该继承鸟*/
    }
}
/*错误样例*/
class Bird{
    private int speed;//表示飞行速度
    public Bird(int speed){
        this.speed=speed;
    }
    public int getspeed(){return this.speed;}
    public void fly(){
        System.out.println("我的速度是"+this.getspeed());
    }

}
class tuoBird extends Bird{
    public tuoBird(){
        super(0);
    }

}
