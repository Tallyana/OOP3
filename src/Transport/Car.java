package Transport;

public class Car extends Auto  {
    private  String bodyType;
    private String number;
    private int seatCount;
    public Car(String brand, String model, int year, String country, String bodyType, int seatCount) {
        super(brand, model, year, country);
        this.bodyType = bodyType;
        this.seatCount = seatCount;
    }

    public Car(String brand, String model, int year, String country, String bodyType, String number, int seatCount,double fuelPercentage) {
        super(brand, model, year, country);
        this.bodyType = bodyType;
        this.number = number;
        this.seatCount = seatCount;
        this.fuelPercentage = fuelPercentage;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public int getSeatCount() {
        return seatCount;
    }


}
