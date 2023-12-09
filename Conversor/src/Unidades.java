/**
 * Clase unidades, para transformar distintas unidades de medida.
 */
public class Unidades {
    /**
     * Transforma una medida dada en una unidad, a otra unidad
     * @param medida Medida en formato double
     * @param unidadOriginal Unidad de medida original, unidades admitidas: "metro", "centímetro", "kilómetro", "yarda", "millas" o "pulgadas"
     * @param unidadDestino unidad de medida esperada, unidades admitidas: "metro", "centímetro", "kilómetro", "yarda", "millas" o "pulgadas"
     * @return Medida en formato double ya transformada
     */
    public double ConvertirMedidas(double medida, String unidadOriginal, String unidadDestino) {
        /* Transformar la unidad original a metros */
        medida = metrosAX(medida, unidadOriginal);


        /* Transformar medida en metros a la unidad destino */
        switch (unidadDestino) {
            case "metros" -> {return medida;}
            case "centimetros" -> medida = medida * 100;
            case "kilometros" -> medida = medida / 1000;
            case "yardas" -> medida = medida / 0.9144;
            case "millas" -> medida = medida / 1609.34;
            case "pulgadas" -> medida = medida / 0.0254;
            default ->//Lanzar error para que el programador corrija el parámetro
                    throw new IllegalArgumentException("Unidad de destino no admitida. Solo usar \"metros\", \"centimetros\", \"kilometros\", \"yardas\", \"millas\" o \"pulgadas\"");
        }

        /* Retornar valor ya transformado */
        return medida;
    }

    private static double metrosAX(double medida, String unidadOriginal){
        switch (unidadOriginal) {
            case "metros" -> {}
            case "centimetros" -> medida = medida / 100;
            case "kilometros" -> medida = medida * 1000;
            case "yardas" -> medida = medida * 0.9144;
            case "millas" -> medida = medida * 1609.34;
            case "pulgadas" -> medida = medida * 0.0254;
            default ->//Lanzar error para que el programador corrija el parámetro
                    throw new IllegalArgumentException("Unidad de origen no admitida. Solo usar \"metros\", \"centimetros\", \"kilometros\", \"yardas\", \"millas\" o \"pulgadas\"");
        }
        return medida;
    }
}

