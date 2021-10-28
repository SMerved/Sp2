public class DieselCar extends Car{
    private boolean hasParticleFilter ;
    private int kmPrl ;
    int regNr ;
    String brand ;
    int year ;
    int numberOfDoors ;
    public DieselCar(boolean hasParticleFilter, int kmPrl, int regNr, String brand, int year, int numberOfDoors){
        super(regNr,brand, year,numberOfDoors);
        this.hasParticleFilter=hasParticleFilter ;
    this.kmPrl=kmPrl ;
        this.regNr=regNr ;
        this.brand=brand ;
        this.year=year ;
        this.numberOfDoors=numberOfDoors ;
    }
    @Override
    public double calculateGreenOwnersFee() {
        double fee=0 ;
        double extraFee=0 ;
        double particleFee=0 ;
        if((kmPrl<=50)&&(kmPrl>=20)){
            fee=330 ;
            extraFee=130 ;
        }
        else if((kmPrl<=20)&&(kmPrl>=15)){
            fee=1050 ;
            extraFee=1390 ;
        }
        else if((kmPrl<=15)&&(kmPrl>=10)){
            fee=2340 ;
            extraFee=1850 ;
        }
        else if((kmPrl<=10)&&(kmPrl>=5)){
            fee=5500 ;
            extraFee=2770 ;
        }
        else if((kmPrl<=5)&&(kmPrl>=0)){
            fee=10470 ;
            extraFee=15260 ;
        }
        if(hasParticleFilter==false){
            particleFee=1000 ;
        }
        else{
            particleFee=0 ;
        }
        fee=fee+extraFee+particleFee ;
        return fee;
    }
    public String toString(){
        return +regNr+" "+brand+" "+ year +" "+ numberOfDoors+" "+ hasParticleFilter+" "+ kmPrl ;
    }
    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public int getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }
}
