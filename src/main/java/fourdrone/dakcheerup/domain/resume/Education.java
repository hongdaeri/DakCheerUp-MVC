/**
 * TB_RESUME_EDUCATION(이력서_교육이수) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Education {

	private String memberId;					//회원_아이디 
	private int educationNo;					//교육이수_번호 	
	private String educationPeriod;				//교육이수_기간
	private String educationName;				//교육이수_명 
	private String educationOrg;				//교육이수_기관 
	private Timestamp educationRegDate;			//교육이수_등록일 
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
	 * @return the educationNo
	 */
	public int getEducationNo() {
		return educationNo;
	}
	/**
	 * @param educationNo the educationNo to set
	 */
	public void setEducationNo(int educationNo) {
		this.educationNo = educationNo;
	}
	/**
	 * @return the educationPeriod
	 */
	public String getEducationPeriod() {
		return educationPeriod;
	}
	/**
	 * @param educationPeriod the educationPeriod to set
	 */
	public void setEducationPeriod(String educationPeriod) {
		this.educationPeriod = educationPeriod;
	}
	/**
	 * @return the educationName
	 */
	public String getEducationName() {
		return educationName;
	}
	/**
	 * @param educationName the educationName to set
	 */
	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}
	/**
	 * @return the educationOrg
	 */
	public String getEducationOrg() {
		return educationOrg;
	}
	/**
	 * @param educationOrg the educationOrg to set
	 */
	public void setEducationOrg(String educationOrg) {
		this.educationOrg = educationOrg;
	}
	/**
	 * @return the educationRegDate
	 */
	public Timestamp getEducationRegDate() {
		return educationRegDate;
	}
	/**
	 * @param educationRegDate the educationRegDate to set
	 */
	public void setEducationRegDate(Timestamp educationRegDate) {
		this.educationRegDate = educationRegDate;
	}
	
}
