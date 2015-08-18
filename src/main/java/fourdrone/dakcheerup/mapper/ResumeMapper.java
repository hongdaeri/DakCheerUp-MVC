package fourdrone.dakcheerup.mapper;


import fourdrone.dakcheerup.domain.Resume;
import fourdrone.dakcheerup.domain.member.Member;

/**
 * Created by h0ngz on 2015. 8. 17..
 */
public interface ResumeMapper {
    Member getMember(String id);
    void insertMember(Resume member);
    void updateMember(String name);
    void deleteMember(String name);
}
