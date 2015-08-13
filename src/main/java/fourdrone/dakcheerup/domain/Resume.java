/**
 *  TB_RESUME(이력서) 테이블 대응 VO 클래스 
 *  DakCheerUp.vo.resume 패키지의 모든 클래스와 클래스 리스트를 담는다. 
 */
package fourdrone.dakcheerup.domain;

import fourdrone.dakcheerup.domain.resume.*;
import fourdrone.dakcheerup.domain.resume.Character;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author h0ngz
 *
 */
public class Resume {
	
	//테이블 필드 대응 변수들.
	private String memberId;					//회원_아이디 
	private Timestamp resumeFirstRegDate;		//이력서_최초_등록일 
	private Timestamp resumeLastRegDate;		//이력서_최근_등록일 
	private Timestamp resumeLastPrintDate;		//이력서_최근_프린트일 
	
	
	// 단일 Vo클래스들.
	private Award award;						//수상실적
	private Brother brother;					//형제관계
	private Career career;						//경력및실습활동 
	private Character character;				//성격
	private Education education;				//교육이수 
	private Family family;						//가족관계 
	private Global global;						//글로벌경험 
	private LanguageAbility languageAbility;	//어학능력 
	private LanguageExam languageExam;			//어학시험 
	private License license;					//자격증및면허증 
	private Military military;					//병역 
	private OA oa;								//OA능력 
	private Profile profile;					//프로필 
	private Project project;					//프로젝트경험 
	private Strength strength;					//강점 
	private Swot swot;							//SWOT분석 
	private Voluntary voluntary;				//봉사활동 
	private Write write;						//저서내역 
	
	// 리스트 Vo클래스
	private List <Award> awardList;
	private List <Career> careerList;
	private List <Character> characterList;
	private List <Education> educationList;
	private List <Global> globalList;
	private List <Family> familyList;
	private List <LanguageAbility> languageAbilityList;
	private List <LanguageExam> languageExamList;
	private List <License> licenseList;
	private List <Project> projectList;
	private List <Strength> strengthList;
	private List <Voluntary> voluntaryList;
	private List <Write> writeList;
	
	public Resume()
	{
		//단일 클래스 Initialize
		this.award				= new Award();
		this.brother			= new Brother();
		this.career				= new Career();
		this.character			= new Character();
		this.education			= new Education();
		this.family				= new Family();
		this.global				= new Global();
		this.languageAbility	= new LanguageAbility();
		this.languageExam		= new LanguageExam();
		this.license			= new License();
		this.military			= new Military();
		this.oa					= new OA();
		this.profile			= new Profile();
		this.project			= new Project();
		this.strength			= new Strength();
		this.swot				= new Swot();
		this.voluntary			= new Voluntary();
		this.write				= new Write();
		
		
		// 리스트 클래스 Initialize
		this.awardList				= new ArrayList <Award>();
		this.careerList				= new ArrayList <Career>();
		this.characterList			= new ArrayList <Character>();
		this.educationList			= new ArrayList <Education>();
		this.familyList				= new ArrayList <Family>();
		this.globalList				= new ArrayList <Global>();
		this.languageAbilityList	= new ArrayList <LanguageAbility>();
		this.languageExamList		= new ArrayList <LanguageExam>();
		this.licenseList			= new ArrayList <License>();
		this.projectList			= new ArrayList <Project>();
		this.strengthList			= new ArrayList <Strength>();	
		this.voluntaryList			= new ArrayList <Voluntary>();
		this.writeList				= new ArrayList <Write>();		
		
	}

	
	// setter , getter 
	
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @return the resumeFirstRegDate
	 */
	public Timestamp getResumeFirstRegDate() {
		return resumeFirstRegDate;
	}

	/**
	 * @return the resumeLastRegDate
	 */
	public Timestamp getResumeLastRegDate() {
		return resumeLastRegDate;
	}

	/**
	 * @return the resumeLastPrintDate
	 */
	public Timestamp getResumeLastPrintDate() {
		return resumeLastPrintDate;
	}

