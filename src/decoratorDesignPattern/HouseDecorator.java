package decoratorDesignPattern;

/**
 * Created by vipuljain on 28/05/17.
 */
 abstract class HouseDecorator implements House {

     protected House house;

     public HouseDecorator(House house)
     {
         this.house = house;

     }



    public String makeHouse()
     {
         System.out.println("Inside makeHouse() method of HouseDecorator class");
         return house.makeHouse();


     }
}
