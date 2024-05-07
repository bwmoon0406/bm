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
        List<PlayerInfoDTO> top5Assist = mainService.findTop5Assist();
        List<PlayerInfoDTO> top5Steel = mainService.findTop5Steel();
        List<PlayerInfoDTO> top5Block = mainService.findTop5Block();
        List<PlayerInfoDTO> top5Rebound = mainService.findTop5Rebound();
        List<PlayerInfoDTO> worst5Turnover = mainService.findWorst5Turnover();

        for(PlayerInfoDTO playerInfoDTO : allList) {
            mainService.calculateAverage(playerInfoDTO);
        }

        model.addAttribute("allList", allList);
        model.addAttribute("top5Point", top5Point);
        model.addAttribute("top5Assist", top5Assist);
        model.addAttribute("top5Steel", top5Steel);
        model.addAttribute("top5Block", top5Block);
        model.addAttribute("top5Rebound", top5Rebound);
        model.addAttribute("worst5Turnover", worst5Turnover);
        return "record";
    }

    @PostMapping("/addplayer")
    public String addPlayer(PlayerInfoDTO playerInfoDTO){
        mainService.addPlayer(playerInfoDTO);
        return "playermanagement";
    }
}
