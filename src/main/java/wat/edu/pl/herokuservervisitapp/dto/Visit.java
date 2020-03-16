package wat.edu.pl.herokuservervisitapp.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class Visit implements Serializable
{
    private int visitId;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date date;
    private String time;
    private User user;
    private Doctor doctor;
    private double placeLatitude;
    private double placeLongitude;
    private String clinicName;
    private String clinicStreet;
    private String clinicCity;
    private String clinicPhoneNo;
    private boolean hasOpinion;

}
