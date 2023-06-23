public class Televisao {

    private int volumeTV;
    private int canalTV;

    public Televisao(int volumeTV, int canalTV){

        this.volumeTV = volumeTV;
        this.canalTV = canalTV;

        
    }

    public void mudarCanal(int canal) {
        if ((canal > 0 ) && (canal <= 50))
        this.canalTV = canalTV;
    }

    public void aumentarVolume() {
        if (volumeTV < 60)
        this.canalTV++;
    }

    public void diminuirVolume() {
        if (volumeTV > 0)
        this.canalTV--;
    }


    @Override
    public String toString() {
        return "volume=" + volumeTV + ", canal=" + canalTV ;
    }

    public static void main(String[] args) {

        Televisao televisao = new Televisao(23 , 12);
        System.out.println(televisao.toString());
        televisao.mudarCanal(07);
        System.out.println(televisao.toString());
        televisao.aumentarVolume();
        System.out.println(televisao.toString());
        televisao.diminuirVolume();
        System.out.println(televisao.toString());
    }






}

