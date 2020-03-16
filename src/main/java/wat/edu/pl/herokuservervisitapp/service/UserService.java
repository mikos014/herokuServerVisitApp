package wat.edu.pl.herokuservervisitapp.service;


import wat.edu.pl.herokuservervisitapp.dto.User;
import wat.edu.pl.herokuservervisitapp.dto.UserCreds;

public interface UserService
{
    Boolean checkRightToBook(int visitId);
    boolean changeEmail(UserCreds userCreds);
    boolean changePassword(UserCreds userCreds);
    boolean changeNumber(UserCreds userCreds);
    User login(UserCreds userCreds);
    boolean register(UserCreds userCreds);
}
