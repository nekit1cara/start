package Lesson6;

public class VehicleClass {
    int passengers;
    int fuelCap;
    int kmhPerLitr;

     public void rangeCalculation(){
        System.out.println("Дистанция  "  + fuelCap * kmhPerLitr);
    }
   int rangeCalc2(){
        return fuelCap * kmhPerLitr;
    }

     public void rangeCalculationWithName(String name){
        System.out.println(name + " can take " + passengers + " passangers at distance of " + fuelCap * kmhPerLitr + " .");
    }


    int pricePerPessengers(int price){
        return rangeCalc2() * price / passengers;
    }
}
