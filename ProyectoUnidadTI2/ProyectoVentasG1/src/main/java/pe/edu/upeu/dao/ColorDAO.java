package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ColorTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.TecladoRead;
import pe.edu.upeu.util.UtilsX;

public class ColorDAO extends AppCrud{
   
    LeerArchivo lar;
    ColorTO colTO;
    
    TecladoRead tre=new TecladoRead();
    UtilsX ut=new UtilsX();

    public void registrarColor() {
        colTO=new ColorTO();
        lar=new LeerArchivo("Color.txt");
        colTO.setIdCol(generarId(lar, 0, "C", 1)); 
        colTO.setColor(tre.read("", "Ingrese nombre del color:"));
        agregarContenido(lar, colTO);
    }
    
    public void editarcolor(){
        lar=new LeerArchivo("Color.txt");
          colTO=new ColorTO();
          colTO.setIdCol(tre.read("","INGRESE EL ID DEL COLOR"));
          colTO.setColor(tre.read("","INGRESE EL NUEVO COLOR"));
          editarRegistro(lar, 0, colTO.getIdCol(), colTO);
    }

}
