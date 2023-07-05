package taxas;

public class Moeda {

    private double  dolar = 4.79;
    private double euro = 5.23 ;
    private double LibrasEterlina = 6.09;
    private double PesoArgentino = 0.019;
    private double  PesoChileno = 0.0060;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getLibrasEterlina() {
        return LibrasEterlina;
    }

    public void setLibrasEterlina(double librasEterlina) {
        LibrasEterlina = librasEterlina;
    }

    public double getPesoArgentino() {
        return PesoArgentino;
    }

    public void setPesoArgentino(double pesoArgentino) {
        PesoArgentino = pesoArgentino;
    }

    public double getPesoChileno() {
        return PesoChileno;
    }

    public void setPesoChileno(double pesoChileno) {
        PesoChileno = pesoChileno;
    }
}
