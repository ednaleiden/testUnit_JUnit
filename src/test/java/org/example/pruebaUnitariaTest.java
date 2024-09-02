package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


///para no repetir el mismo objeto
public class pruebaUnitariaTest {

    private PruebaUnitaria pruebaUnitaria;

    //se  ejecuta una vez por cada test
    @BeforeEach
    public void init() {
        pruebaUnitaria = new PruebaUnitaria();
    }

    //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo


    //WHEN - cuando  --- se ejecuta el metodo


    //THEN -- entonces --evaluar los resultados
    @Test
    public  void  testSumar(){
        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo

        int a = 5;
        int b = 2;


        //WHEN - cuando  --- se ejecuta el metodo
        int resultado = pruebaUnitaria.sumar(a,b);


        //THEN -- entonces --evaluar los resultados
        Assertions.assertEquals(7,resultado);
        Assertions.assertInstanceOf(Integer.class, resultado);


    }

    @Test
    public void testCheckPositivos() {

        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo

        int numero = 2;

        //WHEN - cuando  --- se ejecuta el metodo
        boolean result = pruebaUnitaria.checkPositivo(numero);

        //THEN -- entonces --evaluar los resultados
        Assertions.assertTrue(result);
        //Assertions.assertInstanceOf(boolean.class, result);

        ///siempre tenemos branches cuando tenemos condicionales
    }

    @Test
    public void testCheckNegativo(){

        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo

        int numero = -1;

        //THEN -- entonces --evaluar los resultados
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            pruebaUnitaria.checkPositivo(numero);
        });
        //Assertions.assertInstanceOf(boolean.class, result);

        ///siempre tenemos branches cuando tenemos condicionales

    }

    @Test
    public void testContarLetrasA(){

        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo

        String cadena = "pruebas";

        //WHEN - cuando  --- se ejecuta el metodo
        int result = pruebaUnitaria.contarLetrasA(cadena);

        //THEN -- entonces --evaluar los resultados
        Assertions.assertEquals(1,result);
        Assertions.assertNotNull(result);
    }

    @Test

    public void testContieneElemento() {
        // GIVEN
        List<String> lista = List.of("a", "b", "c", "d", "e", "f");
        String elemento = "a";

        // WHEN
        boolean result = pruebaUnitaria.contieneElemento(lista, elemento);

        // THEN
        Assertions.assertTrue(result);
    }


    @Test
    public void testRevertirCadena(){
        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo
        String cadena = "carro";

        //WHEN - cuando  --- se ejecuta el metodo
       String result =  pruebaUnitaria.revertirCadena(cadena);


        //THEN -- entonces --evaluar los resultados
        Assertions.assertEquals("orrac",result);
    }

    @Test
    public void testFactorial(){
        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo
        int numero = 6;

        //WHEN - cuando  --- se ejecuta el metodo
        Long result  =  pruebaUnitaria.factorial(numero);

        //THEN -- entonces --evaluar los resultados
        Assertions.assertEquals(720,result);
    }

    @Test
    public void testFactorialMenosACero() {
        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo
        int numero = -1;


        //THEN -- entonces --evaluar los resultados
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            pruebaUnitaria.factorial(numero);
        });
    }

    @Test
    public void testEsPrimo(){
        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo
        int numero = 3;

        //WHEN - cuando  --- se ejecuta el metodo
        boolean result = pruebaUnitaria.esPrimo(numero);

        //THEN -- entonces --evaluar los resultados
        Assertions.assertTrue(result);
    }

    @Test
    public void testesMenorAUno(){
        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo
        int number = 1;

        //WHEN - cuando  --- se ejecuta el metodo
        boolean  result = pruebaUnitaria.esPrimo(number);

        //THEN -- entonces --evaluar los resultados
        Assertions.assertFalse(result);
    }


    @Test
    public void testNoEsPrimo(){
        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo
        int number = 8;

        //WHEN - cuando  --- se ejecuta el metodo
        boolean  result = pruebaUnitaria.esPrimo(number);

        //THEN -- entonces --evaluar los resultados
        Assertions.assertFalse(result);
    }


    @Test
    public void testMnesajeConRetraso() throws InterruptedException {
        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo
        //vacio por que no tengo nada para pasar en el metodo

        //WHEN - cuando  --- se ejecuta el metodo
       String result =  pruebaUnitaria.mensajeConRetraso();


        //THEN -- entonces --evaluar los resultados
        Assertions.assertEquals("Listo después de retraso",result);
    }

    @Test
    public void testConvertirAString(){
        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo
        List<Integer> lista = List.of(1,2,3);

        //WHEN - cuando  --- se ejecuta el metodo
        List<String> result = pruebaUnitaria.convertirAString(lista);

        //THEN -- entonces --evaluar los resultados
        Assertions.assertEquals(List.of("1", "2", "3"), result);
    }

    @Test
    public void testConvertirListaAString(){
        //GIVEN -teniendo ----ponemos todos los insumos o parametros que necesitamos para ejecutar nuestro metodo
        List<String> lista = Arrays.asList("manzana", "banana", "cereza");

        //WHEN - cuando  --- se ejecuta el metodo
        String resultado = pruebaUnitaria.convertirListaAString(lista);;

        //THEN -- entonces --evaluar los resultados
        Assertions.assertEquals("MANZANA,BANANA,CEREZA", resultado);

    }
    @Test
    public void testCalcularMedia() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3);

        // When
        double result = pruebaUnitaria.calcularMedia(numbers);

        // Then
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testCalcularMediaNull() {
        // Given
        List<Integer> numbers = null;

        // When - Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            pruebaUnitaria.calcularMedia(numbers);
        });
    }

    @Test
    public void testCalcularMediaEmpty() {
        // Given
        List<Integer> numbers = Collections.emptyList();

        // When - Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            pruebaUnitaria.calcularMedia(numbers);
        });
    }

}
