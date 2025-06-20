package org.example.Controller;

import org.example.Model.Team;
import org.example.Services.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController

public class TeamController {



        private final TeamService teamService;

        public TeamController(TeamService teamService) {
            this.teamService = teamService;
        }

        @PostMapping (value = "/addTeam")
        public String addTeam(@RequestBody Team team) {
            return teamService.addTeam(team);
        }

        @GetMapping(value = "/teams")
        public Collection<Team> getAllTeams() {
            return teamService.getAllTeams();
        }

    @DeleteMapping(value = "/delete/${id}")
    public String removeTeam(@PathVariable String id )
    {
        return teamService.deleteTeam(id);
    }
    }

