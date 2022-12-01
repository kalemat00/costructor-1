package it.projectCostructor.classes;

public class House {
    public String address;
    public int numbersOfFloors;

    public House(String address, int numbersOfFloors){
        System.out.println(" -------------- ");
        System.out.println("A house is being created");
        this.address = address;
        this.numbersOfFloors = numbersOfFloors;
        System.out.println("the house address is: " + address);
        System.out.println("and has " + numbersOfFloors + " floors");
        System.out.println(" -------------- ");
    }
}
