package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class registerDataValidation {

    public String ensureFechaCreacion(String data) {

        if (data == null) {
            throw new IllegalArgumentException("Fecha de creación no puede ser nula");
        } else {
            if(!data.contains("\"FECHA_CREACION\"")){
                LocalDate currentDate = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String formattedDate = currentDate.format(formatter);

                int insertIndex = data.indexOf("\t\"INSTITUCION\": \"") + "\t\"INSTITUCION\": \"".length();
                insertIndex = data.indexOf("\n", insertIndex) + 1;

                StringBuilder sb = new StringBuilder(data);
                sb.insert(insertIndex, "\t\"FECHA_CREACION\": \"" + formattedDate + "\"\n");

                return sb.toString();
            }
        }
        return data;
    }
}
