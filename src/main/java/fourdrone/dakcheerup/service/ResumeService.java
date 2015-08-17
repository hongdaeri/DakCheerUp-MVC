package fourdrone.dakcheerup.service;

import fourdrone.dakcheerup.domain.Resume;

import java.util.ArrayList;

/**
 * Created by h0ngz on 2015. 8. 17..
 */
public interface ResumeService {
    ArrayList<Resume> getMembers();
    void insertMember(Resume member);
    void updateMember(String name);
    void deleteMember(String name);
}
