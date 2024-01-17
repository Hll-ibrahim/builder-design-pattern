public class EvDirector {
    private EvBuilder evBuilder;
    public EvDirector(EvBuilder evBuilder){
        this.evBuilder = evBuilder;
    }

    public Ev mustakilEv(EvBuilder evBuilder){
        return evBuilder.setSehir("Malatya").setIlce("Yeşilyurt").setEsyali(true).setBanyoSayisi(1).build();
    }
    public Ev apartman(EvBuilder evBuilder){
        return this.evBuilder.setSehir("İstanbul").setIlce("Kadıkoy").setEsyali(true).setBalkonSayisi(2).setBanyoSayisi(2).build();
    }
}
