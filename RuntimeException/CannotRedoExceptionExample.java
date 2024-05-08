/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoManager;

public class CannotRedoExceptionExample {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();

        try {
            undoManager.redo(); // Intentar realizar una operación de re-hacer (esto lanzará CannotRedoException)
        } catch (CannotRedoException e) {
            System.out.println("¡Error al intentar re-hacer!");
            e.printStackTrace();
        }
    }
}

