/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc.TareaExtraclase4;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alero
 */
public class EjFinally {

    private static void generateFile() {

        FileWriter writer = null;

        try {

            writer = new FileWriter("Table");
            writer.append("Hola");

            System.out.println("File created...");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
