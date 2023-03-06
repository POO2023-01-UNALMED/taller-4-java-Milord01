package classroom;

public class Asignatura {

    public String nombre;
    String n = nombre;
    public short codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION);
        /*this(0);*/
    }

    public Asignatura(short codigoInterno,Tipo tipo) {
        this("Sin nombre", codigoInterno, 0,tipo);
    }

    public Asignatura(int codigoExterno,Tipo tipo) {
    	this.nombre = "Sin nombre";
        this.codigoInterno = 0;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public Asignatura(String nombre, Tipo tipo) {
    	this.nombre = nombre;
        this.codigoInterno = 0;
        this.codigoExterno = 0;
        this.tipo = tipo;
    }

    public Asignatura(String nombre, short codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(short codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void cambiarDatos(short codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(short codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (short) codigoInterno;
    }
}