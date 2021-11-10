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
public class TestExceptionTwo {
    public static void main(String[] args){
        StudentManager manager = new StudentManager();
        try{
            manager.find("000000");
        }catch(Ej2Exception ex){
            System.err.print(ex);
        }
    }
}

class StudentManager {

    public void find(String studentID) throws Ej2Exception {
        if (studentID.equals("123456")) {
            System.out.println("Student found in the system");
        } else {
            throw new Ej2Exception("Could not find student with ID " + studentID);
        }
    }
}

class Ej2Exception extends Exception {

    public Ej2Exception(String message) {
        super(message);
    }
}
