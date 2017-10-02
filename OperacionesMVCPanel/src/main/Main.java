package main;

import views.*;
import models.*;
import controllers.*;
/**
 *
 * @author Azael_Mendoza
 */
public class Main {
    private static ViewMain view_main;
    private static ModelMain model_main;
    private static ControllerMain controller_main;
    
    private static ViewMessage view_message;
    private static ModelMessage model_message;
    private static ControllerMessage controller_message;
    
    private static ViewOperaciones view_operaciones;
    private static ModelOperaciones model_operaciones;
    private static ControllerOperaciones controller_operaciones;
    
    public static void main (String oamg[]){
        view_message = new ViewMessage();
        model_message = new ModelMessage();
        controller_message = new ControllerMessage(view_message, model_message);
        
        view_operaciones = new ViewOperaciones();
        model_operaciones = new ModelOperaciones();
        controller_operaciones= new ControllerOperaciones(view_operaciones, model_operaciones);
        
        view_main = new ViewMain();
        model_main = new ModelMain();
        controller_main = new ControllerMain(view_main, view_message, view_operaciones,  model_main);
    }
    
}