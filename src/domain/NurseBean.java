package domain;

public class NurseBean extends MemberBean {
	private String nurPosition, majorJob, profile;

	@Override
  public String toString() {
  	return String.format("간호사ID:%s\n"
  			+ "담당진료과목:%s\n"
  			+ "성명 %s\n"
  			+ "성별 %s\n"
  			+ "전화번호 %s\n"
  			+ "이메일 %s\n"
  			+ "직급 %s\n",uid,majorJob,name,phone,email,nurPosition);}

	public void setNurPosition(String nurPosition) {
		this.nurPosition = nurPosition;
	}

	public String getNurPosition() {
		return nurPosition;
	}

	public void setMajorJob(String majorJob) {
		this.majorJob = majorJob;
	}

	public String getMajorJob() {
		return majorJob;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getProfile() {
		return profile;
	}

}