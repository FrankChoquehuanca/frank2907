package pe.edu.upeu.modelo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @Data
public class ProductoTO {
    String idProducto, nombre, unidadMed, idCateg;
    double preUnitario, porcentUtil, stock;
}
