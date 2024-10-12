interface MyInterface{
    public void method1();
    public voide method2();
}

public Main implements MyInterface{

    public void method1(){
        System.out.println("Implementation of method 1");
    }

    public void method2(){
        System.out.println("Implementation of method 2");
    }

    public static void main(String[] args){
        MyInterface m1=new Main();
        m1.method1();
        m2.method2();
    }
}