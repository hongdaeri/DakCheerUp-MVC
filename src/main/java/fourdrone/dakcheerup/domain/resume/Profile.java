/**
 * TB_RESUME_PROFILE(이력서_프로필) 테이블 대응 VO 클래스
 */
package fourdrone.dakcheerup.domain.resume;

import java.sql.Timestamp;

/**
 * @author h0ngz
 *
 */
public class Profile {

	private String memberId;				//회원_아이디 
		
	private String profileName;				//프로필_이름  
	private String profileEname;			//프로필_영문이름.
	private String profileCname;			//프로필_한문이름.
	
	private String profileJuminFront;		//프로필_주민등록번호_앞.
	private String profileJuminBack;		//프로필_주민등록번호_뒤.
	private String profilePhone;			//프로필_휴대폰번호.
	private String profileEmail;			//프로필_이메일주소.
	private String profileAddr;				//프로필_주소.
	
	private String profileHobby;			//프로필_취미.
	private String profileForte;			//프로필_특기.
	private String profileReligion;			//프로필_종교.
	private String profileVeterans;			//프로필_보훈여부.
	private String profileMarriage;			//프로필_혼인여부.
	private String profileDisability;		//프로필_장애여부.
	
	private String profileWebsite;			//프로필_개인웹사이트
	private String profileTwitter;			//프로필_트위터 
	private String profileNaverBlog;		//프로필_네이버블로그 
	private String profileTistory;			//프로필_티스토리 
	private String profileInstagram;		//프로필_인스타그램 
	private String profileFacebook;			//프로필_페이스북 
	private String profilePinterest;		//프로필_핀터레스트 
	private String profileTumblr;			//프로필_텀블러 
	private String profileYoutube;			//프로필_유투브 
		
	private Timestamp profileRegDate;		//프로필_등록일 

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @return the profileName
	 */
	public String getProfileName() {
		return profileName;
	}

	/**
	 * @return the profileEname
	 */
	public String getProfileEname() {
		return profileEname;
	}

	/**
	 * @return the profileCname
	 */
	public String getProfileCname() {
		return profileCname;
	}

	/**
	 * @return the profileJuminFront
	 */
	public String getProfileJuminFront() {
		return profileJuminFront;
	}

	/**
	 * @return the profileJuminBack
	 */
	public String getProfileJuminBack() {
		return profileJuminBack;
	}

	/**
	 * @return the profilePhone
	 */
	public String getProfilePhone() {
		return profilePhone;
	}

	/**
	 * @return the profileEmail
	 */
	public String getProfileEmail() {
		return profileEmail;
	}

	/**
	 * @return the profileAddr
	 */
	public String getProfileAddr() {
		return profileAddr;
	}

	/**
	 * @return the profileHobby
	 */
	public String getProfileHobby() {
		return profileHobby;
	}

	/**
	 * @return the profileForte
	 */
	public String getProfileForte() {
		return profileForte;
	}

	/**
	 * @return the profileReligion
	 */
	public String getProfileReligion() {
		return profileReligion;
	}

	/**
	 * @return the profileVeterans
	 */
	public String getProfileVeterans() {
		return profileVeterans;
	}

	/**
	 * @return the profileMarriage
	 */
	public String getProfileMarriage() {
		return profileMarriage;
	}

	/**
	 * @return the profileDisability
	 */
	public String getProfileDisability() {
		return profileDisability;
	}

	/**
	 * @return the profileWebsite
	 */
	public String getProfileWebsite() {
		return profileWebsite;
	}

	/**
	 * @return the profileTwitter
	 */
	public String getProfileTwitter() {
		return profileTwitter;
	}

	/**
	 * @return the profileNaverBlog
	 */
	public String getProfileNaverBlog() {
		return profileNaverBlog;
	}

	/**
	 * @return the profileTistory
	 */
	public String getProfileTistory() {
		return profileTistory;
	}

	/**
	 * @return the profileInstagram
	 */
	public String getProfileInstagram() {
		return profileInstagram;
	}

	/**
	 * @return the profileFacebook
	 */
	public String getProfileFacebook() {
		return profileFacebook;
	}

	/**
	 * @return the profilePinterest
	 */
	public String getProfilePinterest() {
		return profilePinterest;
	}

	/**
	 * @return the profileTumblr
	 */
	public String getProfileTumblr() {
		return profileTumblr;
	}

