public class MainGarage {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota Corolla", 2015, "AB123CD", "C001");
        Car c2 = new Car("Honda Civic", 2018, "EF456GH", "C002");
        Car c3 = new Car("Ford Focus", 2017, "IJ789KL", "C003");
        Car c4 = new Car("BMW 320i", 2020, "MN012OP", "C004");
        Car c5 = new Car("Audi A4", 2019, "QR345ST", "C005");
        Car c6 = new Car("Mercedes C200", 2016, "UV678WX", "C006");
        Car c7 = new Car("Volkswagen Golf", 2015, "YZ901AB", "C007");
        Car c8 = new Car("Nissan Altima", 2018, "CD234EF", "C008");
        Car c9 = new Car("Kia Optima", 2021, "GH567IJ", "C009");
        Car c10 = new Car("Hyundai Elantra", 2017, "KL890MN", "C010");

        Owner ow1 = new Owner("Anna Muller", "+49 151 11111111", 101, "Berlin, Hauptstrasse 10");
        Owner ow2 = new Owner("Max Schmidt", "+49 152 22222222", 102, "Hamburg, Hafenstrasse 25");
        Owner ow3 = new Owner("Olga Ivanova", "+49 153 33333333", 103, "Munich, Gartenweg 7");
        Owner ow4 = new Owner("Peter Weber", "+49 154 44444444", 104, "Cologne, Ringstrasse 14");
        Owner ow5 = new Owner("Maria Fischer", "+49 155 55555555", 105, "Stuttgart, Bahnhofstrasse 3");
        Owner ow6 = new Owner("Alex Braun", "+49 156 66666666", 106, "Dresden, Parkallee 18");
        Owner ow7 = new Owner("Elena Petrova", "+49 157 77777777", 107, "Leipzig, Lindenweg 9");
        Owner ow8 = new Owner("Thomas Wagner", "+49 158 88888888", 108, "Bremen, Marktstrasse 21");
        Owner ow9 = new Owner("Sofia Keller", "+49 159 99999999", 109, "Frankfurt, Mainzerstrasse 12");
        Owner ow10 = new Owner("Daniel Hoffmann", "+49 160 10101010", 110, "Nuremberg, Schlossweg 5");

        Garage garage = new Garage("Autowerkstatt", "Kirchplatz,13", "+49 175 5554443" );

        garage.addCar(c1,ow1, c1.getServiceType());
        garage.addCar(c2,ow2, c2.getServiceType());
        garage.addCar(c3,ow3, c3.getServiceType());
        garage.addCar(c4,ow4, c4.getServiceType());
        garage.addCar(c5,ow5, c5.getServiceType());
        garage.addCar(c6,ow6, c6.getServiceType());
        garage.addCar(c7,ow7, c7.getServiceType());
        garage.addCar(c8,ow8, c8.getServiceType());
        garage.addCar(c9,ow9, c9.getServiceType());
        garage.addCar(c10,ow10, c10.getServiceType());

        garage.printCarsInProcess();


        garage.returnCarToOwner("C012");
        garage.printCarsInProcess();


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