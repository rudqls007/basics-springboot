package hello.basics.controller;

import hello.basics.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberCOntroller {

    private final MemberService memberService;

    @Autowired
    public MemberCOntroller(MemberService memberService) {
        this.memberService = memberService;
    }
}
