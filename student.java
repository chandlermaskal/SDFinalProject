/**
 * Created by ylonka on 4/5/17.
 */
/*Abstraction, Abstract class, and Access modifiers*/
public abstract class student {
    private String name;
    private int rin;
    String occupation = "student";

    public String getName() {
        return name;
    }

    public int getRin() {
        return rin;
    }

    public String getOcc() {
        return occupation;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setRin(int newRin) {
        rin = newRin;
    }
}

/*Inheritance*/
class senior extends student {
    private String concentration;

    public String getConc() {
        return concentration;
    }

    public void setConc(String newConc) {
        concentration = newConc;
    }
}
