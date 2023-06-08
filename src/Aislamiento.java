public class Aislamiento extends Exception{
    private Integer nroKit;
    private String barrio;

    public  Aislamiento (Integer nroKit, String barrio){
        this.barrio = barrio;
        this.nroKit = nroKit;
    }

    public Integer getNroKit() {
        return nroKit;
    }

    public String getBarrio() {
        return barrio;
    }
}
