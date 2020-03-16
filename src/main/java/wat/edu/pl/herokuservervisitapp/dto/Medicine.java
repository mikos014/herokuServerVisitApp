package wat.edu.pl.herokuservervisitapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Medicine implements Serializable
{
    private int medicineId;
    private String name;
    private String form;
    private String dosage;
    private String methodOfDosage;

}
