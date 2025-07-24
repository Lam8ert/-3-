package 观察者模式;
/*实现一个气象站*/
import java.util.*;
public class 观察者模式 {
    public static void main(String[] args){
        WeatherData weatherdata=new WeatherData();
        CurrentConditionsDisplay cur=new CurrentConditionsDisplay(weatherdata);
        Temp_Display te=new Temp_Display(weatherdata);
        weatherdata.Data_change(20,10,30);
        weatherdata.Data_change(10,20,10);
        weatherdata.Data_change(30,30,40);
    }
}
interface Observer{
    public abstract void update(int temp,int wet,int pressure);
}
interface Display{
    public abstract void display();
}
class CurrentConditionsDisplay implements Observer,Display{//记录当前气温，湿度，气压
    private int temp;
    private int wet;
    private int pressure;
    private WeatherData weatherdata;
    public CurrentConditionsDisplay(WeatherData weatherdata){
        this.weatherdata=weatherdata;
        weatherdata.register(this);
    }
    public void display(){
        System.out.printf("当前气温：%d，当前湿度：%d，当前气压：%d\n",temp,wet,pressure);
    }
    public void update(int temp,int wet,int pressure){
        this.temp=temp;
        this.wet=wet;
        this.pressure=pressure;
        display();
    }
}
class Temp_Display implements Display,Observer{//记录当前平均、最高、最低气温
    private int sign;
    private int total;
    private int high;
    private int low;
    private WeatherData weatherdata;
    public Temp_Display(WeatherData weatherdata){
        this.sign=0;
        this.total=0;
        this.high=-50;
        this.low=50;
        this.weatherdata=weatherdata;
        weatherdata.register(this);
    }
    public void update(int temp, int wet, int pressure) {
        if(this.low>temp){
            this.low=temp;
        }
        if(this.high<temp){
            this.high=temp;
        }
        this.sign++;
        this.total+=temp;
        display();
    }
    public void display() {
        System.out.printf("当前平均气温%d，当前最高气温%d，当前最低气温%d\n",this.total/this.sign,this.high,this.low);
    }
}
interface Subject{//用于创建、消除、通知对象
    public abstract void register(Observer observer);
    public abstract void remove(Observer observer);
    public abstract void notifyy();
}
class WeatherData implements Subject{
    private int temp;
    private int wet;
    private int pressure;
    private LinkedList<Observer> linkedList;
    public WeatherData(){
        linkedList=new LinkedList<Observer>();
    }
    public void register(Observer observer) {
        linkedList.add(observer);
    }

    public void remove(Observer observer) {
        linkedList.remove(observer);
    }

    public void notifyy() {
        for(Observer ob:linkedList){
            ob.update(this.temp,this.wet,this.pressure);
        }
    }
    void Data_change(int temp,int wet,int pressure){
        this.temp=temp;
        this.wet=wet;
        this.pressure=pressure;
        notifyy();
    }
}