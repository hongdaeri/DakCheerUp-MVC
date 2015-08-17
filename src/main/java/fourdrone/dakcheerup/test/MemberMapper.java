package fourdrone.dakcheerup.test;

import java.util.ArrayList;

/**
 * Created by h0ngz on 2015. 8. 16..
 */
public interface MemberMapper {
    ArrayList<Member> getMembers();
    void insertMember(Member member);
    void updateMember(String name);
    void deleteMember(String name);
}
