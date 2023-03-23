package com.OInjo.OInjo_demo;

import com.OInjo.OInjo_demo.domain.Member;
import com.OInjo.OInjo_demo.repository.MemberRepository;
import com.OInjo.OInjo_demo.repository.MemoryMemberRepository;
import com.OInjo.OInjo_demo.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
/* 자바코드로 직접 스프링빈에 등록하는 방법 */
