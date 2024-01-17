
public class Main {
    public static void main(String[] args) {
        Ev ev1 = EvBuilder.startBuild().setSehir("Malatya").
                setIlce("Yeşilyurt").setMahalle("Kiltepe")
                .setOdaSayisi(3).setYili(1976)
                .build();

        ev1.setBanyoSayisi(12);
        ev1.setIlce("Kale");

        printEv(ev1);
    }


    public static void printEv(Ev ev){
        System.out.println();
        System.out.println("Ev eklendi -> "+ ev.toString());
    }
}