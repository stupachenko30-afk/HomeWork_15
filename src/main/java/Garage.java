import java.util.Set;
import java.util.TreeMap;

public class Garage {

    private String name;
    private String address;
    private String phone;
    TreeMap<Car,Owner> cars = new TreeMap<>();

    public Garage(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", cars=" + cars +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void addCar(Car c,Owner ow,String service){
        boolean isExist = cars.containsKey(c);
        if (isExist == false){
            cars.put(c,ow);
            System.out.println("Added");

        }
        System.out.println(c.getCode() + "Already exists");


        }
        public void printCarsInProcess(){
            System.out.println("Garage:" + name);
            System.out.println("Address:" + address);
            System.out.println("Phone:" + phone);
            Set<Car> keys = cars.keySet();
            int counter = 1;
            for (Car key: keys){
                System.out.println("Car #" + counter + ":" + key);
                Owner value = cars.get(key);
                System.out.println("Owner:" + value);
                System.out.println();
                counter++;
            }
            System.out.println("*****************************************");
        }
    public void returnCarToOwner(String code){
        Car carToReturn = null; //машину еще не нашли
        for(Car car: cars.keySet()) { //перебираем ключи
            if (car.getCode().equalsIgnoreCase(code)) {// возвращаем ноомер машины
               // carToReturn = car;
                cars.remove(car);
                System.out.println("Removed: " + car.getCode());
                   return;


            }


        }

        System.out.println("Invalid Number");
    }
}

