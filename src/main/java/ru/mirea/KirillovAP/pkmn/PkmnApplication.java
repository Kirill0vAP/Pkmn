package ru.mirea.KirillovAP.pkmn;
import java.io.IOException;
public class PkmnApplication {
    public static void main(String[] args) throws IOException {
        CardImport imp = new CardImport();
        Card card = imp.importCards("C:\\Users\\kiril\\IdeaProjects\\Pkmn\\src\\main\\resources\\my_card.txt");
        System.out.printf(card.toString());
        CardExport exp = new CardExport();
        exp.exportCard(card);
        Card card2 = imp.importCardByte("C:\\Users\\kiril\\IdeaProjects\\Pkmn\\Golurk.crd");
        System.out.printf(card2.toString());
    }
}