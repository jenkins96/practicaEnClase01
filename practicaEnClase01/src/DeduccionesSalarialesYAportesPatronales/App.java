package DeduccionesSalarialesYAportesPatronales;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    // Constantes
    static final double APORTE_OBRERO_PORCENTAJE=0.05, APORTE_SOLIDARISTA_PATRONAL_PORCENTAJE=0.0533, SEM_APORTE_PATRON_PORCENTAJE=0.0925, SEM_DEDUCCION_TRABAJADOR_PORCENTAJE=0.055, IVM_APORTE_PATRON_PORCENTAJE=0.0542, IVM_DEDUCCION_TRABAJADOR_PORCENTAJE=0.0417;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args)
    {
        // Inicializando Scanner para leer y almacenar input
        // Definiendo simbolo de  colon en su formato Unicode
        Scanner myScanner = new Scanner(System.in);
        String crc = "\u20a1";
        
        String nombre, apellido, cedula;
        double salarioBrutoMensual;
        
        // Solicitando input al usuario para asignar en variables.
        System.out.println("Ingrese su nombre (unicamente su primer nombre)");
        nombre = myScanner.next();
        System.out.println("Ingrese su primer apellido: ");
        apellido = myScanner.next();
        System.out.println("Ingrese su numero de cedula, sin espacios");
        cedula = myScanner.next();
        System.out.println("Ingrese su salario bruto mensual:");
        salarioBrutoMensual = myScanner.nextDouble();

        // Una vez asignado "salarioBrutoMensual", podemos realizar el restante de declaraciones y asignaciones.
        double montoDeduccionTrabajadorSEM = salarioBrutoMensual * SEM_DEDUCCION_TRABAJADOR_PORCENTAJE;
        double montoDeduccionTrabajadorIVM = salarioBrutoMensual * IVM_DEDUCCION_TRABAJADOR_PORCENTAJE;
        double totalDeduccionesCCSS = montoDeduccionTrabajadorSEM + montoDeduccionTrabajadorIVM;
        double montoDeduccionSolidarista = salarioBrutoMensual * APORTE_OBRERO_PORCENTAJE;
        double totalDeduccionesTrabajador = totalDeduccionesCCSS + montoDeduccionSolidarista;
        double salarioNeto = salarioBrutoMensual - totalDeduccionesTrabajador;
        double montoAportePatronoSEM = salarioBrutoMensual * SEM_APORTE_PATRON_PORCENTAJE; 
        double montoAportePatronoIVM = salarioBrutoMensual * IVM_APORTE_PATRON_PORCENTAJE;
        double totalAporteCCSS = montoAportePatronoSEM + montoAportePatronoIVM;
        double montoAportePatronoSolidarista = salarioBrutoMensual * APORTE_SOLIDARISTA_PATRONAL_PORCENTAJE;
        double totalAportesPatrono = totalAporteCCSS + montoAportePatronoSolidarista;

        // Imprimiendo detalles de la boleta por parte del trabajador
        System.out.println("===== INICIO BOLETA TRABAJADOR =====");
        System.out.println("Su nombre completo es: " + nombre + " " + apellido);
        System.out.println("Cedula: " + cedula);
        System.out.println("Monto salario bruto mensual: " + crc + df.format(salarioBrutoMensual));
        System.out.println("Monto deduccion por concepto de SEM: " + crc + df.format(montoDeduccionTrabajadorSEM));
        System.out.println("Monto deduccion por conepto de IVM: " + crc + df.format(montoDeduccionTrabajadorIVM));
        System.out.println("Total de deducciones de la CCSS: " + crc + df.format(totalDeduccionesCCSS));
        System.out.println("Deduccion de la Asociacion Solidarista: " + crc + df.format(montoDeduccionSolidarista));
        System.out.println("Total de deducciones: " + crc + df.format(totalDeduccionesTrabajador));
        System.out.println("Salario Neto: " + crc + df.format(salarioNeto));
        System.out.println("===== FIN BOLETA TRABAJADOR =====");
        System.out.println("");

        // Imprimiendo detalles de la boleta por parte del patrono.
        System.out.println("===== INICIO BOLETA PATRONO =====");
        System.out.println("Monto del aporte por concepto de SEM: " + crc + df.format(montoAportePatronoSEM));
        System.out.println("Monto el aporte por concepto de IVM: " + crc + df.format(montoAportePatronoIVM));
        System.out.println("Total de aportes a la CCSS: " + crc + df.format(totalAporteCCSS));
        System.out.println("Aporte a la Asociacion Solidarista: " + crc + df.format(montoAportePatronoSolidarista));
        System.out.println("Total de Aportes: " + crc + df.format(totalAportesPatrono));
        System.out.println("===== FIN BOLETA PATRONO =====");
        
        myScanner.close();
    }
   
}