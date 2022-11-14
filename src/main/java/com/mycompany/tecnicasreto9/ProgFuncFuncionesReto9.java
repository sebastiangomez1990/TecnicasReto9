package com.mycompany.tecnicasreto9;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Usuario
 */
public interface ProgFuncFuncionesReto9 {
    /*Recibimos una lista de doubles y retornamos la raíz cuadrada de cada elemento*/
    public static List<Double> raizCuadrada(List<Double> listaNDoubles) {

        return listaNDoubles.stream().map(x -> Math.sqrt(x)).collect(Collectors.toList());

    }
    
    /*Recibimos una lista de strings y retornamos la lista de los elementos de más de 5 caracteres*/
    public static List<String> mayorACincoCaracteres(Set<String> listaCadenas) {

        return listaCadenas.stream().filter(c -> c.length() > 5).collect(Collectors.toList());
    }
}
