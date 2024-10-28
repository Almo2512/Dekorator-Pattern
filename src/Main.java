
public class Main {
    public static void main(String[] args) {

        Kaffee kaffe=new BasicKaffee();

        System.out.println(kaffe.getDesciption()+" kostet "+kaffe.getPrice()+ "Euro");

        Kaffee milchKAffe= new Mick(kaffe);
        System.out.println(milchKAffe.getDesciption()+" kostet "+milchKAffe.getPrice()+ "Euro");

        Kaffee KAffeMitZucker= new Zucker(kaffe);
        System.out.println(KAffeMitZucker.getDesciption()+" kostet "+KAffeMitZucker.getPrice()+ "Euro");


        Kaffee zuckerMilchKaffe=new BasicKaffee();
        zuckerMilchKaffe= new Zucker(zuckerMilchKaffe);
        zuckerMilchKaffe= new Mick(zuckerMilchKaffe);

        System.out.println(zuckerMilchKaffe.getDesciption()+" kostet "+zuckerMilchKaffe.getPrice()+ "Euro");



    }
}