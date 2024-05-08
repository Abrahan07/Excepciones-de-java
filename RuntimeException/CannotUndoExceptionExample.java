/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class CannotUndoExceptionExample {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();

        try {
            undoManager.undo(); // Intentar realizar una operación de deshacer (esto lanzará CannotUndoException)
        } catch (CannotUndoException e) {
            System.out.println("¡Error al intentar deshacer!");
            e.printStackTrace();
        }
    }
}

