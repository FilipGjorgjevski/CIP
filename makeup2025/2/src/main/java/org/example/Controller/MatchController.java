package org.example.Controller;

import org.example.Model.Match;
import org.example.Model.Team;
import org.example.Services.MatchService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController

public class MatchController {



    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @PostMapping (value = "/tournaments/${id}/matches")
    public String addMatch(@PathVariable String id, @RequestBody Match match) {
        return matchService.addMatch(id, match);
    }

    @GetMapping(value = "/matches")
    public Collection<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    @DeleteMapping(value = "/delete/${id}")
    public String removeMatch(@PathVariable @RequestBody String id)
    {
        return matchService.deleteMatch(id);
    }
}

