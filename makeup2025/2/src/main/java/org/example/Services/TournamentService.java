package org.example.Services;


import org.example.Model.Tournament;
import org.example.Repository.TournamentRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class TournamentService {
    public String addTournament(Tournament tournament) {
        TournamentRepository.tournaments.put(tournament.getId(), tournament);
        return "Tournament added.";
    }

    public Collection<Tournament> getAllTournaments() {
        return TournamentRepository.tournaments.values();
    }

    public String deleteTournament(String id)
    {
        TournamentRepository.tournaments.remove(id);
        return "Tournament removed";
    }
}
