package org.example.Services;

import org.example.Model.Match;

import org.example.Repository.MatchRepo;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MatchService {
    public String addMatch(String id,Match match) {
        MatchRepo.matches.put(id, match);
        return "Match added.";
    }

    public String deleteMatch(String id)
    {
        MatchRepo.matches.remove(id);
        return "Match removed";
    }
    public Collection<Match> getAllMatches() {
        return MatchRepo.matches.values();
    }
}
