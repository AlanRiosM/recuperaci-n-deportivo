class ParticipanteDeFutbol {
    private String nombre;
    private int edad;
    private boolean examenMedicoPasado;
    private boolean sinSanciones;


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean getExamenMedicoPasado() {
        return examenMedicoPasado;
    }

    public boolean getSinSanciones() {
        return sinSanciones;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setExamenMedicoPasado(boolean examenMedicoPasado) {
        this.examenMedicoPasado = examenMedicoPasado;
    }

    public void setSinSanciones(boolean sinSanciones) {
        this.sinSanciones = sinSanciones;
    }

    ParticipanteDeFutbol(String nombre, int edad, boolean examenMedicoPasado, boolean sinSanciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.examenMedicoPasado = examenMedicoPasado;
        this.sinSanciones = sinSanciones;
    }


    void validarEdad() {
        if (edad > 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Debe ser mayor de edad");
        }
    }

    void validarExamenMedico(){
        if (examenMedicoPasado) {
            System.out.println("Tiene examenes medicos, esta apto para jugar");
        } else {
            System.out.println("No tiene examenes medicos, no esta apto para jugar");
        }
    }

    void validarSanciones(){
        if (sinSanciones) {
            System.out.println("No tiene sanciones, esta apto para jugar");
        } else {
            System.out.println("Tiene sanciones, no esta apto para jugar");
        }
    }
}

class Jugador extends ParticipanteDeFutbol{
    private int PartidosJugados;

    public int getPartidosJugados() {
        return PartidosJugados;
    }

    public void setPartidosJugados(int PartidosJugados) {
        this.PartidosJugados = PartidosJugados;
    }

    Jugador(String nombre, int edad, boolean examenMedicoPasado, boolean sinSanciones, int PartidosJugados) {
        super(nombre, edad, examenMedicoPasado, sinSanciones);
        this.PartidosJugados = PartidosJugados;
    }
}

class Arbitro extends ParticipanteDeFutbol{
    private int PartidosPitados;

    public int getPartidosPitados() {
        return PartidosPitados;
    }

    public void setPartidosPitados(int PartidosPitados) {
        this.PartidosPitados = PartidosPitados;
    }

    Arbitro(String nombre, int edad, boolean examenMedicoPasado, boolean sinSanciones, int PartidosPitados) {
        super(nombre, edad, examenMedicoPasado, sinSanciones);
        this.PartidosPitados = PartidosPitados;
    }
}

