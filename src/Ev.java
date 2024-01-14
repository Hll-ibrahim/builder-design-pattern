public class Ev {
    private String mahalle;
    private String ilce;
    private String sehir;

    private int Yili;
    private int odaSayisi;
    private int banyoSayisi;
    private int salonSayisi;
    private int balkonSayisi;
    private int tuvaletSayisi;

    private boolean isDoublex;
    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasCocukParki;
    private boolean hasKlima;
    private boolean hasHavuz;

    public Ev(){}
    public Ev(String mahalle, String ilce, String sehir, int yili, int odaSayisi, int banyoSayisi, int salonSayisi, int balkonSayisi, int tuvaletSayisi, boolean isDoublex, boolean isEsyali, boolean hasOtopark, boolean hasCocukParki, boolean hasKlima, boolean hasHavuz) {
        this.mahalle = mahalle;
        this.ilce = ilce;
        this.sehir = sehir;
        Yili = yili;
        this.odaSayisi = odaSayisi;
        this.banyoSayisi = banyoSayisi;
        this.salonSayisi = salonSayisi;
        this.balkonSayisi = balkonSayisi;
        this.tuvaletSayisi = tuvaletSayisi;
        this.isDoublex = isDoublex;
        this.isEsyali = isEsyali;
        this.hasOtopark = hasOtopark;
        this.hasCocukParki = hasCocukParki;
        this.hasKlima = hasKlima;
        this.hasHavuz = hasHavuz;
    }


    @Override
    public String toString() {
        return "Ev{" +
                "mahalle='" + mahalle + '\'' +
                ", ilce='" + ilce + '\'' +
                ", sehir='" + sehir + '\'' +
                ", Yili=" + Yili +
                ", odaSayisi=" + odaSayisi +
                ", banyoSayisi=" + banyoSayisi +
                ", salonSayisi=" + salonSayisi +
                ", balkonSayisi=" + balkonSayisi +
                ", tuvaletSayisi=" + tuvaletSayisi +
                ", isDoublex=" + isDoublex +
                ", isEsyali=" + isEsyali +
                ", hasOtopark=" + hasOtopark +
                ", hasCocukParki=" + hasCocukParki +
                ", hasKlima=" + hasKlima +
                ", hasHavuz=" + hasHavuz +
                '}';
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public void setYili(int yili) {
        Yili = yili;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public void setSalonSayisi(int salonSayisi) {
        this.salonSayisi = salonSayisi;
    }

    public void setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
    }

    public void setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
    }

    public void setDoublex(boolean doublex) {
        isDoublex = doublex;
    }

    public void setEsyali(boolean esyali) {
        isEsyali = esyali;
    }

    public void setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
    }

    public void setHasCocukParki(boolean hasCocukParki) {
        this.hasCocukParki = hasCocukParki;
    }

    public void setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
    }

    public void setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
    }

    public String getMahalle() {
        return mahalle;
    }

    public String getIlce() {
        return ilce;
    }

    public String getSehir() {
        return sehir;
    }

    public int getYili() {
        return Yili;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public int getSalonSayisi() {
        return salonSayisi;
    }

    public int getBalkonSayisi() {
        return balkonSayisi;
    }

    public int getTuvaletSayisi() {
        return tuvaletSayisi;
    }

    public boolean isDoublex() {
        return isDoublex;
    }

    public boolean isEsyali() {
        return isEsyali;
    }

    public boolean isHasOtopark() {
        return hasOtopark;
    }

    public boolean isHasCocukParki() {
        return hasCocukParki;
    }

    public boolean isHasKlima() {
        return hasKlima;
    }

    public boolean isHasHavuz() {
        return hasHavuz;
    }
}
