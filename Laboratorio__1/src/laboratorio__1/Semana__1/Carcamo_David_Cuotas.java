/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio__1.Semana__1;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Carcamo_David_Cuotas {
    public static void main(String[] args){
        //Ingreso de datos referente al prestamo del cliente, los cuales influirán en la cuota
        Scanner IngresoPresta= new Scanner(System.in);
        System.out.println("Ingrese el valor del prestamo otorgado al cliente: ");
        double Prestamo = IngresoPresta.nextDouble();
        
        Scanner IngresoInteres = new Scanner(System.in);
        System.out.println("\n Ingrese el porcentaje de interes que se le aplica al préstamo (En forma no decimal): ");
        int InteresEntero = IngresoInteres.nextInt();
        double InteresDecimal= InteresEntero/100;
        
        Scanner IngresoComi= new Scanner(System.in);
        System.out.println("\n Ingrese el valor de la comisión por cuota aplicada al préstamo: ");
        double Comision= IngresoComi.nextDouble();
        
        Scanner IngresoSeguro = new Scanner(System.in);
        System.out.println("\n Ingrese el porcentaje de seguro aplicado a la cuota (En forma no decimal): ");
        int SeguroEntero= IngresoSeguro.nextInt();
        double SeguroDecimal = SeguroEntero/100;
        
        Scanner IngresoPlazo = new Scanner (System.in);
        System.out.println("\n Ingrese el plazo establecido para pagar el préstamo (en meses): ");
        int Plazo= IngresoPlazo.nextInt();
        
        //Desarrollo de procesos
        
        double Interes= Prestamo*InteresDecimal;
        double Seguro= Prestamo*SeguroDecimal;
        double CuotaPagar= (Prestamo/Plazo) + (Interes+ Seguro + Comision);
        double TotalPagar= CuotaPagar*Plazo;
        
        //Sección de print
        
        System.out.println("\n****CUOTAS MENSUALES****");
        System.out.println("\n Cuota de Pago Mensual: HNL "+CuotaPagar);
        System.out.println("\n Total a Pagar: HNL "+TotalPagar);
        
       
        
        
        
        
    }
}
