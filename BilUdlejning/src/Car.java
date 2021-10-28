public abstract class Car {
    private int regNr ;
    private String brand ;
    private int year ;
    private int numberOfDoors ;
    public Car(int regNr, String brand, int year, int numberOfDoors){
        this.regNr=regNr ;
        this.brand=brand ;
        this.year=year ;
        this.numberOfDoors=numberOfDoors ;

    }


    public abstract double calculateGreenOwnersFee() ;
    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
