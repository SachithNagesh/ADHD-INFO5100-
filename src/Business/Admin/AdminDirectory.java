/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Admin;

import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class AdminDirectory {
    
    private ArrayList<Admin> adminList;

    public AdminDirectory() {
        adminList = new ArrayList<>();
    }

    public ArrayList<Admin> getAdminList() {
        return adminList;
    }
    
    public Admin createAdmin(String name){
        Admin admin = new Admin();
        admin.setName(name);
        adminList.add(admin);
        return admin;
    }
}
