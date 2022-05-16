package Clase08;

import javax.swing.JOptionPane;

public class MultMatriz {
    private int matriz[][];

    private int matriz2[][];
     
    private int resultado[][];

    private int fila;
    private int fila2;
  

    private int columna;
    private int columna2;
   

    private int valores;
    private int valores2;


    public MultMatriz()
    {
        
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila para la matriz 1"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna para la matriz 1"));

        this.matriz = new int[fila][columna];

        
        fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila para la matriz 2"));

        columna2  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna para la matriz 2"));

        this.matriz2 = new int[fila2][columna2];

         resultado= new int[fila][columna2];


    }

    public void agregarMatriz1()
    {
        for (int fila=0; fila < this.matriz.length; fila++)
        {
            for (int columna=0; columna < this.matriz[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("valores para la matriz 1"));

                this.matriz[fila][columna] = this.valores;
            }
        }
    }

    public void mostrarMatriz1()
    {
        System.out.println("matriz 1");
        for(int fila=0; fila < this.matriz.length; fila++)
        {
            for(int columna=0; columna < this.matriz[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriz[fila][columna]);
            }
            
            System.out.println();
        }
    }

    public void agregarMatriz2()
    {
        for (int fila2=0; fila2 < this.matriz2.length; fila2++)
        {
            for (int columna2=0; columna2 < this.matriz2[fila2].length; columna2++)
            {
                this.valores2 = Integer.parseInt(JOptionPane.showInputDialog("valores para la matriz 2"));

                this.matriz2[fila2][columna2] = this.valores2;
            }
        }
    }

    public void mostrarMatriz2()
    {
        System.out.println("matriz 2");
        for(int fila2=0; fila2 < this.matriz2.length; fila2++)
        {
            for(int columna2=0; columna2 < this.matriz2[fila2].length; columna2++)
            {
                System.out.printf("%d  ", this.matriz2[fila2][columna2]);
            }

            System.out.println();
        }
    }


public void calcularMulti()
{
    System.out.println("resultado");
    for(int i=0 ; i < fila ; i++)
{
    for (int j=0; j< columna2; j++)
    {
      for(int k=0; k< columna; k++)
      {
        resultado[i][j] += matriz[i][k]*matriz2[k][j];
      }
      System.out.printf("%d  ", resultado[i][j]);
    }
    System.out.println();
  }
 }
 public static void main(String args[])
 {
     MultMatriz matriz1 = new MultMatriz();

     matriz1.agregarMatriz1();

     matriz1.mostrarMatriz1();

     matriz1.agregarMatriz2();

     matriz1.mostrarMatriz2();
     matriz1.calcularMulti();
    }


 }

    