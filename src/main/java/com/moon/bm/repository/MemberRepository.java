package com.moon.bm.repository;

import com.moon.bm.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
    private final SqlSessionTemplate sql;

    public void signup(MemberDTO memberDTO) {
        sql.insert("bm.signup", memberDTO);
    }
}
