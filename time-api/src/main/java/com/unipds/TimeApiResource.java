package com.unipds;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Path("/time-api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TimeApiResource {

    @GET
    public String getTime() {
        // Formato de data/hora em PT-BR: dd/MM/yyyy HH:mm:ss
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withLocale(Locale.forLanguageTag("pt-BR"));
        return LocalDateTime.now().format(formatter) + "\n";
    }
}
