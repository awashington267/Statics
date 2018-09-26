package wctc.anthony7;

public class Persons extends Startup implements Weighable {
    String firstName;
    String lastName;
    int age;

    public Persons(){

    }

    public Persons(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }





    @Override
    public Double addWeight(double pounds) {
        return null;
    }

    @Override
    public Double loseWeight(double pounds) {
        return null;
    }
}
