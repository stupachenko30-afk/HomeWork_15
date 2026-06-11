public class MainGarage {
    public static void main(String[] args) {

    }
}
/*Car
   -----
model(String)
year(int)
regNumber(String)
code(String)
serviceType(String) -> not in constructor

        Owner
   --------
name(String)
phone(String)
id(int)
address(String)

Garage
  ----------
name(String)
address(String)
phone(String)
TreeMap<Car,Owner> cars
  -----------------------
public void addCar(Car c,Owner ow) or(или)
public void addCar(Car c,Owner ow,String service)
public void printCarsInProcess()
public void returnCarToOwner(String regNumber)

 */