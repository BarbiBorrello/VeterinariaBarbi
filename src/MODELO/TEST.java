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
import java.util.ArrayList;
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
            
// Metodo: CLIENTE_AGREGAR CLIENTE / --------------------------------------------------------------------------------        
            
// Pruebas exitosas en documento: Pruebas_main_CLASE_MODELO_  EXITOSAS//
//// desde la vista:
//confirma?
//carga exitosa OK //        
            
// Metodo: CLIENTE_Buscar por id de cliente //------------------------------------------------------------------------
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

// Metodo: CLIENTE_Buscar por dni //-------------------------------------------------------------------------------

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


// Metodo: CLIENTE_modificar cliente //--------------------------------------------------------------------

// Cliente existente en la base // 

//Cliente cliente1 = new Cliente(23456789, "Francella", "Guillermo", "Avenida Siempre viva 123", "12345678", "Pedrito rulito", true);
//cd.modificarCliente(1,cliente1);

//Cliente cliente2 = new Cliente ( 13690269, "Martinez", "Hector Antonio", "Juan Gilberto Funes 178 (Cerro de Oro)","266450330", "Liliana", true);
//cd.modificarCliente(2,cliente2);


// Cliente inexistente en la base // 
//cd.modificarCliente(1, cliente20);

// Metodo: CLIENTE_borrar cliente //-----------------------------------------------------------------

// Cliente existente en la base // 
//cd.borrarCliente(7);

// Cliente existente en la base // 
//cd.borrarCliente(37);


// Metodo: CLIENTE_activar cliente //-----------------------------------------------------------------

// Cliente existente en la base // 
//cd.activarCliente(7);

// Cliente inexistente en la base // 
//cd.activarCliente(20);

// Metodo: CLIENTE_consultaCliente //-----------------------------------------------------------------
//         
//ArrayList<Cliente> clientes = new ArrayList<Cliente>();
            
// lista vacia //
//            
//List<Cliente> clientes = cd.obtenerClientes();
//
//            for (Cliente c : clientes) {
//                System.out.println(c.toString());
//
//            }
// Metodo: CLIENTE_consultaClientex NombreyApellido //-----------------------------------------------------------------//
//             
//List<Cliente> clientesApNom = cd.obtenerClientexAPELLIDOyNOMBRE("Borrello", "Barbara");
//
//            for (Cliente c : clientesApNom) {
//                
//                System.out.println(c.toString());
//            }  

//  Metodo: CLIENTE_consultaClientesActivos //-----------------------------------------------------------------//
//            
//List<Cliente> clientesActivos = cd.obtenerClientes_ACTIVOS(true);
//
//            for (Cliente c : clientesActivos) {
//                
//                System.out.println(c.toString());
//      }

//----------------------------------MASCOTA DATA-------------------------------//
            
// Metodo: MASCOTA_AGREGAR MASCOTA / --------------------------------------------------------------------------------        
            
// Pruebas exitosas en documento: Pruebas_main_CLASE_MODELO_  EXITOSAS//
//// desde la vista:
//confirma?
//carga exitosa OK //   

// Metodo: MASCOTA_Buscar por id de mascota //------------------------------------------------------------------------

// Mascota  existente en la base // 
//
//md.buscarMascotaActiva(2);
//md.buscarMascotaActiva(3);
//md.buscarMascotaActiva(4);

// Mascota  inexistente en la base //

//md.buscarMascota(23);
//md.buscarMascota(45);
//md.buscarMascota(109);


// Metodo: MASCOTA_Buscar por Alias  //------------------------------------------------------------------------

// Mascota  existente en la base // 

//md.buscarMascotaxALIAS("Pablo");
//md.buscarMascotaxALIAS("Fran");
            
// Mascota  inexistente en la base // 

md.buscarMascotaxALIAS("Josecito"); 
md.buscarMascotaxALIAS("Martita"); 

// Metodo: MASCOTA_modificar   //------------------------------------------------------------------------

// Mascota  existente en la base //

//Mascota mascota2 = new Mascota("Lola", "hembra", "perro", "shitsu", "blanco", LocalDate.of(2015,6, 23), 7, 7.5, true, cd.buscarCliente(5));
//md.modificarMascota(2, mascota2);

// Mascota  inexistente en la base //
//md.modificarMascota(2, mascota32);

// Metodo: MASCOTA_borrar   //------------------------------------------------------------------------

// Mascota  existente en la base //
//md.borrarMascota(7);

// Mascota  inexistente en la base //
//md.borrarMascota(34);

// Metodo: MASCOTA_activar   //------------------------------------------------------------------------

// Mascota  existente en la base //

//md.activarMascota(7);

// Mascota  inexistente en la base //

//md.activarMascota(45);

// Metodo: MASCOTA_obtener listado   //------------------------------------------------------------------------

//ArrayList<Cliente> clientes = new ArrayList<Cliente>();
            
// lista vacia //
//            
//List<Mascota> mascotas = md.obtenerMascotas();
//
//            for (Mascota m : mascotas) {
//                System.out.println(m.toString());
//            }

// Metodo: MASCOTA_obtener especies   //------------------------------------------------------------------------
//
//List<Mascota> mascotasP = md.obtenerEspecies("perro");
//
//            for (Mascota m : mascotasP) {
//                System.out.println(m.toString());
//            }
            
List < Mascota> mascotasG = md.obtenerEspecies("gato");

for (Mascota m : mascotasG){
    
    System.out.println(m.toString());
    
}

//----------------------------------TRATAMIENTO DATA-------------------------------//

// Metodo: TRATAMIENTO_AGREGAR TRATAMIENTO / --------------------------------------------------------------------------------        
            
// Pruebas exitosas en documento: Pruebas_main_CLASE_MODELO_  EXITOSAS//
//// desde la vista:
//confirma?
//carga exitosa OK //   

// Metodo: TRATAMIENTO_ buscarTratamiento Activo / ------------------------------------------------------------

Tratamiento tratamiento1 = new Tratamiento ("Vacunacion"," se aplica una dosis","antirrabica",1900,true);
Tratamiento tratamiento4 = new Tratamiento ("Curaciones","ataque de jabali","antibiticos / analgesicos ",3500,true);
            
//td.buscarTratamientoActivo(1);
//td.buscarTratamientoActivo(4);

td.buscarTratamientoActivo(32);













        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
