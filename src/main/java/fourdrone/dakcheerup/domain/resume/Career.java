/**
 * TB_RESUME_CAREER(이력서_경력및실습) 테이블 대응 VO 클래스 
 */

package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Career {
	private String memberId;				//회원_아이디 
	private int careerNo;					//경력및실습_번호 
	private String careerPeriod;			//경력및실습_기간
	private String careerCompany;			//경력및실습_회사명 
	private String careerPosition;			//경력및실습_직위 
	private String careerWork;				//경력및실습_담당업무 
	private String careerPost;				//경력및실습_부서 
	private Timestamp careerRegDate;		//경력및실습_등록일 
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
	 * @return the careerNo
	 */
	public int getCareerNo() {
		return careerNo;
	}
	/**
	 * @param careerNo the careerNo to set
	 */
	public void setCareerNo(int careerNo) {
		this.careerNo = careerNo;
	}
	/**
	 * @return the careerPeriod
	 */
	public String getCareerPeriod() {
		return careerPeriod;
	}
	/**
	 * @param careerPeriod the careerPeriod to set
	 */
	public void setCareerPeriod(String careerPeriod) {
		this.careerPeriod = careerPeriod;
	}
	/**
	 * @return the careerCompany
	 */
	public String getCareerCompany() {
		return careerCompany;
	}
	/**
	 * @param careerCompany the careerCompany to set
	 */
	public void setCareerCompany(String careerCompany) {
		this.careerCompany = careerCompany;
	}
	/**
	 * @return the careerPosition
	 */
	public String getCareerPosition() {
		return careerPosition;
	}
	/**
	 * @param careerPosition the careerPosition to set
	 */
	public void setCareerPosition(String careerPosition) {
		this.careerPosition = careerPosition;
	}
	/**
	 * @return the careerWork
	 */
	public String getCareerWork() {
		return careerWork;
	}
	/**
	 * @param careerWork the careerWork to set
	 */
	public void setCareerWork(String careerWork) {
		this.careerWork = careerWork;
	}
	/**
	 * @return the careerPost
	 */
	public String getCareerPost() {
		return careerPost;
	}
	/**
	 * @param careerPost the careerPost to set
	 */
	public void setCareerPost(String careerPost) {
		this.careerPost = careerPost;
	}
	/**
	 * @return the careerRegDate
	 */
	public Timestamp getCareerRegDate() {
		return careerRegDate;
	}
	/**
	 * @param careerRegDate the careerRegDate to set
	 */
	public void setCareerRegDate(Timestamp careerRegDate) {
		this.careerRegDate = careerRegDate;
	}
	
}
