package com.ristorazione.main;

import com.ristorazione.exceptions.NotItemInRist;
import com.ristorazione.menu.ElementoMenu;
import com.ristorazione.menu.Menu;
import com.ristorazione.prodotti.Carne;
import com.ristorazione.prodotti.Vino;
import com.ristorazione.rist.Ristorante;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Ristorante r1 = new Ristorante("Buono buono", new Menu());

        try {
            FileReader fr = new FileReader(new File("menu1.txt"));
            BufferedReader br = new BufferedReader(fr);
            String s;
            String[] temp;
            while((s = br.readLine()) != null){
                temp = s.split("\t");
                if(Integer.parseInt(temp[0]) == 0){
                    r1.addMenuItem(new ElementoMenu(new Carne(temp[1], temp[2],temp[3]), Double.parseDouble(temp[4])));
                }
                else if(Integer.parseInt(temp[0]) == 1){
                    r1.addMenuItem(new ElementoMenu(new Vino(temp[1], Double.parseDouble(temp[2]), temp[3], temp[4]), Double.parseDouble(temp[5])));
                }
            }

            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotItemInRist notItemInRist) {
            notItemInRist.printStackTrace();
        }

        System.out.println(r1.printMenu());
    }
}
