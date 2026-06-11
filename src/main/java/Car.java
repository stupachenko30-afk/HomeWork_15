import java.util.Objects;

public class Car implements Comparable<Car> {

    private String model;
    private int year;
    private String regNumber;
    private String code;
    private String serviceType;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(code, car.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", regNumber='" + regNumber + '\'' +
                ", code='" + code + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }

    public Car(String model, int year, String regNumber, String code) {
        this.model = model;
        this.year = year;
        this.regNumber = regNumber;
        this.code = code;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public int compareTo(Car other) {
        int res = regNumber.compareToIgnoreCase(other.regNumber);
        if (res == 0)
            res = code.compareTo(other.code);
        return res;
    }
}
