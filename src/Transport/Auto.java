package Transport;

public class Auto {

    public Object startUp;
    private String brand;
    private String model;
    private  int year;
    private String country;
    private static String noInfo = "Информация не указана";


    public Auto(String brand, String model, int year, String country) {

        if (brand == null || brand.isEmpty()) this.brand = noInfo;
        else this.brand = brand;

        if (model == null || model.isEmpty()) this.model = noInfo;
        else this.model = model;

        this.year = year;
        this.country = country;
    }


    public void setBrand(String brand) {
        if(brand == null || brand.isEmpty()) this.brand = noInfo;
        else this.brand = brand;}

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    private String getNoInfo(){ return noInfo;}



    public void startUp(){
        System.out.println(getBrand() + " " + getModel() + " начал движение");
    }
    public void stopEnd(){
        System.out.println(getBrand() + " " + getModel() + " закончил движение");
    }
    @Override
    public String toString(){
        return brand + " модель " + model + "год " +year + " страна" + country;
    }
    }


