import java.lang.reflect.MalformedParameterizedTypeException;

import javax.swing.JOptionPane;

public class Matriz
{

    private int matriz1[][];

    private int matriz2[][];

    private int matriz3[][];

    private int fila;

    private int columna;

    private int valores;

    public Matriz()
    {
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar fila"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingresar columna"));

        this.matriz1 = new int [fila][columna];

        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar fila"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingresar columna"));

        this.matriz2 = new int [fila][columna];
    }

    public void agregarMatriz1()
    {
        for (int fila=0; fila < this.matriz1.length; fila++)
        {
            for (int columna=0; columna < this.matriz1[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("Ingresar valores"));

                this.matriz1[fila][columna] = this.valores;
            }
            System.out.println();
        }

        for (int fila=0; fila < this.matriz2.length; fila++)
        {
            for (int columna=0; columna < this.matriz2[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("Ingresar valores"));

                this.matriz2[fila][columna] = this.valores;
            }
            System.out.println();
        }
    }

    public void mostrarMatriz2()
    {
        for (int fila=0; fila < this.matriz1.length; fila++)
        {
            for (int columna=0; columna < this.matriz1[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriz1[fila][columna]);
            }
            System.out.println();
        }

        for (int fila=0; fila < this.matriz2.length; fila++)
        {
            for (int columna=0; columna < this.matriz2[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriz2[fila][columna]);
            }
            System.out.println();
        }
    }

    public void sumarMatriz3()
    {
        for (int fila=0; fila<matriz2.length; fila++) 
        {
            for (int columna=0; columna<matriz2[0].length; columna++) 
            {
                matriz3[fila][columna] = matriz1[fila][columna] + matriz2[fila][columna];
            }
        }
    }

    public void mostarMatriz3()
    {
        for (int fila=0; fila<matriz2.length; fila++) 
        {
            for (int columna=0; columna<matriz2[0].length; columna++) 
            {
                System.out.print(" " + matriz3[fila][columna]  + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Matriz matriz = new Matriz();

        matriz.agregarMatriz1();

        matriz.mostrarMatriz2();
    }
}