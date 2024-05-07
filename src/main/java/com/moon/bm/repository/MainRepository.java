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

    public List<PlayerInfoDTO> findTop5Assist() {
        return sql.selectList("bm.findTop5Assist");
    }

    public List<PlayerInfoDTO> findTop5Steel() {
        return sql.selectList("bm.findTop5Steel");
    }


    public List<PlayerInfoDTO> findTop5Block() {
        return sql.selectList("bm.findTop5Block");
    }

    public List<PlayerInfoDTO> findTop5Rebound() {
        return sql.selectList("bm.findTop5Rebound");
    }

    public List<PlayerInfoDTO> findWorst5Turnover() {
        return sql.selectList("bm.findWorst5Turnover");
    }
}
