public class Test2 {

    static synchronized protected final void specialMethod() {
    }

    ;
    public static final double PI = 3.14;

    public static void main(String[] args) {

        A a = new A();
        a.setCounter(124);
        a.print();

        WashingMachine washingMachine = new WashingMachine();
        //washingMachine.temperature = 100;


    }
}

class A {
    protected int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void print() {
        System.out.println("Klasa A! Licznik " + getCounter());
    }
}

class B {
    A a = new A();
    void test(){
        int i = a.counter;
    }
}