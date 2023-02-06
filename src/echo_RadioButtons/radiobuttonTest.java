package echo_RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class radiobuttonTest extends BaseTest {


	@Test
	public void echoradiobuttonTest() throws InterruptedException
	{
		for(int i=1;i<=2;i++)
		{

			By radiobuttonLocator=By.name("group"+i);
			List<WebElement>radiobutton=driver.findElements(radiobuttonLocator);
			int groupradiobutton=radiobutton.size();
			System.out.println(groupradiobutton);

			for(int groupindex=0;groupindex<groupradiobutton;groupindex++)
			{
				radiobutton.get(groupindex).click();

				

				for(int statusindex=0;statusindex<groupradiobutton;statusindex++)
				{
					System.out.println(radiobutton.get(statusindex).getAttribute("value")+" "+radiobutton.get(statusindex).getAttribute("checked"));
				}
				System.out.println();
				Thread.sleep(5000);
			}

		}
	}

}