	/**
	 * @return the award
	 */
	public Award getAward() {
		return award;
	}

	/**
	 * @return the brother
	 */
	public Brother getBrother() {
		return brother;
	}

	/**
	 * @return the career
	 */
	public Career getCareer() {
		return career;
	}

	/**
	 * @return the character
	 */
	public Character getCharacter() {
		return character;
	}

	/**
	 * @return the education
	 */
	public Education getEducation() {
		return education;
	}

	/**
	 * @return the family
	 */
	public Family getFamily() {
		return family;
	}

	/**
	 * @return the global
	 */
	public Global getGlobal() {
		return global;
	}

	/**
	 * @return the languageAbility
	 */
	public LanguageAbility getLanguageAbility() {
		return languageAbility;
	}

	/**
	 * @return the languageExam
	 */
	public LanguageExam getLanguageExam() {
		return languageExam;
	}

	/**
	 * @return the license
	 */
	public License getLicense() {
		return license;
	}

	/**
	 * @return the military
	 */
	public Military getMilitary() {
		return military;
	}

	/**
	 * @return the oa
	 */
	public OA getOa() {
		return oa;
	}

	/**
	 * @return the profile
	 */
	public Profile getProfile() {
		return profile;
	}

	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * @return the strength
	 */
	public Strength getStrength() {
		return strength;
	}

	/**
	 * @return the swot
	 */
	public Swot getSwot() {
		return swot;
	}

	/**
	 * @return the voluntary
	 */
	public Voluntary getVoluntary() {
		return voluntary;
	}

	/**
	 * @return the write
	 */
	public Write getWrite() {
		return write;
	}

	/**
	 * @return the awardList
	 */
	public List<Award> getAwardList() {
		return awardList;
	}

	/**
	 * @return the careerList
	 */
	public List<Career> getCareerList() {
		return careerList;
	}

	/**
	 * @return the characterList
	 */
	public List<Character> getCharacterList() {
		return characterList;
	}

	/**
	 * @return the educationList
	 */
	public List<Education> getEducationList() {
		return educationList;
	}

	/**
	 * @return the globalList
	 */
	public List<Global> getGlobalList() {
		return globalList;
	}

	/**
	 * @return the familyList
	 */
	public List<Family> getFamilyList() {
		return familyList;
	}

	/**
	 * @return the languageAbilityList
	 */
	public List<LanguageAbility> getLanguageAbilityList() {
		return languageAbilityList;
	}

	/**
	 * @return the languageExamList
	 */
	public List<LanguageExam> getLanguageExamList() {
		return languageExamList;
	}

	/**
	 * @return the licenseList
	 */
	public List<License> getLicenseList() {
		return licenseList;
	}

	/**
	 * @return the projectList
	 */
	public List<Project> getProjectList() {
		return projectList;
	}

	/**
	 * @return the strengthList
	 */
	public List<Strength> getStrengthList() {
		return strengthList;
	}

	/**
	 * @return the voluntaryList
	 */
	public List<Voluntary> getVoluntaryList() {
		return voluntaryList;
	}

