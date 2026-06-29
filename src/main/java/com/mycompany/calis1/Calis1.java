/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calis1;

/**
 *
 * @author Brith
 */
public class Calis1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        /*// 1. Configurar FlatLaf antes de crear cualquier ventana
        com.formdev.flatlaf.FlatLightLaf.setup();
        
        // 2. Iniciar la ventana de forma segura
        java.awt.EventQueue.invokeLater(() -> {
            iniciar_sesion cuenta = new iniciar_sesion();
            cuenta.setVisible(true);
        });*/
       // crearcuenta cr= new crearcuenta();
        //cr.setVisible(true);
        CUENTACREADA C = new CUENTACREADA();
        C.setVisible(true);
    }
}
