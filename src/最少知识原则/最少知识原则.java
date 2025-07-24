package 最少知识原则;
/*这里分别运用了开闭原则，接口隔离原则，最少知识原则*/
/*开闭原则：这里将抽象了物品类，有分别抽象了水果类和蔬菜类，又有土豆类，番茄类等具体实现类*/
/*接口隔离原则：这里的超市类的功能都是implements 两个接口的*/
/*最少知识原则：这里我们通过了超市类这个中介，来对水果和蔬菜对象进行了获取*/
public class 最少知识原则 {
    public static void main(String[] args){
        Market market=new Market();
        market.BuyFruit("西瓜").eat();
    }
}
interface BuyFruit{
    public abstract Fruit BuyFruit(String name);
}
interface BuyVegetable{
    public abstract Vegetable BuyVegetable(String name);
}
class Market implements BuyFruit,BuyVegetable{
    public Fruit BuyFruit(String name){
        if(name.equals("草莓")){
            return new StrawBerry("草莓");
        }
        else{
            return new WestMelon("西瓜");
        }
    }


    public Vegetable BuyVegetable(String name) {
        if(name.equals("土豆")){
            return new Potato("土豆");
        }
        else {
            return new Tomato("番茄");
        }
    }
}
abstract class Object{
    private String name;
    public Object(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
abstract class Fruit extends Object{
   public Fruit(String name){
       super(name);
   }
   public abstract void eat();

}
abstract class Vegetable extends Object{
    public Vegetable(String name){
        super(name);
    }
    public abstract void make();
}
class WestMelon extends Fruit{
    public WestMelon(String name) {
        super(name);
    }
    public void eat(){
        System.out.println("西瓜好吃");
    }
}
class StrawBerry extends Fruit{
    public StrawBerry(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("草莓好吃");
    }
}
class Potato extends Vegetable{

    public Potato(String name) {
        super(name);
    }
    public void make() {
        System.out.println("土豆做菜好吃");
    }
}
class Tomato extends Vegetable{

    public Tomato(String name) {
        super(name);
    }
    public void make() {
        System.out.println("番茄做菜好吃");
    }
}