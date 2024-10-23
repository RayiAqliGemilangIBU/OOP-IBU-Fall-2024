class Person {
    private String name;
    private String adress;
 
    public Person(String var1, String var2) {
       this.name = var1;
       this.adress = var2;
    }
    
    @Override
    public String toString() {
       return this.name + "\n  " + this.adress;
    }
 }
 

class Student extends Person {

    private int credits;

    public Student(String aName, String aAdress){
        super(aName, aAdress);
        this.credits = 0;
    }

    public void study(){
        this.credits++;
    }
    public int credits() { 
        return this.credits;
    }

}

class Teacher extends Person{

    private int salary;

    public Teacher(String aName, String aAdress, int amountOfSalary){
        super(aName, aAdress);
        this.salary = amountOfSalary;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSalary " + this.salary + " Euro";
    }

}