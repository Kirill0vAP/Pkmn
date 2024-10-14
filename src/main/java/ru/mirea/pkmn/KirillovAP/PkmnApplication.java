package ru.mirea.pkmn.KirillovAP;
import ru.mirea.pkmn.Card;

import java.io.IOException;
public class PkmnApplication {
    public static void main(String[] args) throws IOException {
        CardImport imp = new CardImport();
        Card card = imp.importCards("src\\main\\resources\\my_card.txt");
        System.out.println(card.toString());
        CardExport exp = new CardExport();
        exp.exportCard(card);

        Card card2 = imp.importCardByte("Golurk.crd");
        System.out.println(card2.toString());

        Card card3 = imp.importCardByte("ChesnaughtV.crd");
        System.out.println(card3.toString());
    }
}