package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage
{

	WebDriver driver;
	
	public InventoryPage(WebDriver driver)//base class
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	
	@FindBy(xpath="//div//div[@class='inventory_item_name ']")
	List<WebElement> allProduct;
	
	@FindBy(id="add-to-cart")
	WebElement addtocartBtn;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartOption;
	
	//action Methods
	public int getTotalProductCount()
	{
		return allProduct.size();
		
	}
	
	public void getProductDeatils()
	{
		System.out.println("*******Product Details*********");
		for(WebElement i:allProduct)
		{
			System.out.println(i.getText());
		}
	}
	
	public void addProductToCart(String pname)
	{
		for(WebElement i:allProduct)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		addtocartBtn.click();
		
		System.out.println("Product added to cart: "+pname);
		
		
	}
	
	
	public CartPage openCartPage()
	{
		cartOption.click();
		return new CartPage();
	}
	
	
	
	
	
	
	
	
}
