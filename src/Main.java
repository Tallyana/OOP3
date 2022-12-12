import Transport.Auto;
import Transport.Car;
import Transport.Train;

public class Main {
    public static void main(String[] args) {

            Auto lada = new Auto("Lada", "Granta", 2015, "Россия");
            Auto audi = new Auto("Audi", "A8 L TDI quatro", 2020," Германия");
            Auto bmv = new Auto("BMV", "Z8", 2010, " Europe");
            Auto kia = new Auto("KIA", "Sportage", 2009, " Южная Корея");
            Auto hyundai = new Auto("Hyundai", "Avante", 2001," Южная Корея");

            Car yaz = new Car("YAZ", "Patriot", 2020," Россия",", Джип ," , "889 ",7,13.20);
            Car porshe = new Car( "Porshe, ", "AU8 ", 2018 , ", Europe" , ", hatchbak, ","256", 5,25.30);

            Train leningrad = new Train("Ленинград","Д-125",2019,"Россия",1700,2.3,
                     "Ленинградский вокзал", "Ленинград Пассажирская" , 8,56.60);
            Train lastochka = new Train("Ласточка, ", "В-901, ", 2011, "Россия",3500,12,"Белорусский вокзал", "Минск-Пасс.",13,75.50);

            kia.startUp();
            kia.stopEnd();

            System.out.println(kia.getModel());
            System.out.println(bmv.getModel());
            System.out.println(audi.getCountry());
            System.out.println( kia.toString());
            System.out.println( bmv.toString());
            System.out.println( yaz.toString());
            System.out.println( porshe.toString());
            System.out.println( leningrad.toString());
            System.out.println( lastochka.toString());

    }
        }
