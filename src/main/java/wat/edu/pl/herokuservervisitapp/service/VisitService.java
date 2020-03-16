package wat.edu.pl.herokuservervisitapp.service;


import wat.edu.pl.herokuservervisitapp.dto.Visit;

import java.util.HashMap;
import java.util.List;

public interface VisitService
{
    HashMap getDatesOfVisits(int visitId);
    boolean addOpinion(int visitId, int userId, int numberOfStars);
    List<Visit> getHistoryList(int userId);
    List<Visit> getCurrentVisitList(int userId);
    List<Visit> getVisitsLimitByQuery(String query);
    List<Visit> getVisits();
    boolean cancelTheVisit(int visitId, int userId);
    boolean bookTheVisit(Visit visit);
}