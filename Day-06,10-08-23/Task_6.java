class inherit_1{
    void meth_1(){
        System.out.println("INHERITANCE 1");
    }
}

class inherit_2 extends inherit_1{
    void meth_2(){
        System.out.println("INHERITANCE 2");
    }
}

class inherit_3 extends inherit_2{
    void meth_3(){
        System.out.println("INHERITANCE 3");
    }
}


public class Task_6 {
    public static void main(String[] args) {
        inherit_3 obj = new inherit_3();
        obj.meth_1();
        obj.meth_2();
        obj.meth_3();
    }
}
