package level1;
//-----------------定义学生类继承抽象类人 实现肯德基接口
public class Student extends Person implements KFC {
    public Student(String name,int age){
        super(name,age);
       }
       //---------------------覆写接口中的抽象方法
    @Override
    public void buyChiken() {
        System.out.println( this.getName()+ this.getAge() +"岁,想买肯德基的鸡腿,");
    }

    @Override
    public void buyCoke() {
        System.out.println(this.getName()+ this.getAge() +"岁,想买肯德基的大杯可乐.");
    }
  //---------------------覆写抽象类中的抽象方法
    @Override
    public void wantDo() {
           this.buyChiken();
           this.buyCoke();
    }
}
