public class PetrolCar extends Car{
    private int oktNumber ;
    private int kmPrl ;
    int regNr ;
    String brand ;
    int year ;
    int numberOfDoors ;
    public PetrolCar(int oktNumber, int kmPrl, int regNr, String brand, int year, int numberOfDoors){
        super(regNr,brand,year,numberOfDoors);
        this.oktNumber=oktNumber ;
    this.kmPrl=kmPrl ;
    this.regNr=regNr ;
    this.brand=brand ;
    this.year=year ;
    this.numberOfDoors=numberOfDoors ;
    }

    @Override
    public double calculateGreenOwnersFee() {
        double fee=0 ;
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
        return +regNr+" "+brand+" "+ year +" "+ numberOfDoors+" "+ oktNumber+" "+ kmPrl ;
    }

    public int getOktNumber() {
        return oktNumber;
    }

    public void setOktNumber(int oktNumber) {
        this.oktNumber = oktNumber;
    }

    public int getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }
}
