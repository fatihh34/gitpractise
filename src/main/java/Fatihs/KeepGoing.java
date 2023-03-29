package Fatihs;

public  class KeepGoing {
    public String mezUni;
    public int mezYear;
    public String mezCity;
    //public Boolean dortYillik;

    public static void main(String[] args) {
        KeepGoing keepGoing = new KeepGoing();
        keepGoing.mezUni = "Example University";
        keepGoing.mezYear = 2022;
        keepGoing.mezCity = "Example City";
        System.out.println("University: " + keepGoing.mezUni);
        System.out.println("Year: " + keepGoing.mezYear);
        System.out.println("City: " + keepGoing.mezCity);
    }

}
    //    public KeepGoing(String mezUni, int mezYear, String mezCity) {
//        this.mezUni = mezUni;
//        this.mezYear = mezYear;
//        this.mezCity = mezCity;
//        KeepGoing keepGoing=new KeepGoing("Hacettepe",2010,"Ankara");
//        System.out.println("keepGoing = " + keepGoing);
//    }
//
//    @Override
//    public String toString() {
//        return "KeepGoing{" +
//                "mezUni='" + mezUni +
//                ", mezYear=" + mezYear +
//                ", mezCity='" + mezCity  +
//                '}';
//    }
//}
    //public class Main {


