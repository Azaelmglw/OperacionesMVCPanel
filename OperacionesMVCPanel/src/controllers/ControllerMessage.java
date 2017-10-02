package controllers;

import models.*;
import views.*;
/**
 *
 * @author Azael_Mendoza
 */
public class ControllerMessage {
    private final ViewMessage view_message;
    private final ModelMessage model_message;
    
    public ControllerMessage(ViewMessage view_message, ModelMessage model_message){
        this.view_message = view_message;
        this.model_message = model_message;
        initView();
    }
    
    public void initView(){
        view_message.jbtn_hola.addActionListener(e -> jbtn_holaMouseClicked());
        view_message.jbtn_adios.addActionListener(e -> jbtn_adiosMouseClicked());
        view_message.jlb_message.setText(model_message.getMessage());
    }
    
    public void jbtn_holaMouseClicked(){
        model_message.setMessage("Hola desde panel MVC");
        view_message.jlb_message.setText(model_message.getMessage());
    }
    
    public void jbtn_adiosMouseClicked(){
        model_message.setMessage("Adios desde panel MVC");
        view_message.jlb_message.setText(model_message.getMessage());
    }
    
}