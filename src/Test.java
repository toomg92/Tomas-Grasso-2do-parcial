import java.util.Random;

public class Test {
    private Integer nroKit;
    private Double temp;
    private String dni;

    public Test() {
        this.nroKit = generarNroKit();
    }

    public Test(Integer nroKit, Double temp, String dni) {
        this.nroKit = nroKit;
        this.temp = temp;
        this.dni = dni;
    }

    public Integer generarNroKit(){
        Random ran = new Random();
        return ran.nextInt(999999);
    }

    public Integer getNroKit() {
        return nroKit;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Test{" +
                "nroKit=" + nroKit +
                ", temp=" + temp +
                ", dni='" + dni + '\'' +
                '}';
    }
}
