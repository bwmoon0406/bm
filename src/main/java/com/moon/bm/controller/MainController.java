package com.moon.bm.controller;

import com.moon.bm.dto.PlayerInfoDTO;
import com.moon.bm.service.MainService;
import com.moon.bm.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping("/newgame")
    public String newGame(){
        return "newgame";
    }

    @GetMapping("/playermanagement")
    public String playerManagement(Model model){
        return "playermanagement";
    }

    @GetMapping("/record")
    public String go_record(Model model){
        List<PlayerInfoDTO> allList = mainService.findAll();
        List<PlayerInfoDTO> top5Point = mainService.findTop5Point();

        for(PlayerInfoDTO playerInfoDTO : allList) {
            mainService.calculateAverage(playerInfoDTO);
        }

        model.addAttribute("allList", allList);
        model.addAttribute("top5Point", top5Point);
        return "record";
    }

    @PostMapping("/addplayer")
    public String addPlayer(PlayerInfoDTO playerInfoDTO){
        mainService.addPlayer(playerInfoDTO);
        return "playermanagement";
    }
}
