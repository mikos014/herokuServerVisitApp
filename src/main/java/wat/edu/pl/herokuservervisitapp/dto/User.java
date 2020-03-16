package wat.edu.pl.herokuservervisitapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User implements Serializable
{
    private int userId;
    private String email;
    private String name;
    private String surname;
    private String dateOfBirth;
    private int sex;
    private String phoneNumber;

}
