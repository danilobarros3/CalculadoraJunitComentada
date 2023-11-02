
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danilobarros 
 * @since 21/09/2023
 * @version 1.0
 * 
 */


 //Esta classe contém testes automatizados usando o JUnit para as operações de uma calculadora simples.


public class CalculadoraTest {
    private Soma soma = new Soma(); // Instância de objeto para realizar soma
    private Divisao div = new Divisao(); // Instância de objeto para realizar divisão
    private Subtracao subtracao = new Subtracao(); // Instância de objeto para realizar subtração
    private Multiplicacao multiplicacao = new Multiplicacao(); // Instância de objeto para realizar multiplicação

    /**
     * Teste a operação de soma de dois números.
     * @param 2 que é primeiro
     * @param 4 que é segundo
     * @return o resultado da soma
     **/
    @Test
    public void testSomar() {
        int resultado = soma.somar(2, 4);
        assertEquals(6, resultado); 
    }

    /**
     * Teste a operação de subtração de dois números.
     * @param 8 que é primeiro
     * @param 3 que é segundo
     * @return o resultado da subtração
     **/
    @Test
    public void testSubtrair() {
        int resultado = subtracao.sub(8, 3);
        assertEquals(5, resultado); 
    }

    /**
     * Teste a operação de multiplicação de dois números.
     * @param 10 que é primeiro
     * @param 2 que é segundo
     * @return o resultado da multiplicação
     **/
    @Test
    public void testMultiplicar() {
        int resultado = multiplicacao.multi(10, 2);
        assertEquals(20, resultado); 
    }

    /**
     * Teste a operação de divisão de dois números.
     * @param 8 que é primeiro
     * @param 4 que é segundo
     * @return o resultado da divisão
     **/
    @Test
    public void testDividir() {
        int resultado = div.div(8, 4);
        assertEquals(2, resultado);
    }
}
