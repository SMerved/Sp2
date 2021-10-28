public class Main {

    public static void main(String[] args){
        double fee=0 ;
        Garage garage1=new Garage("myGarage");
        Car petrolCar= new PetrolCar(8, 5, 592, "Ford", 1999, 4) ;
        Car dieselCar=new DieselCar(true,15,487,"Mercedes",1995,4);
        Car electricCar=new ElectricCar(30,1000,250,293,"Toyota",2016,3);
        garage1.addCar(petrolCar);
        garage1.addCar(dieselCar);
        garage1.addCar(electricCar);
        fee=garage1.calculateGreenOwnersFeeForGarage(garage1.getGarage()) ;
        System.out.println(fee);
        System.out.println(garage1);
    }

}
