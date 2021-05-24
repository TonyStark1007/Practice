package pompages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Addtocartpage  {
	@FindBy(id ="add")
	private WebElement addbtn;

	@FindBy(xpath="//button[text()=\" Add to Cart\"]")
	private WebElement addtocart;

	public Addtocartpage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}


	public void addtocartButton() {
		addtocart.click();
	}

	public WebElement getAddbtn() {
		return addbtn;
	}




}