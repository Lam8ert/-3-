package ����֪ʶԭ��;
/*����ֱ������˿���ԭ�򣬽ӿڸ���ԭ������֪ʶԭ��*/
/*����ԭ�����ｫ��������Ʒ�࣬�зֱ������ˮ������߲��࣬���������࣬������Ⱦ���ʵ����*/
/*�ӿڸ���ԭ������ĳ�����Ĺ��ܶ���implements �����ӿڵ�*/
/*����֪ʶԭ����������ͨ���˳���������н飬����ˮ�����߲˶�������˻�ȡ*/
public class ����֪ʶԭ�� {
    public static void main(String[] args){
        Market market=new Market();
        market.BuyFruit("����").eat();
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
        if(name.equals("��ݮ")){
            return new StrawBerry("��ݮ");
        }
        else{
            return new WestMelon("����");
        }
    }


    public Vegetable BuyVegetable(String name) {
        if(name.equals("����")){
            return new Potato("����");
        }
        else {
            return new Tomato("����");
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
        System.out.println("���Ϻó�");
    }
}
class StrawBerry extends Fruit{
    public StrawBerry(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("��ݮ�ó�");
    }
}
class Potato extends Vegetable{

    public Potato(String name) {
        super(name);
    }
    public void make() {
        System.out.println("�������˺ó�");
    }
}
class Tomato extends Vegetable{

    public Tomato(String name) {
        super(name);
    }
    public void make() {
        System.out.println("�������˺ó�");
    }
}