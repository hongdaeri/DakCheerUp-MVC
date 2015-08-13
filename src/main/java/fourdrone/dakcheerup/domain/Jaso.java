/**
 *  TB_JASO(자소서) 테이블 대응 VO 클래스 
 *  DakCheerUp.vo.jaso 패키지의 모든 클래스와 클래스 리스트를 담는다. 
 */
package fourdrone.dakcheerup.domain;
import fourdrone.dakcheerup.domain.jaso.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author h0ngz
 *
 */
public class Jaso {
	
	//테이블 필드 대응 변수들.
	private String memberId;					//회원_아이디 
	private Timestamp jasoFirstRegDate;			//이력서_최초_등록일 
	private Timestamp jasoLastRegDate;			//이력서_최근_등록일 
	
	
	// 단일 Vo클래스들.
	private Group group;						//그룹
	private File file;							//파일
	private Qna qna;							//문항  
	private QnaLog qnaLog;						//문항_로그
	

	// 리스트 Vo클래스
	private List<Group> groupList;
	private List <File> fileList;
	private List <Qna> qnaList;
	private List <QnaLog> qnaLogList;
	
	
	public Jaso()
	{
		//단일 클래스 Initialize
		this.group				= new Group();
		this.file				= new File();
		this.qna				= new Qna();
		this.qnaLog				= new QnaLog();
		
		
		
		// 리스트 클래스 Initialize
		this.groupList			= new ArrayList<Group>();
		this.fileList			= new ArrayList<File>();
		this.qnaList			= new ArrayList<Qna>();
		this.qnaLogList			= new ArrayList<QnaLog>();
	}


	// setter , getter 
	
	
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}


	/**
	 * @return the jasoFirstRegDate
	 */
	public Timestamp getJasoFirstRegDate() {
		return jasoFirstRegDate;
	}


	/**
	 * @return the jasoLastRegDate
	 */
	public Timestamp getJasoLastRegDate() {
		return jasoLastRegDate;
	}


	/**
	 * @return the group
	 */
	public Group getGroup() {
		return group;
	}


	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}


	/**
	 * @return the qna
	 */
	public Qna getQna() {
		return qna;
	}


	/**
	 * @return the qnaLog
	 */
	public QnaLog getQnaLog() {
		return qnaLog;
	}


	/**
	 * @return the groupList
	 */
	public List<Group> getGroupList() {
		return groupList;
	}


	/**
	 * @return the fileList
	 */
	public List<File> getFileList() {
		return fileList;
	}


	/**
	 * @return the qnaList
	 */
	public List<Qna> getQnaList() {
		return qnaList;
	}


	/**
	 * @return the qnaLogList
	 */
	public List<QnaLog> getQnaLogList() {
		return qnaLogList;
	}


	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	/**
	 * @param jasoFirstRegDate the jasoFirstRegDate to set
	 */
	public void setJasoFirstRegDate(Timestamp jasoFirstRegDate) {
		this.jasoFirstRegDate = jasoFirstRegDate;
	}


	/**
	 * @param jasoLastRegDate the jasoLastRegDate to set
	 */
	public void setJasoLastRegDate(Timestamp jasoLastRegDate) {
		this.jasoLastRegDate = jasoLastRegDate;
	}


	/**
	 * @param group the group to set
	 */
	public void setGroup(Group group) {
		this.group = group;
	}


	/**
	 * @param file the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}


	/**
	 * @param qna the qna to set
	 */
	public void setQna(Qna qna) {
		this.qna = qna;
	}


	/**
	 * @param qnaLog the qnaLog to set
	 */
	public void setQnaLog(QnaLog qnaLog) {
		this.qnaLog = qnaLog;
	}


	/**
	 * @param groupList the groupList to set
	 */
	public void setGroupList(List<Group> groupList) {
		this.groupList = groupList;
	}


	/**
	 * @param fileList the fileList to set
	 */
	public void setFileList(List<File> fileList) {
		this.fileList = fileList;
	}


	/**
	 * @param qnaList the qnaList to set
	 */
	public void setQnaList(List<Qna> qnaList) {
		this.qnaList = qnaList;
	}


	/**
	 * @param qnaLogList the qnaLogList to set
	 */
	public void setQnaLogList(List<QnaLog> qnaLogList) {
		this.qnaLogList = qnaLogList;
	}	

}
