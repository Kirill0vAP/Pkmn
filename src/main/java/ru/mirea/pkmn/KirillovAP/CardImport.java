package ru.mirea.pkmn.KirillovAP;
import ru.mirea.pkmn.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class CardImport {

    // Метод для импорта карт из текстового файла
    public Card importCards(String filePath) {
        Card card = new Card();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            //1
            card.setPokemonStage(PokemonStage.valueOf(br.readLine().split("\\. ")[1]));
            //2
            card.setName(br.readLine().split("\\. ")[1]);
            //3
            card.setHp(Integer.parseInt(br.readLine().split("\\. ")[1]));
            //4
            card.setPokemonType(EnergyType.valueOf(br.readLine().split("\\. ")[1]));
            //5
            String line5 = br.readLine().split("\\. ")[1];
            if (line5.equals("-")) {
            } else {
                card.setEvolvesFrom(new Card(line5));
            }
            //6
            String[] line6 = br.readLine().split("\\. ")[1].split(", ");
            List<AttackSkill> skills = new ArrayList<>();
            for (String i : line6){
                String[] arr = i.split(" / ");
                AttackSkill attackSkill = new AttackSkill(arr[1], "", arr[0], Integer.parseInt(arr[2]));
                skills.add(attackSkill);
            }
            card.setSkills(skills);
            //7
            String line7 = br.readLine().split("\\. ")[1];
            if (line7.equals("-")) {
            } else {
                card.setWeaknessType(EnergyType.valueOf(line7));
            }
            //8
            String line8 = br.readLine().split("\\. ")[1];
            if (line8.equals("-")) {
            } else {
                card.setResistanceType(EnergyType.valueOf(line8));
            }
            //9
            card.setRetreatCost(br.readLine().split("\\. ")[1]);
            //10
            card.setGameSet(br.readLine().split("\\. ")[1]);
            //11
            card.setRegulationMark(br.readLine().split("\\. ")[1].charAt(0));
            //12
            String line12 = br.readLine().split("\\. ")[1];
            String[] nameStudent = line12.split(" / ");
            card.setPokemonOwner(new Student(nameStudent[0],
                    nameStudent[1], nameStudent[2], nameStudent[3]));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата числа: " + e.getMessage());
        }
        return card;
    }
    public Card importCardByte(String filename) {
        Card card = null;

        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            card = (Card) objectIn.readObject();
        } catch (IOException e) {
            System.err.println("Error while importing card: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Card class not found: " + e.getMessage());
        }

        return card;
    }
}
