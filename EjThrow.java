/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc.TareaExtraclase4;

/**
 *
 * @author alero
 */
public class EjThrow {

    static void testThrow() throws Exception {
        String t = null;
        t.toString();
    }

    public static void main(String[] args) {
        try {
            testThrow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
