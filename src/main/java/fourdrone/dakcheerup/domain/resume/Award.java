/**
 * TB_RESUME_AWARD(이력서_수상실적) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Award {

	private String memberId;				//회원_아이디 
	private int awardNo;					//수상실적_수상년도
	private String awardDate;				//수상실적_수상일(yyyymm) 
	private String awardName;				//수상실적_명 
	private String awardOrg;				//수상실적_기관 	
	private String awardSection;			//수상실적_구분 (팀,개인)		
	private Timestamp awardRegDate;			//수상실적_등록일 
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the awardNo
	 */
	public int getAwardNo() {
		return awardNo;
	}
	/**
	 * @param awardNo the awardNo to set
	 */
	public void setAwardNo(int awardNo) {
		this.awardNo = awardNo;
	}
	/**
	 * @return the awardDate
	 */
	public String getAwardDate() {
		return awardDate;
	}
	/**
	 * @param awardDate the awardDate to set
	 */
	public void setAwardDate(String awardDate) {
		this.awardDate = awardDate;
	}
	/**
	 * @return the awardName
	 */
	public String getAwardName() {
		return awardName;
	}
	/**
	 * @param awardName the awardName to set
	 */
	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}
	/**
	 * @return the awardOrg
	 */
	public String getAwardOrg() {
		return awardOrg;
	}
	/**
	 * @param awardOrg the awardOrg to set
	 */
	public void setAwardOrg(String awardOrg) {
		this.awardOrg = awardOrg;
	}
	/**
	 * @return the awardSection
	 */
	public String getAwardSection() {
		return awardSection;
	}
	/**
	 * @param awardSection the awardSection to set
	 */
	public void setAwardSection(String awardSection) {
		this.awardSection = awardSection;
	}
	/**
	 * @return the awardRegDate
	 */
	public Timestamp getAwardRegDate() {
		return awardRegDate;
	}
	/**
	 * @param awardRegDate the awardRegDate to set
	 */
	public void setAwardRegDate(Timestamp awardRegDate) {
		this.awardRegDate = awardRegDate;
	}
	
		
}
