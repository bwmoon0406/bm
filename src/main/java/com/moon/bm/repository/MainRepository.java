package com.moon.bm.repository;

import com.moon.bm.dto.PlayerInfoDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MainRepository {
    private final SqlSessionTemplate sql;

    public void addPlayer(PlayerInfoDTO playerInfoDTO) {
        sql.insert("bm.addPlayer", playerInfoDTO);
    }
}
