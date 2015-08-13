/**
 * TB_RESUME_PROJECT(이력서_프로젝트경험 ) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Project {

	private String memberId;				//회원_아이디 
	private int projectNo;					//프로젝트_번호 	
	private String projectPeriod;			//프로젝트 기간
	private String projectName;				//프로젝트_명 
	private String projectContext;			//프로젝트_세부내용 		
	private Timestamp projectRegDate;		//프로젝트_등록일 
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
	 * @return the projectNo
	 */
	public int getProjectNo() {
		return projectNo;
	}
	/**
	 * @param projectNo the projectNo to set
	 */
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	/**
	 * @return the projectPeriod
	 */
	public String getProjectPeriod() {
		return projectPeriod;
	}
	/**
	 * @param projectPeriod the projectPeriod to set
	 */
	public void setProjectPeriod(String projectPeriod) {
		this.projectPeriod = projectPeriod;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the projectContext
	 */
	public String getProjectContext() {
		return projectContext;
	}
	/**
	 * @param projectContext the projectContext to set
	 */
	public void setProjectContext(String projectContext) {
		this.projectContext = projectContext;
	}
	/**
	 * @return the projectRegDate
	 */
	public Timestamp getProjectRegDate() {
		return projectRegDate;
	}
	/**
	 * @param projectRegDate the projectRegDate to set
	 */
	public void setProjectRegDate(Timestamp projectRegDate) {
		this.projectRegDate = projectRegDate;
	}

	
}