	/**
	 * @return the profileRegDate
	 */
	public Timestamp getProfileRegDate() {
		return profileRegDate;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @param profileName the profileName to set
	 */
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	/**
	 * @param profileEname the profileEname to set
	 */
	public void setProfileEname(String profileEname) {
		this.profileEname = profileEname;
	}

	/**
	 * @param profileCname the profileCname to set
	 */
	public void setProfileCname(String profileCname) {
		this.profileCname = profileCname;
	}

	/**
	 * @param profileJuminFront the profileJuminFront to set
	 */
	public void setProfileJuminFront(String profileJuminFront) {
		this.profileJuminFront = profileJuminFront;
	}

	/**
	 * @param profileJuminBack the profileJuminBack to set
	 */
	public void setProfileJuminBack(String profileJuminBack) {
		this.profileJuminBack = profileJuminBack;
	}

	/**
	 * @param profilePhone the profilePhone to set
	 */
	public void setProfilePhone(String profilePhone) {
		this.profilePhone = profilePhone;
	}

	/**
	 * @param profileEmail the profileEmail to set
	 */
	public void setProfileEmail(String profileEmail) {
		this.profileEmail = profileEmail;
	}

	/**
	 * @param profileAddr the profileAddr to set
	 */
	public void setProfileAddr(String profileAddr) {
		this.profileAddr = profileAddr;
	}

	/**
	 * @param profileHobby the profileHobby to set
	 */
	public void setProfileHobby(String profileHobby) {
		this.profileHobby = profileHobby;
	}

	/**
	 * @param profileForte the profileForte to set
	 */
	public void setProfileForte(String profileForte) {
		this.profileForte = profileForte;
	}

	/**
	 * @param profileReligion the profileReligion to set
	 */
	public void setProfileReligion(String profileReligion) {
		this.profileReligion = profileReligion;
	}

	/**
	 * @param profileVeterans the profileVeterans to set
	 */
	public void setProfileVeterans(String profileVeterans) {
		this.profileVeterans = profileVeterans;
	}

	/**
	 * @param profileMarriage the profileMarriage to set
	 */
	public void setProfileMarriage(String profileMarriage) {
		this.profileMarriage = profileMarriage;
	}

	/**
	 * @param profileDisability the profileDisability to set
	 */
	public void setProfileDisability(String profileDisability) {
		this.profileDisability = profileDisability;
	}

	/**
	 * @param profileWebsite the profileWebsite to set
	 */
	public void setProfileWebsite(String profileWebsite) {
		this.profileWebsite = profileWebsite;
	}

	/**
	 * @param profileTwitter the profileTwitter to set
	 */
	public void setProfileTwitter(String profileTwitter) {
		this.profileTwitter = profileTwitter;
	}

	/**
	 * @param profileNaverBlog the profileNaverBlog to set
	 */
	public void setProfileNaverBlog(String profileNaverBlog) {
		this.profileNaverBlog = profileNaverBlog;
	}

	/**
	 * @param profileTistory the profileTistory to set
	 */
	public void setProfileTistory(String profileTistory) {
		this.profileTistory = profileTistory;
	}

	/**
	 * @param profileInstagram the profileInstagram to set
	 */
	public void setProfileInstagram(String profileInstagram) {
		this.profileInstagram = profileInstagram;
	}

	/**
	 * @param profileFacebook the profileFacebook to set
	 */
	public void setProfileFacebook(String profileFacebook) {
		this.profileFacebook = profileFacebook;
	}

	/**
	 * @param profilePinterest the profilePinterest to set
	 */
	public void setProfilePinterest(String profilePinterest) {
		this.profilePinterest = profilePinterest;
	}

	/**
	 * @param profileTumblr the profileTumblr to set
	 */
	public void setProfileTumblr(String profileTumblr) {
		this.profileTumblr = profileTumblr;
	}

	/**
	 * @param profileRegDate the profileRegDate to set
	 */
	public void setProfileRegDate(Timestamp profileRegDate) {
		this.profileRegDate = profileRegDate;
	}

	/**
	 * @return the profileYoutube
	 */
	public String getProfileYoutube() {
		return profileYoutube;
	}

	/**
	 * @param profileYoutube the profileYoutube to set
	 */
	public void setProfileYoutube(String profileYoutube) {
		this.profileYoutube = profileYoutube;
	}
	
}
