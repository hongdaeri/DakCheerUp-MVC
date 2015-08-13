/**
 * TB_JASO_Group 테이블 대응 VO 클래스 
 */
package fourdrone.dakcheerup.domain.jaso;
import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Group {
	
	private String memberId;			//회원_아이디 
	private int groupNo;				//그룹_번호	
	private String groupName;			//그룹_이름 
	private Timestamp groupRegDate;		//그룹_등록일 
	
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @return the groupNo
	 */
	public int getGroupNo() {
		return groupNo;
	}
	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * @return the groupRegDate
	 */
	public Timestamp getGroupRegDate() {
		return groupRegDate;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @param groupNo the groupNo to set
	 */
	public void setGroupNo(int groupNo) {
		this.groupNo = groupNo;
	}
	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * @param groupRegDate the groupRegDate to set
	 */
	public void setGroupRegDate(Timestamp groupRegDate) {
		this.groupRegDate = groupRegDate;
	}
	
}
