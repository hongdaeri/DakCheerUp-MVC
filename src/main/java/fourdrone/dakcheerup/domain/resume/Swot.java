/**
 * TB_RESUME_SWOT(이력서_SWOT) 테이블 대응 VO 클래스 
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Swot {
	private String memberId;			//회원_아이디 	
	private String swotStrength;		//SWOT_강점
	private String swotWeakness;		//SWOT_약점 
	private String swotOpportunities;	//SWOT_기회 
	private String swotThreats;			//SWOT_위협 
	private String swotSo;				//SWOT_SO전략 
	private String swotSt;				//SWOT_ST전략 
	private String swotWo;				//SWOT_WO전략 
	private String swotWt;				//SWOT_WT전략 
	private Timestamp swotRegDate;		//SWOT_등록일 
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @return the swotStrength
	 */
	public String getSwotStrength() {
		return swotStrength;
	}
	/**
	 * @return the swotWeakness
	 */
	public String getSwotWeakness() {
		return swotWeakness;
	}
	/**
	 * @return the swotOpportunities
	 */
	public String getSwotOpportunities() {
		return swotOpportunities;
	}
	/**
	 * @return the swotThreats
	 */
	public String getSwotThreats() {
		return swotThreats;
	}
	/**
	 * @return the swotSo
	 */
	public String getSwotSo() {
		return swotSo;
	}
	/**
	 * @return the swotSt
	 */
	public String getSwotSt() {
		return swotSt;
	}
	/**
	 * @return the swotWo
	 */
	public String getSwotWo() {
		return swotWo;
	}
	/**
	 * @return the swotWt
	 */
	public String getSwotWt() {
		return swotWt;
	}
	/**
	 * @return the swotRegDate
	 */
	public Timestamp getSwotRegDate() {
		return swotRegDate;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @param swotStrength the swotStrength to set
	 */
	public void setSwotStrength(String swotStrength) {
		this.swotStrength = swotStrength;
	}
	/**
	 * @param swotWeakness the swotWeakness to set
	 */
	public void setSwotWeakness(String swotWeakness) {
		this.swotWeakness = swotWeakness;
	}
	/**
	 * @param swotOpportunities the swotOpportunities to set
	 */
	public void setSwotOpportunities(String swotOpportunities) {
		this.swotOpportunities = swotOpportunities;
	}
	/**
	 * @param swotThreats the swotThreats to set
	 */
	public void setSwotThreats(String swotThreats) {
		this.swotThreats = swotThreats;
	}
	/**
	 * @param swotSo the swotSo to set
	 */
	public void setSwotSo(String swotSo) {
		this.swotSo = swotSo;
	}
	/**
	 * @param swotSt the swotSt to set
	 */
	public void setSwotSt(String swotSt) {
		this.swotSt = swotSt;
	}
	/**
	 * @param swotWo the swotWo to set
	 */
	public void setSwotWo(String swotWo) {
		this.swotWo = swotWo;
	}
	/**
	 * @param swotWt the swotWt to set
	 */
	public void setSwotWt(String swotWt) {
		this.swotWt = swotWt;
	}
	/**
	 * @param swotRegDate the swotRegDate to set
	 */
	public void setSwotRegDate(Timestamp swotRegDate) {
		this.swotRegDate = swotRegDate;
	}
	
}
