package githubdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase1 
{

	public static void main(String[] args)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		driver.findElement(By.id("btnSave")).click();
		String empno=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empno);
		
		driver.findElement(By.id("searchBtn")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("resultTable"))));
		
		List<WebElement>rows,cols;
		WebElement restable=driver.findElement(By.id("resultTable")) ;
		rows=restable.findElements(By.tagName("tr"));
		cols=rows.get(1).findElements(By.tagName("td"));
		if(cols.get(1).getText().equals(empno))
		{
			return true;
			
		}else
		{
			return false;
		}

	}

}
