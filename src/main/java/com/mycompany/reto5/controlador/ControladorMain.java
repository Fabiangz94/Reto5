/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5.controlador;

import com.mycompany.reto5.modelo.DAO.Conexion;
import com.mycompany.reto5.vista.frmPrincipal;
import java.sql.Connection;

/**
 *
 * @author Fabian
 */
public class ControladorMain {
    public static void main(String[] args) {
        
        //Conexion cc = new Conexion(); probar la conexion a la DB
        //Connection cn = cc.conectar();
        
        new frmPrincipal().setVisible(true);
        
    }
    
}
