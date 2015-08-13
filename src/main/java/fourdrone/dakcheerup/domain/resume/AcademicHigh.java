/**
 * TB_RESUME_ACADEMIC_HIGHSCHOOL (이력서_학력_고등학교 ) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class AcademicHigh {
	private String memberId;							//회원_아이디 
	private String academicHighPeriod;					//학력_고등학교_재학기간
	private String academicHighArea;					//학력_고등학교_소재지 
	private String academicHighName;					//학력_고등학교_학교명 
	private String academicHighSection;					//학력_고등학교_졸업구분 
	private String academicHighMajor;					//학력_고등학교_전공 
	private Timestamp academicHighRegDate;				//학력_고등학교_등록일 
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
	 * @return the academicHighPeriod
	 */
	public String getAcademicHighPeriod() {
		return academicHighPeriod;
	}
	/**
	 * @param academicHighPeriod the academicHighPeriod to set
	 */
	public void setAcademicHighPeriod(String academicHighPeriod) {
		this.academicHighPeriod = academicHighPeriod;
	}
	/**
	 * @return the academicHighArea
	 */
	public String getAcademicHighArea() {
		return academicHighArea;
	}
	/**
	 * @param academicHighArea the academicHighArea to set
	 */
	public void setAcademicHighArea(String academicHighArea) {
		this.academicHighArea = academicHighArea;
	}
	/**
	 * @return the academicHighName
	 */
	public String getAcademicHighName() {
		return academicHighName;
	}
	/**
	 * @param academicHighName the academicHighName to set
	 */
	public void setAcademicHighName(String academicHighName) {
		this.academicHighName = academicHighName;
	}
	/**
	 * @return the academicHighSection
	 */
	public String getAcademicHighSection() {
		return academicHighSection;
	}
	/**
	 * @param academicHighSection the academicHighSection to set
	 */
	public void setAcademicHighSection(String academicHighSection) {
		this.academicHighSection = academicHighSection;
	}
	/**
	 * @return the academicHighMajor
	 */
	public String getAcademicHighMajor() {
		return academicHighMajor;
	}
	/**
	 * @param academicHighMajor the academicHighMajor to set
	 */
	public void setAcademicHighMajor(String academicHighMajor) {
		this.academicHighMajor = academicHighMajor;
	}
	/**
	 * @return the academicHighRegDate
	 */
	public Timestamp getAcademicHighRegDate() {
		return academicHighRegDate;
	}
	/**
	 * @param academicHighRegDate the academicHighRegDate to set
	 */
	public void setAcademicHighRegDate(Timestamp academicHighRegDate) {
		this.academicHighRegDate = academicHighRegDate;
	}
	
}
