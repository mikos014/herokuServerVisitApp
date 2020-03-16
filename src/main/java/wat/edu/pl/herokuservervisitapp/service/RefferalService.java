package wat.edu.pl.herokuservervisitapp.service;


import wat.edu.pl.herokuservervisitapp.dto.Refferal;

import java.util.List;

public interface RefferalService
{
    List<Refferal> getRefferalList(int userId);
}
