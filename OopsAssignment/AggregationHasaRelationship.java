//Aggregation (Has-A Relationship)
//Create a class Engine with a method engineInfo().
//Create a class Car that has-a Engine object and uses it to show engine details.
//Show aggregation in main method.


package OopsAssignment;

//Engine class
class Engine {

 public void engineInfo() 
 {
     System.out.println("Engine: 1500cc Petrol Engine");
 }
}

//Car class (has-a Engine)
class Car 
{

 // Aggregation: Car has an Engine
 Engine engine;

 // Constructor to receive Engine object
 public Car(Engine engine) 
 {
     this.engine = engine;
 }

 public void showCarDetails() 
 {
     System.out.println("Car Details:");
     engine.engineInfo();  // using Engine object
 }
}

public class AggregationHasaRelationship
{
 public static void main(String[] args) {

     // Creating Engine object
     Engine e = new Engine();

     // Passing Engine to Car (aggregation)
     Car c = new Car(e);

     // Displaying details
     c.showCarDetails();
 }
}

