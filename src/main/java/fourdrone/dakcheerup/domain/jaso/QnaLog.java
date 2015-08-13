/**
 * TB_JASO_QNA_LOG 테이블 대응 VO 클래스 
 */
package fourdrone.dakcheerup.domain.jaso;
import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class QnaLog{	
	
	private int qnaLogNo;					//문항_로그_번호 
	private int qnaNo;						//문항_번호 
	
	private String qnaLogState;				//문항_로그_상태 
	private String qnaLogTmpQuestion;		//문항_로그_질문 
	private String qnaLogTmpAnswer;			//문항_로그_답변 

	private Timestamp qnaLogRegDate;		//문항_로그_등록일 

	/**
	 * @return the qnaLogNo
	 */
	public int getQnaLogNo() {
		return qnaLogNo;
	}

	/**
	 * @return the qnaNo
	 */
	public int getQnaNo() {
		return qnaNo;
	}

	/**
	 * @return the qnaLogState
	 */
	public String getQnaLogState() {
		return qnaLogState;
	}

	/**
	 * @return the qnaLogTmpQuestion
	 */
	public String getQnaLogTmpQuestion() {
		return qnaLogTmpQuestion;
	}

	/**
	 * @return the qnaLogTmpAnswer
	 */
	public String getQnaLogTmpAnswer() {
		return qnaLogTmpAnswer;
	}

	/**
	 * @return the qnaLogRegDate
	 */
	public Timestamp getQnaLogRegDate() {
		return qnaLogRegDate;
	}

	/**
	 * @param qnaLogNo the qnaLogNo to set
	 */
	public void setQnaLogNo(int qnaLogNo) {
		this.qnaLogNo = qnaLogNo;
	}

	/**
	 * @param qnaNo the qnaNo to set
	 */
	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}

	/**
	 * @param qnaLogState the qnaLogState to set
	 */
	public void setQnaLogState(String qnaLogState) {
		this.qnaLogState = qnaLogState;
	}

	/**
	 * @param qnaLogTmpQuestion the qnaLogTmpQuestion to set
	 */
	public void setQnaLogTmpQuestion(String qnaLogTmpQuestion) {
		this.qnaLogTmpQuestion = qnaLogTmpQuestion;
	}

	/**
	 * @param qnaLogTmpAnswer the qnaLogTmpAnswer to set
	 */
	public void setQnaLogTmpAnswer(String qnaLogTmpAnswer) {
		this.qnaLogTmpAnswer = qnaLogTmpAnswer;
	}

	/**
	 * @param qnaLogRegDate the qnaLogRegDate to set
	 */
	public void setQnaLogRegDate(Timestamp qnaLogRegDate) {
		this.qnaLogRegDate = qnaLogRegDate;
	}
	


}
