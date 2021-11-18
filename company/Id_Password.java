package com.company;

import java.util.HashMap;

public class Id_Password {
    HashMap<String,String> LoginInfo = new HashMap<String,String>();

    Id_Password(){
        LoginInfo.put("zidan","logan");
        LoginInfo.put("pc","ziontika1029");
    }
    protected HashMap getLoginInfo(){
        return LoginInfo;
    }
}
