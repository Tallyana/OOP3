package Transport;

public class Train extends Auto {
    private double price;
    private double travelTime;
    private String stationName;
    private String finalStop;
    private int numberWagons;


    public Train(String brand, String model, int year, String country, double travelTime,
                 String stationName, String finalStop) {
        super(brand, model, year, country);
        this.travelTime = travelTime;
        this.stationName = stationName;
        this.finalStop = finalStop;
    }

    public Train(String brand, String model, int year, String country, double price, double travelTime,
                 String stationName, String finalStop, int numberWagons) {
        super(brand, model, year, country);
        this.price = price;
        this.travelTime = travelTime;
        this.stationName = stationName;
        this.finalStop = finalStop;
        this.numberWagons = numberWagons;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberwagons() {
        return numberWagons;
    }

    public void setNumberwagons(int numberWagons) {
        this.numberWagons = numberWagons;
    }

    public String toString() {
        return "Количество вагонов  "+ numberWagons + ". Начальная станция  " + stationName + ". Конечная станция  "
                + finalStop + ".Время поездки " + travelTime + "час.Цена билета " + price + "руб.";
    }
}


