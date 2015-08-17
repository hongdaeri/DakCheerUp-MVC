package fourdrone.dakcheerup.mapper;


import fourdrone.dakcheerup.domain.Resume;

import java.util.ArrayList;

/**
 * Created by h0ngz on 2015. 8. 17..
 */
public interface ResumeMapper {
    ArrayList<Resume> getMembers();
    void insertMember(Resume member);
    void updateMember(String name);
    void deleteMember(String name);
}
