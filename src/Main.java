import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {       
    
    HashMap<Integer, ArrayList<String>> map = new HashMap<>();
    public static void main(String[] args) {
        hMap();
        tMap();
        LHMap();
    }
    public static void hMap(){

        HashMap<String, Integer> usuarios = new  HashMap<String, Integer>();

        usuarios.put("Natalia", 42);
        usuarios.put ("Ricardo", 43);
        usuarios.put ("Marta", 21);
        usuarios.put ("Walter", 65);
        usuarios.put ("Nora", 54); 
        usuarios.put ("Marta", 28);   
        System.out.println(usuarios);    
    }

      public static void tMap(){

        TreeMap<String, Integer> usuarios = new  TreeMap<String, Integer>();

        usuarios.put("Natalia", 42);
        usuarios.put ("Ricardo", 43);
        usuarios.put ("Marta", 21);
        usuarios.put ("Walter", 65);
        usuarios.put ("Nora", 54); 
        usuarios.put ("Marta", 28);   
        System.out.println(usuarios);    
    }

    public static void LHMap(){

     LinkedHashMap<String, Integer> usuarios = new  LinkedHashMap<String, Integer>();

        usuarios.put("Natalia", 42);
        usuarios.put ("Ricardo", 43);
        usuarios.put ("Marta", 21);
        usuarios.put ("Walter", 65);
        usuarios.put ("Nora", 54); 
        usuarios.put ("Marta", 28);   
        System.out.println(usuarios); 
        
        

    }
}
