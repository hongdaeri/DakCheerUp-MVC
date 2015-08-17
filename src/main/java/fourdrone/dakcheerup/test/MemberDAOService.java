package fourdrone.dakcheerup.test;

/**
 * Created by h0ngz on 2015. 8. 16..
 * - DAO를 상속받아 SqlSession을 사용하여 MemberMapper.xml과 매핑시켜준다.
 */

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
//Service 클래스를 Repository로 등록함으로서 빈(bean) 클래스로 사용하능하게한다.
@Repository
public class MemberDAOService implements MemberDAO {

    //Autowired를 사용하여 sqlSession을 사용할수 있다.
    @Autowired
    private SqlSession sqlSession;

    @Override
    public ArrayList<Member> getMembers() {
        ArrayList<Member> result = new ArrayList<Member>();
        //sqlSession을 통하여 매핑한다.
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        //getMember()의 메소드명과 mapper.mxl과 id는 동일해야한다.
        result = memberMapper.getMembers();

        return result;
    }
    @Override
    public void insertMember(Member member) {
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        memberMapper.insertMember(member);
    }
    //아래부분은 코딩하다 말았음
    @Override
    public void updateMember(String name) {
    }
    @Override
    public void deleteMember(String name) {
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        memberMapper.deleteMember(name);
    }
}