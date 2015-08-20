package fourdrone.dakcheerup.mapper;

import fourdrone.dakcheerup.domain.member.Member;

import java.util.ArrayList;

/**
 * Created by h0ngz on 2015. 8. 17..
 */
public interface AccountMapper {
    Member getMember(String memberId);

    void addMember(Member member);

    void modMember(String memberId);

    void delMember(String memberId);

    ArrayList<Member> getMemberList();

    Member getMemberForLogin(Member member);
}
