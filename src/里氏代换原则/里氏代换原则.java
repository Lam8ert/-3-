package ���ϴ���ԭ��;

public class ���ϴ���ԭ�� {
    public static void main(String[] args){
        //��ʱ����һ������������Ҫ�೤ʱ���Ծ����
        Bird bird=new Bird(10);
        System.out.println("100m��ĺ�����Ҫʱ�䣺"+(100/bird.getspeed()));
        tuoBird tuobird=new tuoBird();
        //System.out.println("100m��ĺ�����Ҫʱ�䣺"+100/tuobird.getspeed());
        /*��������Ķ��������㸸���������������Ҳ��������Ӧ�ÿ����滻�κλ����ܹ����ֵĵط������Ҿ����滻�Ժ󣬴��뻹������������������������£��Ͳ�Ӧ��ʹ�ü̳й�ϵ*/
        /*����Ӧ�ó������һ�������࣬��Bird��tuoBird�ֱ�̳�*/
        /*�������������Ϊ���ܱ����ʹ���߶���������������һ�£����������ﲻ����һ�㣬��ô��ȻΥ�������滻ԭ��*/
        /*���񲻻���У���Ӧ�ü̳���*/
    }
}
/*��������*/
class Bird{
    private int speed;//��ʾ�����ٶ�
    public Bird(int speed){
        this.speed=speed;
    }
    public int getspeed(){return this.speed;}
    public void fly(){
        System.out.println("�ҵ��ٶ���"+this.getspeed());
    }

}
class tuoBird extends Bird{
    public tuoBird(){
        super(0);
    }

}
