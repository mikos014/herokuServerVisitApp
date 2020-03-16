package wat.edu.pl.herokuservervisitapp.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class Refferal implements Serializable
{
    private int refferalId;
    private String refferalNo;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date issuedDate;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date expirationDate;
    private String issuedCity;
    private Doctor issuedByDoctor;
    private String issuedToDoctor;
    private User issuedToUser;
    private String extraInfo;

}
