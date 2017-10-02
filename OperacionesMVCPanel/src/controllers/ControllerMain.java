package controllers;

import models.*;
import views.*;
/**
 *
 * @author Azael_Mendoza
 */
public class ControllerMain {
    ViewMain view_main;
    ViewMessage view_message;
    ViewOperaciones view_operaciones;
    ModelMain model_main;
    
    public ControllerMain(ViewMain view_main, ViewMessage view_message, ViewOperaciones view_operaciones, ModelMain model_main){
        this.view_main = view_main;
        this.view_message = view_message;
        this.view_operaciones = view_operaciones;
        this.model_main = model_main;
        initView();
        }
        
        public void initView(){
            this.view_main.setTitle("Hello MVC Panel");
            this.view_main.jmi_message.addActionListener(e -> jmi_messageMouseClicked());
            this.view_main.jmi_operaciones.addActionListener(e -> jmi_operacionesMouseClicked());
            this.view_main.setLocationRelativeTo(null);
            this.view_main.setVisible(true);
        }
        
        public void jmi_messageMouseClicked(){
            this.view_main.setContentPane(view_message);
            this.view_main.revalidate();
            this.view_main.repaint();
        }
        
        public void jmi_operacionesMouseClicked(){
            this.view_main.setContentPane(view_operaciones);
            this.view_main.revalidate();
            this.view_main.repaint();
        }
        
}