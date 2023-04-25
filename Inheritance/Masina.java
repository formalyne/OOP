package Inheritance;

public class Masina extends Vehicul {
    private String marka;

    public Masina(String marka){
        super();
        this.marka = marka;
    }
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("marka "+ marka);
    }
}
