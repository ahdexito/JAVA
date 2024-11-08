package prog01_ejer03;

public class PROG01_Ejer03 
{
     /*
     Nombre de clase: PROG01_Ejer03
     Autor: Ángel García Smakula        
     */
     
     public static void main(String[] args) 
     {
	  /*
	  Realizar las siguientes modificaciones en el programa anterior:
	  
	  1. Añadir comentarios:
	  • Nombre de clase y autor empleando el comentario multilínea.
	  • Para cada variable declarada, explicar su elección.
	  
	  2. Utilizar el operador de asignación para inicializar las variables del ejercicio 2 con los
	  siguientes valores:
	  
	  1. true
	  2. 999999
	  3. 1
	  4. 300
	  5. 1298332800000
	  6. 10350.67734147648
	  7. 6775235741
	  8. M
	  
	  3. Mostrar el siguiente resultado empleando las variables anteriores:
	  Nota: Utilizar la secuencia de escape correspondiente para generar un tabulador al
	  principio de cada línea salvo de la primera.
	  -  Usando sólo la orden printf: 
	  */
	  
	  
	  
	  //1. Si un empleado está casado o no.
	  
          boolean casado = true;
	  // Es una condición limitada a verdadero o falso.
		    
	       
	  //2. Valor máximo no modificable: 999999.
	  
	       final int maximo = 999999;
	       // Con "final" ese valor no puede ser alterado. 
	  
	       
	  //3. Día de la semana.
	       
	       byte dia_semana = 1;
	       // Es el tipo de dato más pequeño, nos sirve para representar los días hasta 127.
	  
	       
	  //4. Día del año.
	  
	       short dia_anyo = 300;
	       /* Con una variable tipo byte, 127 se queda corto, para llegar
	       hasta 366 lo siguiente es un short, que llega hasta 32767.
	       */
	       
	       
	  //5. Sexo: con dos valores posibles 'V' o 'M'
	  
	       char sexo = 'M';
	       // Para almacenar un solo caracter es la mejor opción.
	  
	       
	  //6. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
	  
	       long milisegundos = 1298332800000l;
	       /* 
	       Han transcurrido aproximadamente 1,7 billones de milisegundos, 
	       por lo cual la variable más adecuada sería un de tipo long.
	       */
	       
	       
	  //7. Almacenar el total de una factura.
	  
	       float factura = 10350.67734147648f;
	       // La variable más simple para almacenar números decimales.
	       
	       
	  //8. Población mundial del planeta tierra.
	  
	       long poblacion = 6775235741l;
	       /*
	       Aproximadamente 8 mil millones, con una varible tipo int nos quedamos cortos (aprox 2,1 millones), 
	       por eso de nuevo usamos un long.
	       */
	  System.out.printf("EJERCICIO 03 \n");
	       
	  System.out.printf("\t 1. El valor de la variable casado es igual a %s \n", casado);
	  
	  System.out.printf("\t 2. El valor de la variable maximo es igual a %d \n", maximo);
	  
	  System.out.printf("\t 3. El valor de la variable dia_semana es igual a %d \n", dia_semana);
	  
	  System.out.printf("\t 4. El valor de la variable dia_anyo es igual a %d \n", dia_anyo);
	  
	  System.out.printf("\t 5. El valor de la variable sexo es igual a %c \n", sexo);
	  
	  System.out.printf("\t 6. El valor de la variable milisegundos es igual a %d \n", milisegundos);
	  
	  System.out.printf("\t 7. El valor de la variable factura es igual a %f \n", factura);
	  
	  System.out.printf("\t 8. El valor de la variable factura en notación científica es igual a %e \n", factura);
	  
	  System.out.printf("\t 9. El valor de la variable poblacion es igual a %d \n", poblacion);
	  
     }
     
}
