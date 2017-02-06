package controller;

import javax.swing.JOptionPane;

import constants.Hospital;
import domain.DoctorBean;
import domain.MemberBean;
import domain.NurseBean;
import enums.AdminButt;
import service.AdminService;
import serviceImpl.AdminServiceImpl;

public class AdminController {
   
   public void start() {

      MemberBean member = null;
      DoctorBean doctor = null;
      NurseBean nurse = null;
      AdminService service = new AdminServiceImpl();
      AdminButt[] buttons = {AdminButt.EXIT,AdminButt.DOC_ADD,AdminButt.DOC_FIND_BY_ID
                        ,AdminButt.DOC_LIST,AdminButt.DOC_UPDATE
                        ,AdminButt.DOC_DELETE,AdminButt.NUR_ADD
                        ,AdminButt.NUR_FIND_BY_ID
                        ,AdminButt.NUR_FIND_BY_NAME,AdminButt.NUR_LIST
                        ,AdminButt.NUR_UPDATE
                        ,AdminButt.NUR_DELETE};
      AdminButt select = (AdminButt)JOptionPane.showInputDialog(
            null,
            "CONTROLLER PAGE",
            "SELECT CONTROLLER MENU",
            JOptionPane.QUESTION_MESSAGE,
            null,
            buttons,
            buttons[1]
            );
      while(true){
         switch(select){
         case EXIT:JOptionPane.showConfirmDialog(null, "EXIT?");
            return;
         case DOC_ADD:
               member = new DoctorBean();
               String[] tempArr = JOptionPane.showInputDialog("1.ID 2.이름").split(",");
               member.setUid(tempArr[0]);
               member.setName(tempArr[1]);
               service.regist(member);
            break;
         case DOC_FIND_BY_ID:
        	 	
            break;
         case DOC_LIST:
            break;
         case DOC_UPDATE:
            break;
         case DOC_DELETE:
            break;
         case NUR_ADD:
            break;
         case NUR_FIND_BY_ID:
            break;
         case NUR_FIND_BY_NAME:
            break;
         case NUR_LIST:
            break;
         }
      }
   }
}