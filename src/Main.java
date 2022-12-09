import Transport.Auto;

public class Main {
    public static void main(String[] args) {

            Auto lada = new Auto("Lada", "Granta", 2015,
                    "Россия");
            Auto audi = new Auto("Audi", "A8 L TDI quatro", 2020,"Германия");
            Auto bmv = new Auto("BMV", "Z8", 2010, "Europe");
            Auto kia = new Auto("KIA", "Sportage", 2009, "Южной Корее");
            Auto hyundai = new Auto("Hyundai", "Avante", 2001,"Южной Корее");

            kia.startUp();
            kia.stopEnd();
            System.out.println(kia.getModel());
            System.out.println(bmv.getModel());
            System.out.println(audi.getCountry());

        }
}