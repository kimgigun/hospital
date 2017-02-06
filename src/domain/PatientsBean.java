package domain;

public class PatientsBean extends MemberBean {
	private String height,weight/*,nureId,docId,patId*/;
	
      public void setHeight(String height){
    	  this.height=height;
      }
      public String getHeight(){
    	  return height;
      }
      public void setWeight(String weight){
    	  this.weight=weight;
      }
      public String getWeight(){
    	  return weight;
      }
      
      @Override
      public String toString() {
      	return String.format(
      			"환자:%s\n 님의 진료가 접수되었습니다."
      		,name);
      } 
   
}