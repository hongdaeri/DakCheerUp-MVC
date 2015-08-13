/**
 * TB_RESUME_OA(이력서_OA능력) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class OA {

	private String memberId;			//회원_아이디 	
	private String oaDoc;				//OA능력_문서작성.
	private String oaExcel;				//OA능력_스프레드시트.
	private String oaPpt;				//OA능력_프리젠테이션..
	private String oaInternet;			//OA능력_인터넷..
	private String oaGraphic;			//OA능력_그래픽..		
	private Timestamp oaRegDate;		//OA능력_등록일 

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @return the oaDoc
	 */
	public String getOaDoc() {
		return oaDoc;
	}

	/**
	 * @return the oaExcel
	 */
	public String getOaExcel() {
		return oaExcel;
	}

	/**
	 * @return the oaPpt
	 */
	public String getOaPpt() {
		return oaPpt;
	}

	/**
	 * @return the oaInternet
	 */
	public String getOaInternet() {
		return oaInternet;
	}

	/**
	 * @return the oaGraphic
	 */
	public String getOaGraphic() {
		return oaGraphic;
	}

	/**
	 * @return the oaRegDate
	 */
	public Timestamp getOaRegDate() {
		return oaRegDate;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @param oaDoc the oaDoc to set
	 */
	public void setOaDoc(String oaDoc) {
		this.oaDoc = oaDoc;
	}

	/**
	 * @param oaExcel the oaExcel to set
	 */
	public void setOaExcel(String oaExcel) {
		this.oaExcel = oaExcel;
	}

	/**
	 * @param oaPpt the oaPpt to set
	 */
	public void setOaPpt(String oaPpt) {
		this.oaPpt = oaPpt;
	}

	/**
	 * @param oaInternet the oaInternet to set
	 */
	public void setOaInternet(String oaInternet) {
		this.oaInternet = oaInternet;
	}

	/**
	 * @param oaGraphic the oaGraphic to set
	 */
	public void setOaGraphic(String oaGraphic) {
		this.oaGraphic = oaGraphic;
	}

	/**
	 * @param oaRegDate the oaRegDate to set
	 */
	public void setOaRegDate(Timestamp oaRegDate) {
		this.oaRegDate = oaRegDate;
	}
	
}
