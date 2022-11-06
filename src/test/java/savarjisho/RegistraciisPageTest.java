package savarjisho;

import CromeRunerr.Chrome;
import SteepObject.RegSteep;
import org.testng.annotations.Test;

import static DataObject.RegData.*;

public class RegistraciisPageTest extends Chrome {
    @Test
    public void asd(){
        RegSteep reg1 = new RegSteep();
        reg1.GoToRegPage()
                .namevalue(txt1);
    }
}


