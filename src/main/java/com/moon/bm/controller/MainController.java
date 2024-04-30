package com.moon.bm.controller;

import com.moon.bm.dto.PlayerInfoDTO;
import com.moon.bm.service.MainService;
import com.moon.bm.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping("/newgame")
    public String newGame(){
        return "newgame";
    }

    @GetMapping("/playermanagement")
    public String playerManagement(){

        return "playermanagement";
    }

    @PostMapping("/addplayer")
    public String addPlayer(PlayerInfoDTO playerInfoDTO){
        mainService.addPlayer(playerInfoDTO);
        return "playermanagement";
    }
}
