  abstract class KaffeDekorator implements Kaffee {
     Kaffee dekoratorKaffe;

    public  KaffeDekorator(Kaffee dekoratorKaffe) {
        this.dekoratorKaffe=dekoratorKaffe;
    }


      @Override
      public String getDesciption() {
          return dekoratorKaffe.getDesciption();
      }

      @Override
      public Double getPrice() {
          return dekoratorKaffe.getPrice();
      }
  }
