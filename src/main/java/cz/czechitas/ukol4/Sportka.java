package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();

    //pro kontrolu
    @Override
    public String toString() {
        return "Sportka{" +
                "osudi=" + osudi +
                '}';
    }

    public Sportka() {
        //naplní osudí čísly 1 až 49.
        for (int i = 0; i < 49; i++) {
            osudi.add(i+1);
        }
    }

    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichat() {
        //zamíchá osudí
        Collections.shuffle(osudi);
    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> vylosovanaCisla() {
        //Vrací seznam prvních 6 čísel z osudí.
        return osudi.subList(0,6);
    }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dodatkoveCislo() {
        //Vrátí sedmé číslo z osudí.
        return osudi.get(6);
    }
}
