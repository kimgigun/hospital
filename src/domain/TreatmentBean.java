package domain;

public abstract class TreatmentBean{
	protected String treatId,docId,patId,TerateDate,TreateContents;
	
	public void setTreatId(String treatId){
		this.treatId=treatId;
	}
	public String getTreatId(){
		return treatId;
	}
	public void setDocId(String docId){
		this.docId=docId;
	}
	public String getDocId(){
		return docId;
	}
	public void setPatId(String patId){
		this.patId=patId;
	}
	public String getPatId(){
		return patId;
	}
	


	
}
