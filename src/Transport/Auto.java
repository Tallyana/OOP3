package Transport;

public  class Auto {

    public Object startUp;
    protected String brand;
    protected String model;
    protected int year;
    protected String country;
    protected static String noInfo = "Информация не указана";
    protected double fuelPercentage;


    public Auto(String brand, String model, int year, String country) {
        setBrand(brand);
        if (brand == null || brand.isEmpty()) this.brand = noInfo;
        else this.brand = brand;

        if (model == null || model.isEmpty()) this.model = noInfo;
        else this.model = model;

        this.year = year;
        this.country = country;
    }

    public Auto(double fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) this.brand = noInfo;
        else this.brand = brand;
    }

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

    private String getNoInfo() {
        return noInfo;
    }


    public double getFuelPercentage() {
        return fuelPercentage;
    }


    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage >= 0.0) {
            this.fuelPercentage = fuelPercentage;
        } else {
            this.fuelPercentage = Math.abs(fuelPercentage);
        }
    }

    public void startUp(){
        System.out.println(getBrand() + " " + getModel() + " начал движение");
    }
    public void stopEnd(){
        System.out.println(getBrand() + " " + getModel() + " закончил движение");
    }
    @Override
    public String toString(){
        return brand + " модель " + model + ", год " +year + ", страна" + country;
    }
    }


