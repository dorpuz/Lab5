public class Employee {

    String name;
    int age;
    int wage;

    public Employee(String name, int age, int wage) {
        this.name = name;
        this.age = age;
        this.wage = wage;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Jestem pracownikiem o imieniu " + name + ", mam " + age + " lat/a. Zarabiam " + wage + " złotych.";
    }



    @Override
    public boolean equals(Object object){

        if (this == object){
            System.out.println("Równość referencyja!");
            return true;
        }

        if (object == null){
            return false;
        }
        if (getClass() != object.getClass()){
            return false;
        }

        //Employee employee = (Employee)object;

        if (this.name == null){
            if (((Employee)object).name!= null){
                return false;
            }else if (!this.name.equals(((Employee)object).name)){
                return false;
            }
        }

        if(this.age != ((Employee) object).age){
            return false;
        }
        if(this.wage != ((Employee) object).wage){
            return false;
        }
        return true;
    }
}
