public class CrearArchivo {

    public static void main(String[] args) {
    }
    
    String texto = "Felicidad es cuando me levanto y tomo mi taza de café";
    try{
        FileWriter fileWriter = new FileWriter("src/felicidad/lunes.txt");
        fileWriter.write(texto);
        fileWriter.write("\n"+texto);
        fileWriter.close();
        System.out.println("Contenido creado con éxito");


    }
String texto = "Felicidad es cuando me levanto y tomo mi taza de café";
    try{
        FileWriter fileWriter = new FileWriter("src/felicidad/lunes.txt");
        fileWriter.write(texto);
        fileWriter.write("\n"+texto);
        fileWriter.close();
        System.out.println("Contenido creado con éxito");


    }catch (IOException e)
    {
        System.out.println(e);

    }
}
