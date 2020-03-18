package wat.edu.pl.herokuservervisitapp.service;


import wat.edu.pl.herokuservervisitapp.dto.User;
import wat.edu.pl.herokuservervisitapp.dto.UserCreds;

public interface UserService
{
    boolean checkRightToBook(String spec);
    boolean changeEmail(UserCreds userCreds);
    boolean changePassword(UserCreds userCreds);
    boolean changeNumber(UserCreds userCreds);
    User login(UserCreds userCreds);
    boolean register(UserCreds userCreds);
}