	/**
	 * @return the writeList
	 */
	public List<Write> getWriteList() {
		return writeList;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @param resumeFirstRegDate the resumeFirstRegDate to set
	 */
	public void setResumeFirstRegDate(Timestamp resumeFirstRegDate) {
		this.resumeFirstRegDate = resumeFirstRegDate;
	}

	/**
	 * @param resumeLastRegDate the resumeLastRegDate to set
	 */
	public void setResumeLastRegDate(Timestamp resumeLastRegDate) {
		this.resumeLastRegDate = resumeLastRegDate;
	}

	/**
	 * @param resumeLastPrintDate the resumeLastPrintDate to set
	 */
	public void setResumeLastPrintDate(Timestamp resumeLastPrintDate) {
		this.resumeLastPrintDate = resumeLastPrintDate;
	}

	/**
	 * @param award the award to set
	 */
	public void setAward(Award award) {
		this.award = award;
	}

	/**
	 * @param brother the brother to set
	 */
	public void setBrother(Brother brother) {
		this.brother = brother;
	}

	/**
	 * @param career the career to set
	 */
	public void setCareer(Career career) {
		this.career = career;
	}

	/**
	 * @param character the character to set
	 */
	public void setCharacter(Character character) {
		this.character = character;
	}

	/**
	 * @param education the education to set
	 */
	public void setEducation(Education education) {
		this.education = education;
	}

	/**
	 * @param family the family to set
	 */
	public void setFamily(Family family) {
		this.family = family;
	}

	/**
	 * @param global the global to set
	 */
	public void setGlobal(Global global) {
		this.global = global;
	}

	/**
	 * @param languageAbility the languageAbility to set
	 */
	public void setLanguageAbility(LanguageAbility languageAbility) {
		this.languageAbility = languageAbility;
	}

	/**
	 * @param languageExam the languageExam to set
	 */
	public void setLanguageExam(LanguageExam languageExam) {
		this.languageExam = languageExam;
	}

	/**
	 * @param license the license to set
	 */
	public void setLicense(License license) {
		this.license = license;
	}

	/**
	 * @param military the military to set
	 */
	public void setMilitary(Military military) {
		this.military = military;
	}

	/**
	 * @param oa the oa to set
	 */
	public void setOa(OA oa) {
		this.oa = oa;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(Strength strength) {
		this.strength = strength;
	}

	/**
	 * @param swot the swot to set
	 */
	public void setSwot(Swot swot) {
		this.swot = swot;
	}

	/**
	 * @param voluntary the voluntary to set
	 */
	public void setVoluntary(Voluntary voluntary) {
		this.voluntary = voluntary;
	}

	/**
	 * @param write the write to set
	 */
	public void setWrite(Write write) {
		this.write = write;
	}

	/**
	 * @param awardList the awardList to set
	 */
	public void setAwardList(List<Award> awardList) {
		this.awardList = awardList;
	}

	/**
	 * @param careerList the careerList to set
	 */
	public void setCareerList(List<Career> careerList) {
		this.careerList = careerList;
	}

	/**
	 * @param characterList the characterList to set
	 */
	public void setCharacterList(List<Character> characterList) {
		this.characterList = characterList;
	}

	/**
	 * @param educationList the educationList to set
	 */
	public void setEducationList(List<Education> educationList) {
		this.educationList = educationList;
	}

	/**
	 * @param globalList the globalList to set
	 */
	public void setGlobalList(List<Global> globalList) {
		this.globalList = globalList;
	}

	/**
	 * @param familyList the familyList to set
	 */
	public void setFamilyList(List<Family> familyList) {
		this.familyList = familyList;
	}

	/**
	 * @param languageAbilityList the languageAbilityList to set
	 */
	public void setLanguageAbilityList(List<LanguageAbility> languageAbilityList) {
		this.languageAbilityList = languageAbilityList;
	}

	/**
	 * @param languageExamList the languageExamList to set
	 */
	public void setLanguageExamList(List<LanguageExam> languageExamList) {
		this.languageExamList = languageExamList;
	}

	/**
	 * @param licenseList the licenseList to set
	 */
	public void setLicenseList(List<License> licenseList) {
		this.licenseList = licenseList;
	}

	/**
	 * @param projectList the projectList to set
	 */
	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	/**
	 * @param strengthList the strengthList to set
	 */
	public void setStrengthList(List<Strength> strengthList) {
		this.strengthList = strengthList;
	}

	/**
	 * @param voluntaryList the voluntaryList to set
	 */
	public void setVoluntaryList(List<Voluntary> voluntaryList) {
		this.voluntaryList = voluntaryList;
	}

	/**
	 * @param writeList the writeList to set
	 */
	public void setWriteList(List<Write> writeList) {
		this.writeList = writeList;
	}

}
