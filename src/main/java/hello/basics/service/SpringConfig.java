package hello.basics.service;

import hello.basics.repository.JdbcMemberRepository;
import hello.basics.repository.JdbctemplateMemberRepository;
import hello.basics.repository.MemberRepository;
import hello.basics.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {

        //return new MemoryMemberRepository();
        //return  new JdbcMemberRepository(dataSource);
        return  new JdbctemplateMemberRepository(dataSource);
    }
}
