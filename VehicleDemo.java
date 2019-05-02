class VehicleDemo{
public static void main(String args[]) {
  Vehicle minivan = new Vehicle();
  int range;
  minivan.passengers = 7;
  minivan.fuelcap = 16;
  minivan.mpg = 21;
  range = minivan.fuelcap * minivan.mpg;
  System.out.print( "Minivan can carry " + minivan.passengers + "With the range of " + range);
  }
}
