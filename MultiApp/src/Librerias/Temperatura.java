package Librerias;

import java.util.Objects;

public class Temperatura {
    /**
     * Transformar
     * @param temperatura  en unidad original
     * @param unidadEntrada La unidad original del número
     * @param unidadSalida unidad de salida deseada
     * @return Numero transformado
     */
    public  double convertirTemperatura(double temperatura, String unidadEntrada, String unidadSalida) {
        switch (unidadEntrada) {
            case "C":
                switch (unidadSalida) {
                    case "C":
                        return temperatura;
                    case "K"://Transformar de C a K
                        return temperatura + 273.15;
                    case "F"://Transformar de C a F
                        return (temperatura * 9 / 5) + 32;
                    default: //Lanzar error para que el programador corrija el parámetro
                        throw new IllegalArgumentException("Unidad de temperatura no admitida, usa \"C\", \"K\" o \"f\"");
                }
            case "K":
                switch (unidadSalida) {
                    case "K":
                        return temperatura;
                    case "C"://Transformar de K a C
                        return temperatura - 273.15;
                    case "F"://Transformar de K a F
                        return ((temperatura - 273.15) * 9 / 5) + 32;
                    default://Lanzar error para que el programador corrija el parámetro
                        throw new IllegalArgumentException("Unidad de temperatura no admitida, usa \"C\", \"K\" o \"f\"");
                }
            case "F":
                switch (unidadSalida) {
                    case "F":
                        return temperatura;
                    case "C"://transformar de F a C
                        return (temperatura - 32) * 5 / 9;
                    case "K"://Transformar de F a K
                        return ((temperatura - 32) * 5 / 9) + 273.15;
                    default://Lanzar error para que el programador corrija el parámetro
                        throw new IllegalArgumentException("Unidad de temperatura no admitida, usa \"C\", \"K\" o \"f\"");
                }
            default://Lanzar error para que el programador corrija el parámetro
                throw new IllegalArgumentException("Unidad de temperatura no admitida, usa \"C\", \"K\" o \"f\"");
        }
    }
}
