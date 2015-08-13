/**
 * TB_RESUME_VOLUNTARY(이력서_봉사활동) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Voluntary {

	private String memberId;					//회원_아이디 
	private int voluntaryNo;					//봉사활동_번호 	
	private String voluntaryPeriod;				//봉사활동_기간
	private String voluntaryOrg;				//봉사활동_기관 
	private String voluntaryContent;			//봉사활동_내용 		
	private Timestamp voluntaryRegDate;			//봉사활동_등록일 
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
	 * @return the voluntaryNo
	 */
	public int getVoluntaryNo() {
		return voluntaryNo;
	}
	/**
	 * @param voluntaryNo the voluntaryNo to set
	 */
	public void setVoluntaryNo(int voluntaryNo) {
		this.voluntaryNo = voluntaryNo;
	}
	/**
	 * @return the voluntaryPeriod
	 */
	public String getVoluntaryPeriod() {
		return voluntaryPeriod;
	}
	/**
	 * @param voluntaryPeriod the voluntaryPeriod to set
	 */
	public void setVoluntaryPeriod(String voluntaryPeriod) {
		this.voluntaryPeriod = voluntaryPeriod;
	}
	/**
	 * @return the voluntaryOrg
	 */
	public String getVoluntaryOrg() {
		return voluntaryOrg;
	}
	/**
	 * @param voluntaryOrg the voluntaryOrg to set
	 */
	public void setVoluntaryOrg(String voluntaryOrg) {
		this.voluntaryOrg = voluntaryOrg;
	}
	/**
	 * @return the voluntaryContent
	 */
	public String getVoluntaryContent() {
		return voluntaryContent;
	}
	/**
	 * @param voluntaryContent the voluntaryContent to set
	 */
	public void setVoluntaryContent(String voluntaryContent) {
		this.voluntaryContent = voluntaryContent;
	}
	/**
	 * @return the voluntaryRegDate
	 */
	public Timestamp getVoluntaryRegDate() {
		return voluntaryRegDate;
	}
	/**
	 * @param voluntaryRegDate the voluntaryRegDate to set
	 */
	public void setVoluntaryRegDate(Timestamp voluntaryRegDate) {
		this.voluntaryRegDate = voluntaryRegDate;
	}
	
}
