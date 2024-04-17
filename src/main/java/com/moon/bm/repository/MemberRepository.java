package com.moon.bm.repository;

import com.moon.bm.dto.MemberDTO;
import com.moon.bm.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.SessionAttribute;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
    private final SqlSessionTemplate sql;

    public void inputSignup(MemberDTO memberDTO) {
        sql.insert("bm.inputSignup", memberDTO);
    }
}
