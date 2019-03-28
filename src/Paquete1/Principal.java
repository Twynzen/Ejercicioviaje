/*
Un ciclista parte de una ciudad A a las hh horas, mm minutos y ss segundos. 
El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. Imprimir en pantalla 
la hora de llegada a la ciudad B
*/
package Paquete1;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String ciclista;
        String ciudad1,ciudad2;
        float hh,mm,ss,timeSegundos,horas=3600,minutos=60,segundos=1,horatotal,minutototal,segundototal,horaFin,segundoFin,minutoFin;
        
        System.out.print("Digite el nombre del ciclista: ");
        ciclista = entrada.next();
        System.out.print("Digite el nombre de la ciudad A: ");
        ciudad1 = entrada.next();
        System.out.println("Porfavor digite la hora en que salio "+ciclista+" de "+ciudad1+"");
        System.out.print("Hora:");
        hh= entrada.nextFloat();
        System.out.print("Minuto:");
        mm= entrada.nextFloat();
        System.out.print("segundo:");
        ss= entrada.nextFloat();
        
        
        
        System.out.print("Digite el nombre de la ciudad B: ");
        ciudad2 = entrada.next();
        System.out.println("Digite el tiempo en segundos necesario para llegar a "+ciudad2+":");
        timeSegundos = entrada.nextFloat();
        
        //horas
        horatotal = timeSegundos/horas;
        horaFin = horatotal+hh; 
        //minutos
        minutototal = timeSegundos/minutos;
        minutoFin = minutototal+mm;
        //segundos
        segundototal = timeSegundos%minutototal;
        segundoFin = segundototal+ss; 
        
        if(segundoFin>=60){
            minutoFin++;
        }
        if(minutoFin>=60){
            horaFin++;
        }
        
        
        
        System.out.println("la hora de llegada a la ciudad "+ciudad2+" es de: ");
        System.out.print("Hora: "+horaFin);
        System.out.print("Minuto: "+minutoFin);
        System.out.print("Segundo: "+segundoFin);
        
        
    }
}
