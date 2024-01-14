public class EvBuilder {
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

    public static EvBuilder startBuild(){
        return new EvBuilder();
    }

    public Ev build(){
        Ev ev = new Ev();

        ev.setSehir(sehir);
        ev.setIlce(ilce);
        ev.setMahalle(mahalle);

        ev.setYili(Yili);
        ev.setTuvaletSayisi(tuvaletSayisi);
        ev.setOdaSayisi(odaSayisi);
        ev.setBalkonSayisi(balkonSayisi);
        ev.setBanyoSayisi(banyoSayisi);

        ev.setEsyali(isEsyali);
        ev.setDoublex(isDoublex);
        ev.setHasHavuz(hasHavuz);
        ev.setHasCocukParki(hasCocukParki);
        ev.setHasOtopark(hasOtopark);
        ev.setHasKlima(hasKlima);

        return ev;
    }

    public EvBuilder setMahalle(String mahalle) {
        this.mahalle = mahalle;
        return this;
    }

    public EvBuilder setIlce(String ilce) {
        this.ilce = ilce;
        return this;
    }

    public EvBuilder setSehir(String sehir) {
        this.sehir = sehir;
        return this;
    }

    public EvBuilder setYili(int yili) {
        Yili = yili;
        return this;}


    public EvBuilder setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
        return this;
    }

    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilder setSalonSayisi(int salonSayisi) {
        this.salonSayisi = salonSayisi;
        return this;
    }

    public EvBuilder setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public EvBuilder setDoublex(boolean doublex) {
        isDoublex = doublex;
        return this;
    }

    public EvBuilder setEsyali(boolean esyali) {
        isEsyali = esyali;
        return this;
    }

    public EvBuilder setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
        return this;
    }

    public EvBuilder setHasCocukParki(boolean hasCocukParki) {
        this.hasCocukParki = hasCocukParki;
        return this;
    }

    public EvBuilder setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
        return this;
    }

    public EvBuilder setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
        return this;
    }
}
