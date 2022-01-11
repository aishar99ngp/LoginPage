package com.example.id;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> logininfo = new HashMap<String, String>();
    public IDandPasswords(){
        logininfo.put("Creative", "girl");
        logininfo.put("mad", "password");
        logininfo.put("Siss","abcd1");
    }
    public HashMap getLoginInfo(){
        return logininfo;
    }
}
