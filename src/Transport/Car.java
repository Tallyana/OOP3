package Transport;

public class Car extends Auto  {

    public Car(String brand, String model, int year, String country) {
        super(brand, model, year, country);
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

    private  String bodyType;
    private String number;
    private int seatCount;


    public void sellaCar(){
        System.out.println(getNumber() + " номер авто" + seatCount + " места" + bodyType );

    }

    @Override
    public String toString(){
        return number + " номер " + seatCount + "места " + bodyType;
    }


}
