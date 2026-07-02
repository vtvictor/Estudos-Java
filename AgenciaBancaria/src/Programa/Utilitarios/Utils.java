package Programa.Utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * { - classe de exemplo.
 */

/**
 * { - classe de exemplo.
 */

public class Utils {

    static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00");
    public static String doubleToString(Double valor){
        return formatandoValores.format(valor);
    }

}
