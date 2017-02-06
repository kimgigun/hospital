package domain;

public class AdminBean extends MemberBean{
		private String permission;	//yes

		public void setPermission(String permission){
			this.permission=permission;
		}
		public String getPermission(){
			return permission;
		}
		@Override
		public String toString() {
		return String.format("%s(%s)","");
		}
}
