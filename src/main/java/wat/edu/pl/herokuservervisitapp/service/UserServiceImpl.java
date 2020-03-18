package wat.edu.pl.herokuservervisitapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wat.edu.pl.herokuservervisitapp.dto.User;
import wat.edu.pl.herokuservervisitapp.dto.UserCreds;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
    private User user;
    private String password;
    private List<String> listOfSpec;

    @Autowired
    public UserServiceImpl() {
        createUser();
    }

    private void createUser()
    {
        user = new User(1, "kowalski@wp.pl", "Jan", "Kowalski", "19800812", 0, "600000000");
        password = "abc1234";
        listOfSpec = new LinkedList<>();
        listOfSpec.add("laryngolog");
        listOfSpec.add("ortopeda");
    }

    @Override
    public boolean checkRightToBook(String selectedDoctorSpec) {
        if(listOfSpec.contains(selectedDoctorSpec))
            return true;
        else
            return false;
    }

    @Override
    public boolean changeEmail(UserCreds userCreds)
    {
        if(userCreds.getOldEmail().equals(user.getEmail()))
        {
            user.setEmail(userCreds.getEmail());
            return true;
        }
        return false;
    }

    @Override
    public boolean changePassword(UserCreds userCreds) {
        if(userCreds.getOldPassword().equals(password))
        {
            password = userCreds.getPassword();
            return true;
        }
        return false;
    }

    @Override
    public boolean changeNumber(UserCreds userCreds) {
        user.setPhoneNumber(userCreds.getPhoneNumber());
        return true;
    }

    @Override
    public User login(UserCreds userCreds) {
        if (userCreds.getEmail().equals("kowalski@wp.pl") && userCreds.getPassword().equals("abc1234"))
        {
            return this.user;
        }
        else
            return null;
    }

    @Override
    public boolean register(UserCreds userCreds)
    {
        return userCreds.getEmail().equals(user.getEmail()) && userCreds.getPassword().equals("abc1234");
    }
}