package ru.mirea.KirillovAP.pkmn;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CardExport {
    public void exportCard(Card card) {
        String filename = card.getName() + ".crd"; // Получаем имя файла на основе имени покемона

        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(card); // Сериализация объекта
            System.out.println("Card exported as " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}