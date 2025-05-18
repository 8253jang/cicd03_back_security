package web.mvc.service;


import web.mvc.domain.Member;

public interface MemberService {

    Member duplicateCheck(String id);

    /**
     * 가입
     * */
     void  signUp(Member member);



}
