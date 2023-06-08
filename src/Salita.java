import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class Salita {
    private Integer cantReactv;
    private ArrayList<Persona> testeados;


    public Salita() {
    }

    public Salita(Integer cantReactv, ArrayList<Persona> testeados) {
        this.cantReactv = cantReactv;
        this.testeados = testeados;
    }

    public Integer getCantReactv() {
        return cantReactv;
    }

    public void setCantReactv(Integer cantReactv) {
        this.cantReactv = cantReactv;
    }

    public ArrayList<Persona> getTesteados() {
        return testeados;
    }

    public void setTesteados(ArrayList<Persona> testeados) {
        this.testeados = testeados;
    }

    @Override
    public String toString() {
        return "Salita{" +
                "cantReactv=" + cantReactv +
                ", testeados=" + testeados +
                '}';
    }

    public HashMap testear(){
        HashMap hm = new HashMap<>();
        for(Persona p : testeados){
            Test t = new Test(p.getTest().getNroKit(),generarTemp(),p.getDni());
            hm.put(t.getNroKit(),t);
        }
        return hm;
    }

    public Double generarTemp(){
        Random ran = new Random();
        return ran.nextDouble(36,39.1);
    }

    public void aislar(HashMap hm) throws Aislamiento {




        hm.forEach((key,value)->{
            Test t = (Test) value;
            try{
            if(t.getTemp()>=38){

                for (Persona p: testeados) {
                    if(t.getDni().compareTo(p.getDni())==0){
                        throw new Aislamiento(t.getNroKit(),p.getBarrio());
                    }
                }
                }
            }
                catch(Aislamiento a){
                try{
                System.out.println("Quien se tiene que aislar es" + a.getNroKit());
                BufferedWriter writer=new BufferedWriter(new FileWriter(new File("ugente.dat")));
                writer.write(a.toString());
                }
                catch (IOException e){}
                }



        });
    }
}
