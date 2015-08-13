/**
 * TB_JASO_FILE 테이블 대응 VO 클래스 
 */
package fourdrone.dakcheerup.domain.jaso;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class File {
	private int fileNo;					//파일_번호 
	private int groupNo;				//그룹_번호
	private String memberId;			//회원_아이디 
	
	private String fileName;			//파일_이름 
	
	private boolean fileTrashYn;		//파일_휴지통상태유무
	private Timestamp fileTrashDate;	//파일 휴지통 이동일 
	
	private boolean fileInterestYn;		//파일_관심_상태유무
	private Timestamp fileInterestDate;	//파일 관심 저장일 
		
	private Timestamp fileRegDate;		//파일_등록일 
	private Timestamp fileEditDate;		//파일_수정일 
	private Timestamp fileDeadlineDate;	//파일_마감일 
	
	
	/**
	 * @return the fileNo
	 */
	public int getFileNo() {
		return fileNo;
	}
	/**
	 * @return the groupNo
	 */
	public int getGroupNo() {
		return groupNo;
	}
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @return the fileTrashYn
	 */
	public boolean isFileTrashYn() {
		return fileTrashYn;
	}
	/**
	 * @return the fileTrashDate
	 */
	public Timestamp getFileTrashDate() {
		return fileTrashDate;
	}
	/**
	 * @return the fileInterestYn
	 */
	public boolean isFileInterestYn() {
		return fileInterestYn;
	}
	/**
	 * @return the fileInterestDate
	 */
	public Timestamp getFileInterestDate() {
		return fileInterestDate;
	}
	/**
	 * @return the fileRegDate
	 */
	public Timestamp getFileRegDate() {
		return fileRegDate;
	}
	/**
	 * @return the fileEditDate
	 */
	public Timestamp getFileEditDate() {
		return fileEditDate;
	}
	/**
	 * @return the fileDeadlineDate
	 */
	public Timestamp getFileDeadlineDate() {
		return fileDeadlineDate;
	}
	/**
	 * @param fileNo the fileNo to set
	 */
	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}
	/**
	 * @param groupNo the groupNo to set
	 */
	public void setGroupNo(int groupNo) {
		this.groupNo = groupNo;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * @param fileTrashYn the fileTrashYn to set
	 */
	public void setFileTrashYn(boolean fileTrashYn) {
		this.fileTrashYn = fileTrashYn;
	}
	/**
	 * @param fileTrashDate the fileTrashDate to set
	 */
	public void setFileTrashDate(Timestamp fileTrashDate) {
		this.fileTrashDate = fileTrashDate;
	}
	/**
	 * @param fileInterestYn the fileInterestYn to set
	 */
	public void setFileInterestYn(boolean fileInterestYn) {
		this.fileInterestYn = fileInterestYn;
	}
	/**
	 * @param fileInterestDate the fileInterestDate to set
	 */
	public void setFileInterestDate(Timestamp fileInterestDate) {
		this.fileInterestDate = fileInterestDate;
	}
	/**
	 * @param fileRegDate the fileRegDate to set
	 */
	public void setFileRegDate(Timestamp fileRegDate) {
		this.fileRegDate = fileRegDate;
	}
	/**
	 * @param fileEditDate the fileEditDate to set
	 */
	public void setFileEditDate(Timestamp fileEditDate) {
		this.fileEditDate = fileEditDate;
	}
	/**
	 * @param fileDeadlineDate the fileDeadlineDate to set
	 */
	public void setFileDeadlineDate(Timestamp fileDeadlineDate) {
		this.fileDeadlineDate = fileDeadlineDate;
	}
	
	
}
