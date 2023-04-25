package Inheritance;

public class Vehicul {
    private Integer tyres =4;
    private String color = "black";

    public Integer getTyres() {
        return tyres;
    }

    public String getColor() {
        return color;
    }

    public void showVehicleDetails(){
        System.out.println("num tyres"+ tyres.toString());
        System.out.println("color"+ color);
    }

}
