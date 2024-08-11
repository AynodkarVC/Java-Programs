package Spring.SpringEx;

import java.util.Set;

public class JavaTrainer implements Trainer{
    String name;
    Set<String> specialties;

    public JavaTrainer(){

    }

    public JavaTrainer(String name, Set<String> specialties){
        this.name = name;
        this.specialties = specialties;
    }

    public void train(){
        System.out.println(name + " is training on Java");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Set<String> getSpecialties() {
        return specialties;
    }

    public void setSpecialities(Set<String> specialties) {
        this.specialties = specialties;
    }

    public String toString(){
        return name + " is a Java Trainer";
    }
}
