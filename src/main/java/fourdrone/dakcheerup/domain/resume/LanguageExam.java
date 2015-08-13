/**
 * TB_RESUME_LANGUAGE_EXAM(이력서_어학시험) 테이블 대응 VO 클래스 
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class LanguageExam {
	private String memberId;			//회원_아이디 	
	private int langExamNo;				//어학시험_번호
	private String langExamLName;		//어학시험_언어명 
	private String langExamEName;		//어학시험_시험명 
	private String langExamScore;		//어학시험_점수 
	private String langExamType;		//어학시험 점수구분 
	private String langExamOrg;			//어학시험_기관 
	private Timestamp langExamRegDate;	//어학시험_등록일 
	
	
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @return the langExamNo
	 */
	public int getLangExamNo() {
		return langExamNo;
	}
	/**
	 * @return the langExamLName
	 */
	public String getLangExamLName() {
		return langExamLName;
	}
	/**
	 * @return the langExamEName
	 */
	public String getLangExamEName() {
		return langExamEName;
	}
	/**
	 * @return the langExamScore
	 */
	public String getLangExamScore() {
		return langExamScore;
	}
	/**
	 * @return the langExamType
	 */
	public String getLangExamType() {
		return langExamType;
	}
	/**
	 * @return the langExamOrg
	 */
	public String getLangExamOrg() {
		return langExamOrg;
	}
	/**
	 * @return the langExamRegDate
	 */
	public Timestamp getLangExamRegDate() {
		return langExamRegDate;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @param langExamNo the langExamNo to set
	 */
	public void setLangExamNo(int langExamNo) {
		this.langExamNo = langExamNo;
	}
	/**
	 * @param langExamLName the langExamLName to set
	 */
	public void setLangExamLName(String langExamLName) {
		this.langExamLName = langExamLName;
	}
	/**
	 * @param langExamEName the langExamEName to set
	 */
	public void setLangExamEName(String langExamEName) {
		this.langExamEName = langExamEName;
	}
	/**
	 * @param langExamScore the langExamScore to set
	 */
	public void setLangExamScore(String langExamScore) {
		this.langExamScore = langExamScore;
	}
	/**
	 * @param langExamType the langExamType to set
	 */
	public void setLangExamType(String langExamType) {
		this.langExamType = langExamType;
	}
	/**
	 * @param langExamOrg the langExamOrg to set
	 */
	public void setLangExamOrg(String langExamOrg) {
		this.langExamOrg = langExamOrg;
	}
	/**
	 * @param langExamRegDate the langExamRegDate to set
	 */
	public void setLangExamRegDate(Timestamp langExamRegDate) {
		this.langExamRegDate = langExamRegDate;
	}

}
