package level1;

public class main {
    public static void main(String[] args) {
        Person student1 = new Student("张三",19);
        Person student2 = new Student("李四",20);
        Person worker1 = new Worker("王五",60);
        Person worker2 = new Worker("简自豪",21);
        //*****************
        student1.wantDo();
        student2.wantDo();
        worker1.wantDo();
        worker2.wantDo();
    }
}
