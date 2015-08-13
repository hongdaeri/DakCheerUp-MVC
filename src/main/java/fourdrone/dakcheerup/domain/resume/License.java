/**
 * TB_RESUME_LICENSE(이력서_자격증/면허증) 테이블 대응 VO 클래스 
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class License {
	private String memberId;			//회원_아이디 	
	private int licenseNo;				//자격증_번호 
	private String licenseDate;			//자격증_취득일
	private String licenseName;			//자격증_명 
	private String licenseOrg;			//자격증_취득기관
	private String licensePass;			//자격증_합격구분
	private Timestamp licenseRegDate;	//자격증_등록일 
	
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
	 * @return the licenseNo
	 */
	public int getLicenseNo() {
		return licenseNo;
	}
	/**
	 * @param licenseNo the licenseNo to set
	 */
	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}
	/**
	 * @return the licenseDate
	 */
	public String getLicenseDate() {
		return licenseDate;
	}
	/**
	 * @param licenseDate the licenseDate to set
	 */
	public void setLicenseDate(String licenseDate) {
		this.licenseDate = licenseDate;
	}
	/**
	 * @return the licenseName
	 */
	public String getLicenseName() {
		return licenseName;
	}
	/**
	 * @param licenseName the licenseName to set
	 */
	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}
	/**
	 * @return the licenseOrg
	 */
	public String getLicenseOrg() {
		return licenseOrg;
	}
	/**
	 * @param licenseOrg the licenseOrg to set
	 */
	public void setLicenseOrg(String licenseOrg) {
		this.licenseOrg = licenseOrg;
	}
	/**
	 * @return the licensePass
	 */
	public String getLicensePass() {
		return licensePass;
	}
	/**
	 * @param licensePass the licensePass to set
	 */
	public void setLicensePass(String licensePass) {
		this.licensePass = licensePass;
	}
	/**
	 * @return the licenseRegDate
	 */
	public Timestamp getLicenseRegDate() {
		return licenseRegDate;
	}
	/**
	 * @param licenseRegDate the licenseRegDate to set
	 */
	public void setLicenseRegDate(Timestamp licenseRegDate) {
		this.licenseRegDate = licenseRegDate;
	}
	
}
