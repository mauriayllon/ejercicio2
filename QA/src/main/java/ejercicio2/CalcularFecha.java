
package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class CalcularFecha {

    public String calcularFecha(int day, String month, int year, int hour, int min, int sec) {
        String msg = "";
        List<String> months = new ArrayList<>();
        months.add("Enero");
        months.add("Febrero");
        months.add("Marzo");
        months.add("Abril");
        months.add("Mayo");
        months.add("Junio");
        months.add("Julio");
        months.add("Agosto");
        months.add("Septiembre");
        months.add("Octubre");
        months.add("Noviembre");
        months.add("Diciembre");
        if (sec < 0 || sec > 59) {
            msg = "Invalid second";
        } else if (min < 0 || min > 59) {
            msg = "Invalid minute";
        } else if (hour < 0 || hour > 23) {
            msg = "Invalid hour";
        } else if (!months.contains(month)) {
            msg = "Invalid month";
        } else if (year < 0) {
            msg = "Invalid year";
        } else if (sec == 59) {
            msg = day + " " + month + " " + year + " " + hour + ":" + (min + 1) + ":" + 0;
        } else if (hour == 23) {
            msg = day + " " + month + " " + year + " " + (00) + ":" + (00) + ":" + 0;
        } else if(day ==31 && hour ==23 && min==59 && sec==59){
            msg = day + " " + months.get(months.indexOf(month)+1) + " " + year + " " + (00) + ":" + (00) + ":" + 0;
    }
        return msg;

    }
}