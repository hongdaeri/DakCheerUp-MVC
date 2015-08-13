/**
 * TB_RESUME_MILYTARY(이력서_병역) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Military {

	private String memberId;					//회원_아이디 	
	private String militaryPeriod;				//병역_복무기간(yyyy-mm - yyyy-mm)	
	private String militarySection;				//병역구분 (예비역, 면제, 현역, 미필)
	private String militaryGroup;				//병역군별 
	private String militaryRank;				//병역계급 
	private String militaryWork;				//병역병과 
	private String militaryReason;				//병역면제사유 		
	private Timestamp militaryRegDate;			//병역등록일 
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
	 * @return the militaryPeriod
	 */
	public String getMilitaryPeriod() {
		return militaryPeriod;
	}
	/**
	 * @param militaryPeriod the militaryPeriod to set
	 */
	public void setMilitaryPeriod(String militaryPeriod) {
		this.militaryPeriod = militaryPeriod;
	}
	/**
	 * @return the militarySection
	 */
	public String getMilitarySection() {
		return militarySection;
	}
	/**
	 * @param militarySection the militarySection to set
	 */
	public void setMilitarySection(String militarySection) {
		this.militarySection = militarySection;
	}
	/**
	 * @return the militaryGroup
	 */
	public String getMilitaryGroup() {
		return militaryGroup;
	}
	/**
	 * @param militaryGroup the militaryGroup to set
	 */
	public void setMilitaryGroup(String militaryGroup) {
		this.militaryGroup = militaryGroup;
	}
	/**
	 * @return the militaryRank
	 */
	public String getMilitaryRank() {
		return militaryRank;
	}
	/**
	 * @param militaryRank the militaryRank to set
	 */
	public void setMilitaryRank(String militaryRank) {
		this.militaryRank = militaryRank;
	}
	/**
	 * @return the militaryWork
	 */
	public String getMilitaryWork() {
		return militaryWork;
	}
	/**
	 * @param militaryWork the militaryWork to set
	 */
	public void setMilitaryWork(String militaryWork) {
		this.militaryWork = militaryWork;
	}
	/**
	 * @return the militaryReason
	 */
	public String getMilitaryReason() {
		return militaryReason;
	}
	/**
	 * @param militaryReason the militaryReason to set
	 */
	public void setMilitaryReason(String militaryReason) {
		this.militaryReason = militaryReason;
	}
	/**
	 * @return the militaryRegDate
	 */
	public Timestamp getMilitaryRegDate() {
		return militaryRegDate;
	}
	/**
	 * @param militaryRegDate the militaryRegDate to set
	 */
	public void setMilitaryRegDate(Timestamp militaryRegDate) {
		this.militaryRegDate = militaryRegDate;
	}
}
