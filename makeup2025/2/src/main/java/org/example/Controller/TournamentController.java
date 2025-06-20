package org.example.Controller;

import org.example.Model.Tournament;
import org.example.Services.TournamentService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController

public class TournamentController {



    private final TournamentService tournamentService;

    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @PostMapping(value = "/addTournament")
    public String addTournament(@RequestBody Tournament tournament) {
        return tournamentService.addTournament(tournament);
    }

    @GetMapping(value="/tournaments")
    public Collection<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @DeleteMapping(value = "/delete/${id}")
    public String removeTournament(@PathVariable String id)
    {
        return tournamentService.deleteTournament(id);
    }


}

