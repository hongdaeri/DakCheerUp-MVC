/**
 * TB_RESUME_GLOBAL(이력서_글로벌경험) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Global {

	private String memberId;				//회원_아이디 
	private int globalNo;					//글로벌경험_번호 	
	private String globalPeriod;			//글로벌경험_기간	
	private String globalNation;			//글로벌경험_국가  
	private String globalPurpose;			//글로벌경험_목적 
	private String globalContent;			//글로벌경험_내용 		
	private Timestamp globalRegDate;		//글로벌경험_등록일 
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
	 * @return the globalNo
	 */
	public int getGlobalNo() {
		return globalNo;
	}
	/**
	 * @param globalNo the globalNo to set
	 */
	public void setGlobalNo(int globalNo) {
		this.globalNo = globalNo;
	}
	/**
	 * @return the globalPeriod
	 */
	public String getGlobalPeriod() {
		return globalPeriod;
	}
	/**
	 * @param globalPeriod the globalPeriod to set
	 */
	public void setGlobalPeriod(String globalPeriod) {
		this.globalPeriod = globalPeriod;
	}
	/**
	 * @return the globalNation
	 */
	public String getGlobalNation() {
		return globalNation;
	}
	/**
	 * @param globalNation the globalNation to set
	 */
	public void setGlobalNation(String globalNation) {
		this.globalNation = globalNation;
	}
	/**
	 * @return the globalPurpose
	 */
	public String getGlobalPurpose() {
		return globalPurpose;
	}
	/**
	 * @param globalPurpose the globalPurpose to set
	 */
	public void setGlobalPurpose(String globalPurpose) {
		this.globalPurpose = globalPurpose;
	}
	/**
	 * @return the globalContent
	 */
	public String getGlobalContent() {
		return globalContent;
	}
	/**
	 * @param globalContent the globalContent to set
	 */
	public void setGlobalContent(String globalContent) {
		this.globalContent = globalContent;
	}
	/**
	 * @return the globalRegDate
	 */
	public Timestamp getGlobalRegDate() {
		return globalRegDate;
	}
	/**
	 * @param globalRegDate the globalRegDate to set
	 */
	public void setGlobalRegDate(Timestamp globalRegDate) {
		this.globalRegDate = globalRegDate;
	}
	
	
}
