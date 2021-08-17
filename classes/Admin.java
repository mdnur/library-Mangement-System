package classes;

import abstructs.UserAbstract;

public class Admin extends UserAbstract {

    public Admin(){
        super();
    }
    
    public Admin(String username,String password){
        super(username,password);
    }
}
