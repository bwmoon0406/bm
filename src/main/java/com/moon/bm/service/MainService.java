package com.moon.bm.service;

import com.moon.bm.dto.PlayerInfoDTO;
import com.moon.bm.repository.MainRepository;
import com.moon.bm.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {
    private final MainRepository mainRepository;


    public void addPlayer(PlayerInfoDTO playerInfoDTO) {
        mainRepository.addPlayer(playerInfoDTO);
    }

    public List<PlayerInfoDTO> findAll() {
        return mainRepository.findAll();
    }

    public List<PlayerInfoDTO> findTop5Point(){
        return mainRepository.findTop5Point();
    }

    // 쿼터별 평균기록 계산
    public void calculateAverage(PlayerInfoDTO playerInfoDTO) {
        double averagePoint = (double) playerInfoDTO.getPoint() / playerInfoDTO.getQuarter();
        double averageAssist = (double) playerInfoDTO.getAssist() / playerInfoDTO.getQuarter();
        double averageSteel = (double) playerInfoDTO.getSteel() / playerInfoDTO.getQuarter();
        double averageBlock = (double) playerInfoDTO.getBlock() / playerInfoDTO.getQuarter();
        double averageRebound = (double) playerInfoDTO.getRebound() / playerInfoDTO.getQuarter();
        double averageOr = (double) playerInfoDTO.getOffensiveRebound() / playerInfoDTO.getQuarter();
        double averageDr = (double) playerInfoDTO.getDefensiveRebound() / playerInfoDTO.getQuarter();
        double averageTurnover = (double) playerInfoDTO.getTurnover() / playerInfoDTO.getQuarter();
        double averageGame = (double) playerInfoDTO.getQuarter()/4 / playerInfoDTO.getQuarter();
        playerInfoDTO.setAveragePoint(averagePoint);
        playerInfoDTO.setAverageAssist(averageAssist);
        playerInfoDTO.setAverageSteel(averageSteel);
        playerInfoDTO.setAverageBlock(averageBlock);
        playerInfoDTO.setAverageRebound(averageRebound);
        playerInfoDTO.setAverageOr(averageOr);
        playerInfoDTO.setAverageDr(averageDr);
        playerInfoDTO.setAverageTurnover(averageTurnover);
        playerInfoDTO.setAverageTurnover(averageGame);
    }
}
