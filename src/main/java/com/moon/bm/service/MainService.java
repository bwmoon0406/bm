package com.moon.bm.service;

import com.moon.bm.dto.PlayerInfoDTO;
import com.moon.bm.repository.MainRepository;
import com.moon.bm.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {
    private final MainRepository mainRepository;


    public void addPlayer(PlayerInfoDTO playerInfoDTO) {
        mainRepository.addPlayer(playerInfoDTO);
    }
}
