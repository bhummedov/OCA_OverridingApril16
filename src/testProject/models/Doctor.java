package testProject.models;

public class Doctor  extends Person {
    private String specialty;


    public Doctor(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return this.specialty;
    }
public void speak(){
    System.out.println("doctor "+getName()+ "\tspeaking" );

}
    //overloading
    public void speak(String name){
        System.out.println(name+ "doctor speaking" );
    }
}
