package SteepObject;

import PageObject.RegPage;

public class RegSteep extends RegPage {

    public RegSteep GoToRegPage (){
        reg.click();
        return this;
    }


    public RegSteep namevalue (String name){
        saxeli.setValue(name);
        return this;
    }


}
