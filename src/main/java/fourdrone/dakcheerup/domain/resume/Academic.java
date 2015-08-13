/**
 * TB_RESUME_Academic(이력서_학력) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.util.ArrayList;
import java.util.List;

/**
 * @author h0ngz
 *
 */
public class Academic {
	
	private AcademicHigh academicHigh;
	private AcademicUniv academicUniv;
	
	private List <AcademicUniv> academicUnivList;
	
	public Academic()
	{
		this.academicHigh = new AcademicHigh();
		this.academicUniv = new AcademicUniv();
		this.academicUnivList = new ArrayList <AcademicUniv>();
	}

	
	/**
	 * @return the academicHigh
	 */
	public AcademicHigh getAcademicHigh() {
		return academicHigh;
	}

	/**
	 * @return the academicUniv
	 */
	public AcademicUniv getAcademicUniv() {
		return academicUniv;
	}

	/**
	 * @return the academicUnivList
	 */
	public List<AcademicUniv> getAcademicUnivList() {
		return academicUnivList;
	}

	/**
	 * @param academicHigh the academicHigh to set
	 */
	public void setAcademicHigh(AcademicHigh academicHigh) {
		this.academicHigh = academicHigh;
	}

	/**
	 * @param academicUniv the academicUniv to set
	 */
	public void setAcademicUniv(AcademicUniv academicUniv) {
		this.academicUniv = academicUniv;
	}

	/**
	 * @param academicUnivList the academicUnivList to set
	 */
	public void setAcademicUnivList(List<AcademicUniv> academicUnivList) {
		this.academicUnivList = academicUnivList;
	}
	
	
}
