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

// Prueba:  CLIENTE DATA //------------------------------------------------------------------- 
// METODO: AGREGAR CLIENTE //-----------------------------------------------------------------

// Cliente cliente1 = new Cliente(23456789, "Francella", "Guillermo", "Avenida Siempre viva 123", "12345678", "Pedrito rulito", true);
// cd.agregarCliente(cliente1);

//Cliente cliente2 = new Cliente ( 13690269, "Martinez", "Hector Antonio", "Juan Gilberto Funes 178 (Cerro de Oro)","266450330", "Liliana", true);
//cd.agregarCliente(cliente2);
//
//Cliente cliente3 = new Cliente(12592708, "Arias", "Lidia", "Cipres 12", "473330", "no tiene", true);
//cd.agregarCliente(cliente3);
//
//Cliente cliente4 = new Cliente (9530567, "Peres","Antonia", "Gascon 20 ", "453901", "Pablo", true);
//cd.agregarCliente(cliente4);
//cd.modificarCliente(4, cliente4);

//Cliente cliente5 = new Cliente (25678234, "Borrello", "Barbara", "Sarmiento 4206", "456789", "", true);
//cd.agregarCliente(cliente5);

//Cliente cliente6 = new Cliente (5530976,"Borrello", "Hector", "Avenida Los Incas 425", "266470842", "Pancho", true);
//cd.agregarCliente(cliente6);

//Cliente cliente7 = new Cliente ( 23567456,"Saez","Juan Jose", "Juan de Azurduy 2920","423678", "Michi",true);
//cd.agregarCliente(cliente7);


// COMENTARIOS//----------------------------------------------------------------------------------------------
//  telefono pasar a string? //
// no debe permitir duplicados por DNI //
// puede no tener contacto alterntivo, debe especificar que no tiene, no puede quedar vacio//
// no se deben poder crear clientes en estado inactivo//

//---------------------------------------------------------------------------------------------------------------------------------------

// METODO: BUSCAR CLIENTE X ID //-----------------------------------------------------------------
//
//cd.buscarCliente(1);
//cd.buscarCliente(2);
//cd.buscarCliente(34);

// METODO: BUSCAR CLIENTE X DNI //-----------------------------------------------------------------

//cd.buscarClientexDNI(5530976);
//cd.buscarClientexDNI(1145678);

// METODO: BUSCAR CLIENTE X APELLIDO //-----------------------------------------------------------------

//cd.buscarClientexAPELLIDO("Martinez");
//no corre

// Prueba:  MASCOTA DATA //------------------------------------------------------------------- 
// METODO: AGREGAR MASCOTA //-----------------------------------------------------------------

//Mascota mascota1 = new Mascota("Pedro", "macho", "perro", "golden", "dorado", LocalDate.of(2020,4, 29), 40, 50.5, true,cd.buscarCliente(4));
//md.agregar_Mascota(mascota1);
////
//Mascota mascota2 = new Mascota("Lola", "hembra", "perro", "shitsu", "blanco", LocalDate.of(2015,6, 23), 7, 7.5, true, cd.buscarCliente(5));
//md.agregar_Mascota(mascota2); 
//
//Mascota mascota3 = new Mascota("Tincho", "macho", "gato", "angora", "negro y marron", LocalDate.of(2012,3, 12), 7, 7.5, true, cd.buscarCliente(5));
////md.agregar_Mascota(mascota3);
//
//Mascota mascota4 = new Mascota("Pablo", "macho", "gato", "siames", "negro", LocalDate.of(2016,3, 12), 5,4.5, true, cd.buscarCliente(1));
//md.agregar_Mascota(mascota4);
//
//Mascota mascota5 = new Mascota("JuanJo", "hembra", "perro", "bul dog frances", "gris attigrado", LocalDate.of(2021,3, 12), 15.6, 16.5, true, cd.buscarCliente(2));
//md.agregar_Mascota(mascota5);
//
//Mascota mascota6 = new Mascota("Sasha", "macho", "perro", "pitbull", "negro y marron", LocalDate.of(2010,3, 12), 35, 38.5, true, cd.buscarCliente(3));
//md.agregar_Mascota(mascota6);
//
//Mascota mascota7 = new Mascota("Mabel", "hembra", "gato", "persa", "blanco y gris", LocalDate.of(2022,3, 12), 7, 6.5, true, cd.buscarCliente(6));
//md.agregar_Mascota(mascota7);
//
//Mascota mascota8 = new Mascota("Fran", "macho", "gato", "tricolor", "tricolor/ BNG", LocalDate.of(2017,3, 12), 7, 7.5, true, cd.buscarCliente(7));
//md.agregar_Mascota(mascota8);
//
//Mascota mascota9 = new Mascota("Barbi", "hembra", "gato", "tricolor", "tricolor/ BNG", LocalDate.of(2017,3, 12), 7, 7.5, true, cd.buscarCliente(34));
//md.agregar_Mascota(mascota9);
//// NO SE PUEDA CARGAR CLIENTE INEXISTENTE//

