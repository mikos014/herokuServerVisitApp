package wat.edu.pl.herokuservervisitapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Doctor implements Serializable
{
    private int doctorId;
    private String name;
    private double rating;
    private String spec;

}
