import Locations.*;
import Tourists.*;


public class App {
    public static void main(String[] args) throws Exception {

        Locations Canada = new Canada();
        Locations Boracay = new Boracay();
        Locations Davao = new Davao();
        Locations Australia = new Australia();
        Locations Tagaytay = new Tagaytay();
        Locations Japan = new Japan();
        

        Tourist Carangan = new Carangan();

        Boracay.accept(Carangan);
        Davao.accept(Carangan);
        Canada.accept(Carangan);
        Australia.accept(Carangan);
        Tagaytay.accept(Carangan);
        Japan.accept(Carangan);



    }
}