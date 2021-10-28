import java.util.ArrayList;

public class Garage {
    public ArrayList<Car> garage=new ArrayList<>() ;
    String name ;
    public Garage(String name){
        this.name=name ;
    }
    public void addCar(Car car){
        garage.add(car) ;
    }
    public double calculateGreenOwnersFeeForGarage(ArrayList<Car> car){
        double fee=0 ;
        for(int i=0 ; i<car.size() ; i++){
            fee+=car.get(i).calculateGreenOwnersFee() ;

        }

        return fee ;
    }
    public ArrayList<Car> getGarage(){
        return garage ;
    }
    public String toString(){
        return ""+garage ;
    }
}
