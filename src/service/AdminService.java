package service;
import domain.MemberBean;
import domain.PatientsBean;
import domain.DoctorBean;
import domain.NurseBean;
public interface AdminService {
	
	public  String getBmi(PatientsBean pat);
	public void regist(MemberBean member);   //adminService가 resist한다 MemerBean member를 주+동사+목적어
	//create
	public MemberBean findById(MemberBean member);
	//read
	public MemberBean[] findByName(MemberBean member);
	/*public int countByName(String name);*/
	public DoctorBean[] list();
	public NurseBean[] nureselist();
	public int count();
	public void change(MemberBean member);
	public void remove(MemberBean member);
	//util
	//validation
	public boolean exist(MemberBean member);
	public int countByName(MemberBean member);
}
