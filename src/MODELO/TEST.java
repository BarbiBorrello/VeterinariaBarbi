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
            
//----------------------------------CLIENTE DATA-------------------------------//
            
// Metodo: CLIENTE_AGREGAR CLIENTE /         
            
// Pruebas exitosas en documento: Pruebas_main_CLASE_MODELO_  EXITOSAS//
//// desde la vista:
//confirma?
//carga exitosa OK //        
            
// Metodo: CLIENTE_Buscar por id de cliente //
// 
// Cliente existente en la base // 

// System.out.println(cd.buscarCliente(1)); 
// System.out.println(cd.buscarCliente(2)); 
// System.out.println(cd.buscarCliente(3)); 
           
// Cliente inexistente en la base //  

//  System.out.println(cd.buscarCliente(32));
//  System.out.println(cd.buscarCliente(198));
//  System.out.println(cd.buscarCliente(55));

//  opcion agregar cliente desde la vista// 

// Metodo: CLIENTE_Buscar por dni //

// Cliente existente en la base // 

//System.out.println(cd.buscarClientexDNI(23456789));
//System.out.println(cd.buscarClientexDNI(1369026));
//System.out.println(cd.buscarClientexDNI(5530976));

// opcion de agregar cliente desde la vista// 


// Cliente inexistente en la base //

//System.out.println(cd.buscarClientexDNI(4567809));
//System.out.println(cd.buscarClientexDNI(5860456));
//System.out.println(cd.buscarClientexDNI(9834574));

// opcion de agregar cliente desde la vista// 


// Metodo: CLIENTE_modificar cliente //

// Cliente existente en la base // 

//Cliente cliente1 = new Cliente(23456789, "Francella", "Guillermo", "Avenida Siempre viva 123", "12345678", "Pedrito rulito", true);
//cd.modificarCliente(1,cliente1);

//Cliente cliente2 = new Cliente ( 13690269, "Martinez", "Hector Antonio", "Juan Gilberto Funes 178 (Cerro de Oro)","266450330", "Liliana", true);
//cd.modificarCliente(2,cliente2);


// Cliente inexistente en la base // 
//cd.modificarCliente(1, cliente20);








            
            
            
  






        


            


            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
