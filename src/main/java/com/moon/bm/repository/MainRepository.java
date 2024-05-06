package com.moon.bm.repository;

import com.moon.bm.dto.PlayerInfoDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MainRepository {
    private final SqlSessionTemplate sql;

    public void addPlayer(PlayerInfoDTO playerInfoDTO) {
        sql.insert("bm.addPlayer", playerInfoDTO);
    }

    public List<PlayerInfoDTO> findAll() {
        return sql.selectList("bm.findAll");
    }

    public List<PlayerInfoDTO> findTop5Point() {
        return sql.selectList("bm.findTop5Point");
    }
}
