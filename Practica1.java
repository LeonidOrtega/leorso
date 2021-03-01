package pruebas;

import java.util.Scanner;

public class PruebaPracticaUno {

    public static void main(String[] args) {
       
        System.out.println("###############################################");
        System.out.println("           ELIJA UNA PREGUNTA");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pregunta 1 --> ingrese 1 ");
        System.out.println("Pregunta 2 --> ingrese 2 ");
        System.out.println("Pregunta 3 --> ingrese 3 ");
        System.out.println("###############################################");
        int r = teclado.nextInt(); 
        switch(r){
            case 1:
                //Pregunta 1
                System.out.println("Ingrese valor de a :");
                int a = teclado.nextInt();
                System.out.println("Ingrese valor de b :");
                int b = teclado.nextInt();
                System.out.println("Ingrese valor de c :");
                int c = teclado.nextInt();                
                int l = (int) Math.pow(b, 2);   //b^2 b al cuadrado
                int e = 4*a*c;                  
                int o = (int)Math.sqrt(l-e);    //raiz cuadrada
                System.out.println(" Las raices son las siguientes : ");
                float x1= (-b+o)/2*a;
                float x2= (-b-o)/2*a;
                System.out.println(" x1 ="+x1);
                System.out.println(" x1 ="+x2);                
                break;
            case 2:
                //pregunta 2
                System.out.println("Ingrese el nro n de la Serie > 0 :");
                int n = teclado.nextInt();
                int s;
                 for (int i=1; i<=n; i++)
                 {
                     s = 7*i;
                     System.out.print(" "+s);
                                                  
                 }
                 System.out.println(" ");
                 break;
            case 3:
                //pregunta 3
                System.out.println("Ingrese el numero de personas a ingresar :");
                int m = teclado.nextInt();
                String nombre[] = new String[m];//String[m];
                int edad []= new int[m];
                for (int i=0; i<m; i++)
                {
                    System.out.println("Ingrese el Nombre : ");
                    String name= teclado.next();
                    nombre[i] = name;
                    System.out.println("Ingrese la Edad : ");
                    int age= teclado.nextInt();
                    edad[i] = age;
                }                
                System.out.println("Los Datos de las Personas son los sgtes. :");
                System.out.println("###############################################");
                System.out.println("   NOMBRE   "+"   "+"   EDAD   ");
                System.out.println("###############################################");
                for(int j=0; j<m; j++)
                {
                    System.out.println(nombre[j]+"     "+edad[j]);
                    
                }
                System.out.println("###############################################");
                int prom=0;                
                for(int k=0; k<m; k++)             
                {
                    prom = prom + edad[k];                    
                }
                int promedio = prom/m;
                System.out.println("El promedio de edad es :"+promedio);
                System.out.println("###############################################");
                int menor=edad[0]; 
                String menorEdad= nombre[0];
                for(int u=1;u<m;u++)
                {
                    if(edad[u]<menor)
                    {
                        menor = edad[u];
                        menorEdad=nombre[u];
                    }
                }
                System.out.println("La persona de menor edad es :"+menorEdad);
                System.out.println("###############################################");
                System.out.println("las personas mayores de edad son :");
                for(int t=0; t<m; t++)
                {
                    if(edad[t]>18)
                    {
                        System.out.println(nombre[t]);
                    }    
                }
                System.out.println("###############################################");
                break;
                
                 }//fin switch 
        }
    }
    

