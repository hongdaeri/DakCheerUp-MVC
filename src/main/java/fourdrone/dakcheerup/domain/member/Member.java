package fourdrone.dakcheerup.domain.member;
import java.sql.Timestamp;

public class Member {
	private String memberId;		// 회원_아이디 
	private String memberPassword;	// 회원_비밀번호	
	private String memberName;		// 회원_이름
	private Timestamp regDate;		// 회원_가입
	
	//getter
	public String getMemberId() {
		return memberId;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public String getMemberName() {
		return memberName;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	
	//setter
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}


}