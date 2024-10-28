public class Mick extends KaffeDekorator{
    public Mick(Kaffee dekoratorKaffe) {
        super(dekoratorKaffe);
    }
    @Override
    public String  getDesciption(){
        return dekoratorKaffe.getDesciption()+", Milch";
    }

    public Double  getPrice(){
        return dekoratorKaffe.getPrice()+ 0.5;
    }
}
