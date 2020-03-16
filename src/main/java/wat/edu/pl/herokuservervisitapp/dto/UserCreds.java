package wat.edu.pl.herokuservervisitapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserCreds
{
    private String oldEmail;
    private String email;
    private String oldPassword;
    private String password;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String phoneNumber;
    private int sex;
}
