package Spring.SpringEx;

import java.util.Set;

public class AndroidTrainer implements Trainer{
    String name;
    Set<String> specialties;

    public AndroidTrainer(){

    }

    public AndroidTrainer(String name, Set<String> specialties){
        this.name = name;
        this.specialties = specialties;
    }

    public void train(){
        System.out.println(name + " is training on Android");
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

    public void setSpecialties(Set<String> specialties) {
        this.specialties = specialties;
    }

    public String toString(){
        return name + " is a Android Trainer";
    }
}
