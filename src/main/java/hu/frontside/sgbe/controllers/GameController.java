package hu.frontside.sgbe.controllers;

import hu.frontside.sgbe.interfaces.IGameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class GameController {

    private final IGameService gameService;

    @GetMapping("/random")
    public List<Integer> getRandomNumbers() {
        return gameService.getRandomNumbers();
    }
}
