package com.example.course1608.controller;

import com.example.course1608.exception.AlreadyUsedLetterException;
import com.example.course1608.model.Game;
import com.example.course1608.model.TryResponse;
import com.example.course1608.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("games")
public class GameController {
    private final GameService gameService;

    @PostMapping("{hiddenWord}")
    public Game createRoom(@PathVariable String hiddenWord) {
        return gameService.createRoom(hiddenWord);
    }

    @PostMapping("{roomId}/{guess}")
    public TryResponse guessWord(@PathVariable String roomId, @PathVariable String guess) throws AlreadyUsedLetterException {
        return gameService.guessWord(roomId, guess);
    }
}
