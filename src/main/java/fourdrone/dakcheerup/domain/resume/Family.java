/**
 * TB_RESUME_FAMILY(이력서_가족관계) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Family {
	private String memberId;			//회원_아이디 
	private int familyNo;				//가족관계_번호 
	private String familyRelation;		//가족관계_관계 
	private String familyName;			//가족관계_성명 
	private int familyAge;				//가족관계_연령 
	private String familyJob;			//가족관계_현재직업 
	private String familyLive;			//가족관계_동거여부 (동거/비동거)
	private String familyComment;		//가족관계_한줄소개 
	private Timestamp familyRegDate;	//가족관계_등록일
	
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @return the familyNo
	 */
	public int getFamilyNo() {
		return familyNo;
	}
	/**
	 * @return the familyRelation
	 */
	public String getFamilyRelation() {
		return familyRelation;
	}
	/**
	 * @return the familyName
	 */
	public String getFamilyName() {
		return familyName;
	}
	/**
	 * @return the familyAge
	 */
	public int getFamilyAge() {
		return familyAge;
	}
	/**
	 * @return the familyJob
	 */
	public String getFamilyJob() {
		return familyJob;
	}
	/**
	 * @return the familyLive
	 */
	public String getFamilyLive() {
		return familyLive;
	}
	/**
	 * @return the familyComment
	 */
	public String getFamilyComment() {
		return familyComment;
	}
	/**
	 * @return the familyRegDate
	 */
	public Timestamp getFamilyRegDate() {
		return familyRegDate;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @param familyNo the familyNo to set
	 */
	public void setFamilyNo(int familyNo) {
		this.familyNo = familyNo;
	}
	/**
	 * @param familyRelation the familyRelation to set
	 */
	public void setFamilyRelation(String familyRelation) {
		this.familyRelation = familyRelation;
	}
	/**
	 * @param familyName the familyName to set
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	/**
	 * @param familyAge the familyAge to set
	 */
	public void setFamilyAge(int familyAge) {
		this.familyAge = familyAge;
	}
	/**
	 * @param familyJob the familyJob to set
	 */
	public void setFamilyJob(String familyJob) {
		this.familyJob = familyJob;
	}
	/**
	 * @param familyLive the familyLive to set
	 */
	public void setFamilyLive(String familyLive) {
		this.familyLive = familyLive;
	}
	/**
	 * @param familyComment the familyComment to set
	 */
	public void setFamilyComment(String familyComment) {
		this.familyComment = familyComment;
	}
	/**
	 * @param familyRegDate the familyRegDate to set
	 */
	public void setFamilyRegDate(Timestamp familyRegDate) {
		this.familyRegDate = familyRegDate;
	}
	

}
