/**
 * TB_RESUME_BROTHER(이력서_형제관계) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Brother {
	private String memberId;			//회원_아이디
	private int brotherMale;			//형제관계_몇남 
	private int brotherFemale;			//형제관계_몇녀중 
	private int brotherMe;				//형제관계_몇째
	private Timestamp brotherRegDate;	//형제관계_등록일 
	
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @return the brotherMale
	 */
	public int getBrotherMale() {
		return brotherMale;
	}
	/**
	 * @return the brotherFemale
	 */
	public int getBrotherFemale() {
		return brotherFemale;
	}
	/**
	 * @return the brotherMe
	 */
	public int getBrotherMe() {
		return brotherMe;
	}
	/**
	 * @return the brotherRegDate
	 */
	public Timestamp getBrotherRegDate() {
		return brotherRegDate;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @param brotherMale the brotherMale to set
	 */
	public void setBrotherMale(int brotherMale) {
		this.brotherMale = brotherMale;
	}
	/**
	 * @param brotherFemale the brotherFemale to set
	 */
	public void setBrotherFemale(int brotherFemale) {
		this.brotherFemale = brotherFemale;
	}
	/**
	 * @param brotherMe the brotherMe to set
	 */
	public void setBrotherMe(int brotherMe) {
		this.brotherMe = brotherMe;
	}
	/**
	 * @param brotherRegDate the brotherRegDate to set
	 */
	public void setBrotherRegDate(Timestamp brotherRegDate) {
		this.brotherRegDate = brotherRegDate;
	}
	
}
