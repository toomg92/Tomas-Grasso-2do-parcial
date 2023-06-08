import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> pers =new ArrayList<>();
        Persona per1 = new Persona("Tomas Grasso","30","Chauvin","37238132","Estudiante");
        Persona per2 = new Persona("Fulano mengano","25","Las avenidas","123456","Empleado de comercio");
        Persona per3 = new Persona("Pepe","50","Don Bosco","789456","Capataz");
        pers.add(per1);
        pers.add(per2);
        pers.add(per3);
        Salita salaPublica = new Salita(2,pers);
        System.out.println(salaPublica.toString());
        HashMap hm;
        hm = salaPublica.testear();
        System.out.println(hm.entrySet());
        try {
            salaPublica.aislar(hm);
        }
        catch(Aislamiento a){}

        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File("urgente.dat")));
            String linea= null;
            while ((linea = reader.readLine()) !=null)
            { System.out.println(linea);}
        }
        catch (IOException e){

        }
    }
}