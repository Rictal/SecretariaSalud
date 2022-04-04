package Dominio;

import java.awt.image.BufferedImage;
import java.io.File;

public class Expediente {

    private BufferedImage imagenes;
    private String informacionGeneral;
    private File documento;

    public Expediente() {
    }

    public Expediente(BufferedImage imagenes, String informacionGeneral, File documento) {
        this.imagenes = imagenes;
        this.informacionGeneral = informacionGeneral;
        this.documento = documento;
    }
    
}
