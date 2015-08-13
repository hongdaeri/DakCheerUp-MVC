/**
 *  TB_Member 테이블 대응 VO 클래스 
 *  DakCheerUp.vo.member 패키지의 모든 클래스와 클래스 리스트를 담는다. 
 */
package fourdrone.dakcheerup.domain;


import fourdrone.dakcheerup.domain.member.Member;

import java.util.ArrayList;
import java.util.List;

/**
 * @author h0ngz
 *
 */
public class Users {
		
	// 단일 Vo클래스들.
	private Member member;
	
	// 리스트 Vo클래스
	private List<Member> memberList;
	
	public Users()
	{
		//단일 클래스 Initialize
		this.member				= new Member();
		
		// 리스트 클래스 Initialize
		this.memberList			= new ArrayList<Member>();
	
	}

	// setter , getter 

	/**
	 * @return the member
	 */
	public Member getMember() {
		return member;
	}



	/**
	 * @return the memberList
	 */
	public List<Member> getMemberList() {
		return memberList;
	}



	/**
	 * @param member the member to set
	 */
	public void setMember(Member member) {
		this.member = member;
	}



	/**
	 * @param memberList the memberList to set
	 */
	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}	
}
