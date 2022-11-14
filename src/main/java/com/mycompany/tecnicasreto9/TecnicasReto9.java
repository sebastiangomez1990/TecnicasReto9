package com.mycompany.tecnicasreto9;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @Equipo: John Sebastian Gomez Gonzalez    c.c 1000084363
 *          Sebastian Aristizabal Castañeda  c.c 1000639678
 */
public class TecnicasReto9 {
    
    public static void main(String[] args) throws IOException {
        
        Path rutaOrigen = Paths.get("C:\\Users\\Usuario\\Documents\\Clases 2022-1\\Tecnicas de programación\\Reto 9\\ETH-USD.csv");
        Path rutaDestino = Paths.get("C:\\Users\\Sebastian\\Documents\\Disco duro SSD\\UDEA\\UdeA 2022 1\\Tecnicas de programacion y laboratorio\\Proyectos\\Reto 9\\ArchivoDestino.txt");
        byte[] rutaOrigenArray;
        rutaOrigenArray = Files.readAllBytes(rutaOrigen);
        for (byte b : rutaOrigenArray) {
            System.out.println(b);
        }
        Charset charset = 
        Charset.forName("UTF-8");
        try (BufferedReader reader = Files.newBufferedReader(rutaOrigen, charset)) {
            String line = null;
            while ((line = 
            reader.readLine()) != null) {
            System.out.println(line);
            }
        } catch (IOException x) {
            System.out.println("Error");
        }
        
        
        /*Acá podemos probar el puto 4 del reto - PROGRAMACIÓN FUNCIONAL*/
        /*Entran los valores de los números en la lista*/
        System.out.println("Punto 4 del reto: ");
        List<Double> entradaNumeros = new ArrayList<>();
        entradaNumeros.add(25.0);
        entradaNumeros.add(16.0);
        entradaNumeros.add(16.7);
        System.out.println("Los números ingresados son:");
        entradaNumeros.stream().forEach(numero -> System.out.println(numero));
        System.out.println("");
        
        /*Calculamos la raíz cuadrada de cada número y la devolvemos*/
        List<Double> raizNumeros = ProgFuncFuncionesReto9.raizCuadrada(entradaNumeros);
        System.out.println("La raíz cuadrada de cada número que ingresó es:");
        raizNumeros.stream().forEach(numero -> System.out.println(numero));
        
        System.out.println("-----------------------------------------------------------------");
        
        /*Acá podemos probar el puto 5 del reto - PROGRAMACIÓN FUNCIONAL*/
        /*Entran las cadenas que queremos evaluar*/
        System.out.println("Punto 5 del reto: ");
        Set<String> entradaCadenas = new HashSet<>();
        entradaCadenas.add("sebas");
        entradaCadenas.add("sebastian");
        entradaCadenas.add("tecnicas");
        System.out.println("Las palabras ingresadas son:");
        entradaCadenas.stream().forEach(cadena -> System.out.println(cadena +", # de caracteres: "+ cadena.length()));
        System.out.println("");
        
        /*Evaluamos el largo de cada palabra y devolvemos la lista de las que tengan más de 5 caracteres*/
        List<String> cadenaMayorACinco = ProgFuncFuncionesReto9.mayorACincoCaracteres(entradaCadenas);
        System.out.println("Las palabras que tienen más de 5 caracteres son: ");
        cadenaMayorACinco.stream().forEach(cadena -> System.out.println(cadena +", # de caracteres: "+ cadena.length()));
        
    }
    
}
