package classes.herencia;

import java.util.Date;

public class Cliente extends Persona {

    public static int cantidad;        // 0, cero es el valor por defecto para variables del tipo int

    // Atributos de la clase
    private int id;
    private Date fechaRegistro;
    private boolean vip;

    // Constructor
    public Cliente( String nombres, String apellidos, char genero, String direccion, int edad, Date fechaRegistro, boolean vip ) {
        super( nombres, apellidos, genero, direccion, edad );       //  Agregamos el llamado al constructor de la clase padre, siempre debe ser la primera linea del constructor de la clase hija

        this .fechaRegistro = fechaRegistro;
        this .vip = vip;
        this .id = ++ Cliente .cantidad;
    }

    // Getters and setters
    public int getId() {
        return this .id;
    }

    public Date getFechaRegistro() {
        return this .fechaRegistro;
    }

    public void setFechaRegistro( Date fechaRegistro ) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this .vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        // StringBuilder: Almacena cadenas de caracteres.
        StringBuilder sb = new StringBuilder();

        // StringBuilder: Su tamaño y contenido pueden modificarse. Los objetos de éste tipo son mutables. Esto es una diferencia con los String
        sb .append( getClass() .getSimpleName() ) .append( "[ " );
        sb .append( "id = " ) .append( this .id + ", " );
        sb .append( "registro = " ) .append( this .fechaRegistro + ", "  );
        sb .append( super .toString() );        //  Agregamos los datos de la clase padre
        sb .append( " ]" );

        return sb .toString();
    }

}
