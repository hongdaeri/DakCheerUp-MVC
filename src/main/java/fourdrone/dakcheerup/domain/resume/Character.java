/**
 * TB_RESUME_CHARACTER(이력서_성격) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Character {

	private String memberId;				//회원_아이디 	
	private int characterNo;				//성격_번호 
	private String characterItem;			//성격_항목 		
	private Timestamp characterRegDate;		//성격_등록일 
	
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @return the characterNo
	 */
	public int getCharacterNo() {
		return characterNo;
	}
	/**
	 * @return the characterItem
	 */
	public String getCharacterItem() {
		return characterItem;
	}
	/**
	 * @return the characterRegDate
	 */
	public Timestamp getCharacterRegDate() {
		return characterRegDate;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @param characterNo the characterNo to set
	 */
	public void setCharacterNo(int characterNo) {
		this.characterNo = characterNo;
	}
	/**
	 * @param characterItem the characterItem to set
	 */
	public void setCharacterItem(String characterItem) {
		this.characterItem = characterItem;
	}
	/**
	 * @param characterRegDate the characterRegDate to set
	 */
	public void setCharacterRegDate(Timestamp characterRegDate) {
		this.characterRegDate = characterRegDate;
	}
	
	
	
}
