/**
 * TB_RESUME_WRITE(이력서_저술내역) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Write {

	private String memberId;			//회원_아이디
	private int writeNo;				//저술내역_번호 
	private String writeDate;			//저술내역_발행일
	private String writeSection;		//저술내역_분류 (소설,수필,논문 등)
	private String writeName;			//저술내역_저술명 
	private String writeOrg;			//저술내역_발행처 
	private Timestamp writeRegDate;		//저술내역_등록일 
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
	 * @return the writeNo
	 */
	public int getWriteNo() {
		return writeNo;
	}
	/**
	 * @param writeNo the writeNo to set
	 */
	public void setWriteNo(int writeNo) {
		this.writeNo = writeNo;
	}
	/**
	 * @return the writeDate
	 */
	public String getWriteDate() {
		return writeDate;
	}
	/**
	 * @param writeDate the writeDate to set
	 */
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	/**
	 * @return the writeSection
	 */
	public String getWriteSection() {
		return writeSection;
	}
	/**
	 * @param writeSection the writeSection to set
	 */
	public void setWriteSection(String writeSection) {
		this.writeSection = writeSection;
	}
	/**
	 * @return the writeName
	 */
	public String getWriteName() {
		return writeName;
	}
	/**
	 * @param writeName the writeName to set
	 */
	public void setWriteName(String writeName) {
		this.writeName = writeName;
	}
	/**
	 * @return the writeOrg
	 */
	public String getWriteOrg() {
		return writeOrg;
	}
	/**
	 * @param writeOrg the writeOrg to set
	 */
	public void setWriteOrg(String writeOrg) {
		this.writeOrg = writeOrg;
	}
	/**
	 * @return the writeRegDate
	 */
	public Timestamp getWriteRegDate() {
		return writeRegDate;
	}
	/**
	 * @param writeRegDate the writeRegDate to set
	 */
	public void setWriteRegDate(Timestamp writeRegDate) {
		this.writeRegDate = writeRegDate;
	}
	
}
