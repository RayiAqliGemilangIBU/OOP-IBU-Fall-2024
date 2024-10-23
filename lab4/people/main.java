package lab4.people;


public class main {
    
    public static void main(String[] args) {

 // #a
    // Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
    // Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
    // System.out.println(pekka);
    // System.out.println(esko);

    // #b
//     Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
//    System.out.println(olli);
//    System.out.println("credits " + olli.credits());
//    olli.study();
// //    System.out.println("credits "+ olli.credits());

// #c
// Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
//    Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
//    System.out.println( pekka );
//    System.out.println( esko );




//    Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
//    for ( int i=0; i < 25; i++ ) {
//        olli.study();
//    }
//    System.out.println( olli );
// }




}

}



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
        return super.toString() + "\nSalary " + this.salary + " Euros/month";
    }

}

