public class EvBuilder {
    private Ev ev;

    public EvBuilder(){
        this.ev = new Ev();
    }
    public static EvBuilder startBuild(){
        return new EvBuilder();
    }

    public Ev build(){
        return this.ev;
    }
    public EvBuilder setMahalle(String mahalle) {
        this.ev.setMahalle(mahalle);
        return this;
    }

    public EvBuilder setIlce(String ilce) {
        this.ev.setIlce(ilce);
        return this;
    }

    public EvBuilder setSehir(String sehir) {
        this.ev.setSehir(sehir);
        return this;
    }

    public EvBuilder setYili(int yili) {
        this.ev.setYili(yili);
        return this;}


    public EvBuilder setOdaSayisi(int odaSayisi) {
        this.ev.setOdaSayisi(odaSayisi);
        return this;
    }

    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.ev.setBanyoSayisi(banyoSayisi);
        return this;
    }

    public EvBuilder setSalonSayisi(int salonSayisi) {
        this.ev.setSalonSayisi(salonSayisi);
        return this;
    }

    public EvBuilder setBalkonSayisi(int balkonSayisi) {
        this.ev.setBalkonSayisi(balkonSayisi);
        return this;
    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.ev.setTuvaletSayisi(tuvaletSayisi);
        return this;
    }

    public EvBuilder setDoublex(boolean doublex) {
        this.ev.setDoublex(doublex);
        return this;
    }

    public EvBuilder setEsyali(boolean esyali) {
        this.ev.setEsyali(esyali);
        return this;
    }

    public EvBuilder setHasOtopark(boolean hasOtopark) {
        this.ev.setHasOtopark(hasOtopark);
        return this;
    }

    public EvBuilder setHasCocukParki(boolean hasCocukParki) {
        this.ev.setHasCocukParki(hasCocukParki);
        return this;
    }

    public EvBuilder setHasKlima(boolean hasKlima) {
        this.setHasKlima(hasKlima);
        return this;
    }

    public EvBuilder setHasHavuz(boolean hasHavuz) {
        this.setHasHavuz(hasHavuz);
        return this;
    }
}
