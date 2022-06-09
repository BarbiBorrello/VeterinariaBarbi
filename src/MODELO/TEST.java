/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import CONTROLADOR.ClienteData;
import CONTROLADOR.Conexion;
import CONTROLADOR.MascotaData;
import CONTROLADOR.TratamientoData;
import CONTROLADOR.VisitaData;
import java.util.List;

/**
 *
 * @author Barbara
 */
public class TEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            // TODO code application logic here
            Conexion conexion = new Conexion();
            ClienteData cd = new ClienteData(conexion);
            MascotaData md = new MascotaData(conexion);
            TratamientoData td = new TratamientoData(conexion);
            VisitaData vd = new VisitaData(conexion);

 //  Metodo: CLIENTE_Buscar por id de cliente //
 
// Cliente existente en la base // 
//// 
// System.out.println(cd.buscarCliente(1)); 
// System.out.println(cd.buscarCliente(2)); 
// System.out.println(cd.buscarCliente(3)); 
//// no tira el string de contacto alternativo//   
            
//  Cliente inexistente en la base //  
// 
//  System.out.println(cd.buscarCliente(32));
//  System.out.println(cd.buscarCliente(198));
//  System.out.println(cd.buscarCliente(55));
//// agregar opcion de agregar cliente// 


////  Metodo: CLIENTE_Buscar por dni //
//
//// Cliente existente en la base // 
//
//System.out.println(cd.buscarClientexDNI(23456789));
//System.out.println(cd.buscarClientexDNI(23456789)); 


            


            
            
            
  






        


            


            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
