public class InstanceCounter {

    private static int numInstances = 0;

    final public static int getCount(){
        return numInstances;
    }

    private static void addInstance(){
        numInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstance();
    }


    public static void main(String[] args) {
        System.out.println("Rozpoczynanie z " + InstanceCounter.getCount() + " obiektów.");

        for (int i = 0; i < 500; i++) {
            new InstanceCounter();
        }

        System.out.println("Utworzono " + InstanceCounter.getCount() + " obiektów.");
    }
}
/*
 class AAA extends InstanceCounter{
     public static int getCount(){
         return 2;
     }
 }

 class BBB extends String{}*/
