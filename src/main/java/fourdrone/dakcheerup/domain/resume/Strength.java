/**
 * TB_RESUME_STRENGTH(이력서_강점) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Strength {

	private String memberId;				//회원_아이디 	
	private int strengthNo;					//강점_번호 
	private String strengthItem;			//강점_항목 		
	private Timestamp strengthRegDate;		//강점_등록일 
	
	
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @return the strengthNo
	 */
	public int getStrengthNo() {
		return strengthNo;
	}
	/**
	 * @return the strengthItem
	 */
	public String getStrengthItem() {
		return strengthItem;
	}
	/**
	 * @return the strengthRegDate
	 */
	public Timestamp getStrengthRegDate() {
		return strengthRegDate;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @param strengthNo the strengthNo to set
	 */
	public void setStrengthNo(int strengthNo) {
		this.strengthNo = strengthNo;
	}
	/**
	 * @param strengthItem the strengthItem to set
	 */
	public void setStrengthItem(String strengthItem) {
		this.strengthItem = strengthItem;
	}
	/**
	 * @param strengthRegDate the strengthRegDate to set
	 */
	public void setStrengthRegDate(Timestamp strengthRegDate) {
		this.strengthRegDate = strengthRegDate;
	}
	
	
	
}