// Prueba:  TRATAMIENTO DATA //------------------------------------------------------------------- 
// METODO: AGREGAR TRATAMENTO //-----------------------------------------------------------------

//Visita visita1 = new Visita(LocalDate.of(2020,4, 29),28.7,true,md.buscarMascotaActiva(5),td.buscarTratamientoActivo(1));
//vd.agregarVisita(visita1);

//Tratamiento tratamiento1 = new Tratamiento ("Vacunacion"," se aplica una dosis","antirrabica",1900,true);
//td.agregar_Tratamiento(tratamiento1);
//
//Tratamiento tratamiento2 = new Tratamiento ("Vacunacion"," se aplica una dosis","quintuple",1800,true);
//td.agregar_Tratamiento(tratamiento2);

//
//Tratamiento tratamiento3 = new Tratamiento ("Enfermedad"," hongos en las orejas","gotas Otovier NF",590,true);
//td.agregar_Tratamiento(tratamiento3);

//Tratamiento tratamiento4 = new Tratamiento ("Curaciones","ataque de jabali","antibiticos / analgesicos ",3500,true);
//td.agregar_Tratamiento(tratamiento4);
//
//Tratamiento tratamiento5 = new Tratamiento ("Estetica","Baño y Corte de Pelo"," ",1500,true);
//td.agregar_Tratamiento(tratamiento5);

//Tratamiento tratamiento6 = new Tratamiento ("Castracion","tamaño medio: se retiran solo ovarios"," material quirurjico y analgesicos ",6700,true);
//td.agregar_Tratamiento(tratamiento6);
//
//Tratamiento tratamiento7 = new Tratamiento ("Desparacitacion","1 sola toma, cada 6 meses en adultos"," triplex comprimidos ",170,true);
//td.agregar_Tratamiento(tratamiento7);

// Prueba: VISITA DATA //------------------------------------------------------------------- 
// METODO: AGREGAR VISITA //-----------------------------------------------------------------
            
//Visita visita1 = new Visita(LocalDate.of(2020,4, 29),5.7,true,md.buscarMascotaActiva(5),td.buscarTratamientoActivo(1));
//vd.agregarVisita(visita1);

//Visita visita2 = new Visita(LocalDate.of(2022,8, 13),29.8,true,md.buscarMascotaActiva(5),td.buscarTratamientoActivo(5));
//vd.agregarVisita(visita2);

//Visita visita3 = new Visita(LocalDate.of(2020,4, 30),32.8,true,md.buscarMascotaActiva(6),td.buscarTratamientoActivo(1));
//vd.agregarVisita(visita3);

//Visita visita4 = new Visita(LocalDate.of(2019,9, 12),15.7,true,md.buscarMascotaActiva(3),td.buscarTratamientoActivo(3));
//vd.agregarVisita(visita4);
//
//Visita visita5 = new Visita(LocalDate.of(2012,9, 01),3.7,true,md.buscarMascotaActiva(1),td.buscarTratamientoActivo(6));
////vd.agregarVisita(visita5);
//
//Visita visita6 = new Visita(LocalDate.of(2012,9, 01),3.7,true,md.buscarMascotaActiva(1),td.buscarTratamientoActivo(2));
//vd.agregarVisita(visita6);
//
//md.buscarMascotaInactiva(1);
//md.buscarMascotaActiva(2);

//md.buscarMascotaxALIAS("Tincho");
//md.buscarMascotaxALIAS("Lola");
//
//md.buscarMascotas(1);

//List <Mascota> mascotas = md.obtenerMascotas();
//
//for (Mascota m : mascotas){
//    System.out.println(m.getAlias());
//    System.out.println(m.getId_mascota());
//    System.out.println(m.getCliente());
//}
//
//
// cd.buscarClientexDNI(25664823);
// cd.buscarClientexDNI(5530976);
 
// cd.buscarClientexAPELLIDOyNOMBRE("Borrello", "Barbara");
 
 List <Cliente> clientesApNom = cd.buscarClientexAPELLIDOyNOMBRE("Borrello", "Barbara");
 
 for( Cliente c : clientesApNom){
     System.out.println(c.getDni());
     
 }
 
 






        


            


            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
