public class ElectricCar extends Car{
    private int batteryCapacityKwh ;
    private int maxKm ;
    private int whPrKm ;
    int regNr ;
    String brand ;
    int year ;
    int numberOfDoors ;
    public ElectricCar(int batteryCapacityKwh, int maxKm, int whPrKm, int regNr, String brand, int year, int numberOfDoors){
        super(regNr,brand, year, numberOfDoors );
        this.batteryCapacityKwh=batteryCapacityKwh ;
    this.maxKm=maxKm ;
    this.whPrKm=whPrKm ;
        this.regNr=regNr ;
        this.brand=brand ;
        this.year=year ;
        this.numberOfDoors=numberOfDoors ;
    }

    @Override
    public double calculateGreenOwnersFee() {
        double fee=0 ;
        double kmPrl=100/(whPrKm/91.25) ;
        if((kmPrl<=50)&&(kmPrl>=20)){
            fee=330 ;
        }
        else if((kmPrl<=20)&&(kmPrl>=15)){
            fee=1050 ;
        }
        else if((kmPrl<=15)&&(kmPrl>=10)){
            fee=2340 ;
        }
        else if((kmPrl<=10)&&(kmPrl>=5)){
            fee=5500 ;
        }
        else if((kmPrl<=5)&&(kmPrl>=0)){
            fee=10470 ;
        }
        return fee;
    }
    public String toString(){
        return +regNr+" "+brand+" "+ year +" "+ numberOfDoors+" "+ batteryCapacityKwh+" "+ maxKm+" "+whPrKm ;
    }
    public int getBatteryCapacityKwh() {
        return batteryCapacityKwh;
    }

    public void setBatteryCapacityKwh(int batteryCapacityKwh) {
        this.batteryCapacityKwh = batteryCapacityKwh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }


}
