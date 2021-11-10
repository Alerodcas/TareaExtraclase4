/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc.TareaExtraclase4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alero
 */
public class EjTry {
        public static List<List<String>> readFile() throws IOException {
        List<List<String>> records = new ArrayList<>();
        String[] values = null;
        try (BufferedReader br = new BufferedReader(new FileReader("Table.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String COMMA_DELIMITER = ",";
                values = line.split(COMMA_DELIMITER);
                records.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return records;
    }
    
}
