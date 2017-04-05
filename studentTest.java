/**
 * Created by ylonka on 4/5/17.
 */
/*Encapsulation*/
public class studentTest {

    public static void main(String args[]) {
        senior Senior = new senior();
        Senior.setName("Ylonka");
        Senior.setRin(1234567);
        Senior.setConc("MIS");

        System.out.print("Name: " + Senior.getName() + " RIN: " + Senior.getRin() + " Concentration: " + Senior.getConc() + " Occupation: " + Senior.getOcc());
    }
}
