package org.example.Services;


import org.example.Model.Team;
import org.example.Repository.TeamRepository;
import org.example.Repository.TournamentRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class TeamService {
    public String addTeam(Team team) {
        TeamRepository.teams.put(team.getId(), team);
        return "Team added.";
    }

    public String deleteTeam(String id)
    {
        TeamRepository.teams.remove(id);
        return "Team removed";
    }
    public Collection<Team> getAllTeams() {
        return TeamRepository.teams.values();
    }
}
