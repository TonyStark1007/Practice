package scripts;

import org.testng.annotations.Test;

import generic.baseclass;
import pompages.Addtocartpage;
import pompages.DemoSkillraryLoginPage;
import pompages.SkillraryLoginPage;

public class Addtocart extends baseclass {

	@Test 
	public void addproduct() {

		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.Skillrarydemoappbutton();

		utilies.switchTab(driver);
		DemoSkillraryLoginPage d=new DemoSkillraryLoginPage(driver);
		utilies.mouseHover(driver, d.getCoursebtn());
		d.SeleniumTrainingBtn();
		
		Addtocartpage  a=new  Addtocartpage (driver);
		utilies.doubleClick(driver, a.getAddbtn());
		a.addtocartButton();
		utilies.alertpopup(driver);

	}
}