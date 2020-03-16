package wat.edu.pl.herokuservervisitapp.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Prescription implements Serializable
{
    private int prescriptionId;
    private String prescriptionNo;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date issuedDate;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date expirationDate;
    private String issuedCity;
    private Doctor issuedByDoctor;
    private User issuedToUser;
    private List<Medicine> medicine;
    private String extraInfo;


}
