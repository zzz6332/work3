package level1;
  //-----------定义工人类继承抽象类人 实现德克士接口
public class Worker extends Person implements Dicos{

    public Worker(String name, int age) {
        super(name, age);
    }
      //---------------------覆写接口中的抽象方法
    @Override
    public void buyChiken() {
        System.out.println(this.getName()+ this.getAge() +"岁,想买德克士的炸鸡.");
    }

    @Override
    public void buyCoke() {
        System.out.println(this.getName()+ this.getAge() +"岁,想买德克士的小杯可乐.");
    }
      //---------------------覆写抽象类中的抽象方法
    @Override
    public void wantDo() {
       this.buyChiken();
       this.buyCoke();
    }
}
