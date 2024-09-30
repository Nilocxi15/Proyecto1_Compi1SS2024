package models;

public class newTrivia {
    private String idTrivia = null;
    private String time = null;
    private String nombre = null;
    private String tema = null;
    private String usuarioCreacion = null;
    private String fechaCreacion = null;

    public newTrivia(String idTrivia, String time, String nombre, String tema, String usuarioCreacion, String fechaCreacion) {
        this.idTrivia = idTrivia;
        this.time = time;
        this.nombre = nombre;
        this.tema = tema;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }

    public String getIdTrivia() {
        return idTrivia;
    }

    public String getTime() {
        return time;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTema() {
        return tema;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }
}
