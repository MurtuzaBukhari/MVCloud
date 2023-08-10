interface  A{
    void meth();
}
interface B{
    void meth_1();
}
class C implements A,B{
    public void meth(){
        System.out.println("Class A");
    }
    public void meth_1(){
        System.out.println("Class B");
    }
}

public class Task_16 {
    public static void main(String[] args) {
        C obj = new C();
        obj.meth();
        obj.meth_1();
    }
}
