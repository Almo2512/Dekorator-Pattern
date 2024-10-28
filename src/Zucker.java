public class Zucker extends KaffeDekorator{
    public Zucker(Kaffee dekoratorKaffe) {
        super(dekoratorKaffe);
    }


    @Override
    public String getDesciption(){
        return dekoratorKaffe.getDesciption()+", zucker";
    }

    @Override
    public Double getPrice(){
        return dekoratorKaffe.getPrice()+0.6;
    }
}
