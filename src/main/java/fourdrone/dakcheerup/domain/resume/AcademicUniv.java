/**
 * TB_RESUME_ACADEMIC_UNIVERSITY(이력서_학력_대학교 ) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class AcademicUniv {
	
	private String memberId;							//회원_아이디 
	private int academicUnivNo;							//학력_대학교_번호
	
	private String academicUnivPeriodFirst;				//학력_대학교_재학기간_첫번째
	private String academicUnivPeriodFirstOption;		//학력_대학교_재학기간_첫번째_구분 	
	private String academicUnivPeriodLast;				//학력_대학교_재학기간_마지막
	private String academicUnivPeriodLastOption;		//학력_대학교_재학기간_마지막_구분
	
	private String academicUnivDegree;					//학력_대학교_학위 
	private String academicUnivName;					//학력_대학교_학교명
	private String academicUnivMajor;					//학력_대학교_전공 
	
	private int academicUnivScore;						//학력_대학교_점수 
	private String academicUnivScoreOption;				//학력_대학교_점수_구분 
	
	private String academicUnivDoubleName;				//학력_대학교_부_복수전공
	private String academicUnivDoubleOption;			//학력_대학교_부_복수전공_구분 	
	
	private Timestamp academicUnivRegDate;				//학력_대학교_등록일 

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
	 * @return the academicUnivNo
	 */
	public int getAcademicUnivNo() {
		return academicUnivNo;
	}

	/**
	 * @param academicUnivNo the academicUnivNo to set
	 */
	public void setAcademicUnivNo(int academicUnivNo) {
		this.academicUnivNo = academicUnivNo;
	}

	/**
	 * @return the academicUnivPeriodFirst
	 */
	public String getAcademicUnivPeriodFirst() {
		return academicUnivPeriodFirst;
	}

	/**
	 * @param academicUnivPeriodFirst the academicUnivPeriodFirst to set
	 */
	public void setAcademicUnivPeriodFirst(String academicUnivPeriodFirst) {
		this.academicUnivPeriodFirst = academicUnivPeriodFirst;
	}

	/**
	 * @return the academicUnivPeriodFirstOption
	 */
	public String getAcademicUnivPeriodFirstOption() {
		return academicUnivPeriodFirstOption;
	}

	/**
	 * @param academicUnivPeriodFirstOption the academicUnivPeriodFirstOption to set
	 */
	public void setAcademicUnivPeriodFirstOption(String academicUnivPeriodFirstOption) {
		this.academicUnivPeriodFirstOption = academicUnivPeriodFirstOption;
	}

	/**
	 * @return the academicUnivPeriodLast
	 */
	public String getAcademicUnivPeriodLast() {
		return academicUnivPeriodLast;
	}

	/**
	 * @param academicUnivPeriodLast the academicUnivPeriodLast to set
	 */
	public void setAcademicUnivPeriodLast(String academicUnivPeriodLast) {
		this.academicUnivPeriodLast = academicUnivPeriodLast;
	}

	/**
	 * @return the academicUnivPeriodLastOption
	 */
	public String getAcademicUnivPeriodLastOption() {
		return academicUnivPeriodLastOption;
	}

	/**
	 * @param academicUnivPeriodLastOption the academicUnivPeriodLastOption to set
	 */
	public void setAcademicUnivPeriodLastOption(String academicUnivPeriodLastOption) {
		this.academicUnivPeriodLastOption = academicUnivPeriodLastOption;
	}

	/**
	 * @return the academicUnivDegree
	 */
	public String getAcademicUnivDegree() {
		return academicUnivDegree;
	}

	/**
	 * @param academicUnivDegree the academicUnivDegree to set
	 */
	public void setAcademicUnivDegree(String academicUnivDegree) {
		this.academicUnivDegree = academicUnivDegree;
	}

	/**
	 * @return the academicUnivName
	 */
	public String getAcademicUnivName() {
		return academicUnivName;
	}

	/**
	 * @param academicUnivName the academicUnivName to set
	 */
	public void setAcademicUnivName(String academicUnivName) {
		this.academicUnivName = academicUnivName;
	}

	/**
	 * @return the academicUnivMajor
	 */
	public String getAcademicUnivMajor() {
		return academicUnivMajor;
	}

	/**
	 * @param academicUnivMajor the academicUnivMajor to set
	 */
	public void setAcademicUnivMajor(String academicUnivMajor) {
		this.academicUnivMajor = academicUnivMajor;
	}

	/**
	 * @return the academicUnivScore
	 */
	public int getAcademicUnivScore() {
		return academicUnivScore;
	}

	/**
	 * @param academicUnivScore the academicUnivScore to set
	 */
	public void setAcademicUnivScore(int academicUnivScore) {
		this.academicUnivScore = academicUnivScore;
	}

	/**
	 * @return the academicUnivScoreOption
	 */
	public String getAcademicUnivScoreOption() {
		return academicUnivScoreOption;
	}

	/**
	 * @param academicUnivScoreOption the academicUnivScoreOption to set
	 */
	public void setAcademicUnivScoreOption(String academicUnivScoreOption) {
		this.academicUnivScoreOption = academicUnivScoreOption;
	}

	/**
	 * @return the academicUnivDoubleName
	 */
	public String getAcademicUnivDoubleName() {
		return academicUnivDoubleName;
	}

	/**
	 * @param academicUnivDoubleName the academicUnivDoubleName to set
	 */
	public void setAcademicUnivDoubleName(String academicUnivDoubleName) {
		this.academicUnivDoubleName = academicUnivDoubleName;
	}

	/**
	 * @return the academicUnivDoubleOption
	 */
	public String getAcademicUnivDoubleOption() {
		return academicUnivDoubleOption;
	}

	/**
	 * @param academicUnivDoubleOption the academicUnivDoubleOption to set
	 */
	public void setAcademicUnivDoubleOption(String academicUnivDoubleOption) {
		this.academicUnivDoubleOption = academicUnivDoubleOption;
	}

	/**
	 * @return the academicUnivRegDate
	 */
	public Timestamp getAcademicUnivRegDate() {
		return academicUnivRegDate;
	}

	/**
	 * @param academicUnivRegDate the academicUnivRegDate to set
	 */
	public void setAcademicUnivRegDate(Timestamp academicUnivRegDate) {
		this.academicUnivRegDate = academicUnivRegDate;
	}

}
