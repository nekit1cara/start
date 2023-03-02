package Lesson6;

public class App {
    public static void main(String[] args) {
 final int PRICE = 28;
        VehicleClass minivan = new VehicleClass();

        minivan.fuelCap = 80;
        minivan.passengers = 16;
        minivan.kmhPerLitr = 21;

        minivan.rangeCalculationWithName("minivan");
        int pricePerPessengers = minivan.pricePerPessengers(PRICE);
        System.out.println(pricePerPessengers);

        System.out.println("Минивэн проедет ");
        minivan.rangeCalculation();


//        VehicleClass Lambo = new VehicleClass();
//        Lambo.passengers = 2;
//        Lambo.fuelCap = 60;
//        Lambo.kmhPerLitr = 27;
//        System.out.println("Ламборгини проедет ");
//        Lambo.rangeCalculation();
//
//
//    VehicleClass car11 = new VehicleClass();
//    VehicleClass car22 = car11;
//        System.out.println("KmhPerLitr of car11 " + car11.kmhPerLitr);
//        System.out.println("KmhPerLitr of car22 " + car22.kmhPerLitr);
//        car11.kmhPerLitr = 26;
//        System.out.println("KmhPerLitr of car11 " + car11.kmhPerLitr);
//        System.out.println("KmhPerLitr of car22 " + car22.kmhPerLitr);

    }
}
