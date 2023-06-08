public class Persona {
    private String nombre;
    private String edad;
    private String barrio;
    private String dni;
    private String ocupaion;
    private Test test;

    private Integer temp;

    public Persona() {
    }

    public Persona(String nombre, String edad, String barrio, String dni, String ocupaion) {
        this.nombre = nombre;
        this.edad = edad;
        this.barrio = barrio;
        this.dni = dni;
        this.ocupaion = ocupaion;
        this.test = new Test();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getOcupaion() {
        return ocupaion;
    }

    public void setOcupaion(String ocupaion) {
        this.ocupaion = ocupaion;
    }

    public Test getTest() {
        return test;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", barrio='" + barrio + '\'' +
                ", dni='" + dni + '\'' +
                ", ocupaion='" + ocupaion + '\'' +
                ", nrotest=" + test.getNroKit() +
                '}';
    }
}
