package week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement findElement =
		 driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		 findElement.sendKeys("bags");
		 Thread.sleep(2000);
		 findElement.sendKeys(Keys.ENTER);

		 driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
	       Thread.sleep(2000);
		 String itemsFound =
		 driver.findElement(By.xpath("//div[@class='length']")).getText();
		 System.out.println("Total no of Items = " + itemsFound);
		 Thread.sleep(3000);
		System.out.println("list of brands");
		List<WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Size : " + brandList.size());
		Set<String> setOfBags = new LinkedHashSet<String>();
		for (WebElement eachElement : brandList) {
			String text = eachElement.getText();

			setOfBags.add(text);
		}
		System.out.println(setOfBags);

		System.out.println("list of bag names");
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='name']"));
		System.out.println("Size : " + bagNames.size());
		Set<String> nameOfBags = new LinkedHashSet<String>();
		for (WebElement eachElement1 : bagNames) {
			String text1 = eachElement1.getText();

			nameOfBags.add(text1);
		}
		System.out.println(nameOfBags);

	}

}
