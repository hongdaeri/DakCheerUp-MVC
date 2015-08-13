/**
 * TB_RESUME_LANGUAGE_ABILITY(이력서_어학능력) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class LanguageAbility {

	private String memberId;					//회원_아이디 
	private int LangAbilityNo;					//어학능력_번호 	
	private String LangAbilityName;				//어학능력_언어명 	
	private String LangAbilityConversation;		//어학능력_회화능력 
	private String LangAbilityComposition;		//어학능력_작문능력 
	private String LangAbilityReading;			//어학능력_독해능력 
	private Timestamp LangAbilityRegDate;		//어학능력_등록일 
	
	
	
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @return the langAbilityNo
	 */
	public int getLangAbilityNo() {
		return LangAbilityNo;
	}
	/**
	 * @return the langAbilityName
	 */
	public String getLangAbilityName() {
		return LangAbilityName;
	}
	/**
	 * @return the langAbilityConversation
	 */
	public String getLangAbilityConversation() {
		return LangAbilityConversation;
	}
	/**
	 * @return the langAbilityComposition
	 */
	public String getLangAbilityComposition() {
		return LangAbilityComposition;
	}
	/**
	 * @return the langAbilityReading
	 */
	public String getLangAbilityReading() {
		return LangAbilityReading;
	}
	/**
	 * @return the langAbilityRegDate
	 */
	public Timestamp getLangAbilityRegDate() {
		return LangAbilityRegDate;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @param langAbilityNo the langAbilityNo to set
	 */
	public void setLangAbilityNo(int langAbilityNo) {
		LangAbilityNo = langAbilityNo;
	}
	/**
	 * @param langAbilityName the langAbilityName to set
	 */
	public void setLangAbilityName(String langAbilityName) {
		LangAbilityName = langAbilityName;
	}
	/**
	 * @param langAbilityConversation the langAbilityConversation to set
	 */
	public void setLangAbilityConversation(String langAbilityConversation) {
		LangAbilityConversation = langAbilityConversation;
	}
	/**
	 * @param langAbilityComposition the langAbilityComposition to set
	 */
	public void setLangAbilityComposition(String langAbilityComposition) {
		LangAbilityComposition = langAbilityComposition;
	}
	/**
	 * @param langAbilityReading the langAbilityReading to set
	 */
	public void setLangAbilityReading(String langAbilityReading) {
		LangAbilityReading = langAbilityReading;
	}
	/**
	 * @param langAbilityRegDate the langAbilityRegDate to set
	 */
	public void setLangAbilityRegDate(Timestamp langAbilityRegDate) {
		LangAbilityRegDate = langAbilityRegDate;
	}
	
}
