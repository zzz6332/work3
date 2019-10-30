package level1;

//-------------------------------定义抽象类人,人有不同的职业
public abstract class Person {
    private String name;
    private int age;

    //------------------------
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //-----------------------------------抽象方法,不同的人想做的事不同
    public abstract void wantDo();
}
