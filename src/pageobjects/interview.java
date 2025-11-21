package pageobjects;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import com.provar.core.model.base.java.WebComponent;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="interview"                                
               , summary=""
               , connection="Admin"
               , flowName="flowruntime__interview"
               , namespacePrefix=""
     )             
public class interview {

	@FindBy(xpath = ".//flowruntime-flow-screen-input[@name='property_name']")
	@WebComponentMapping(componentId = "27e2a2bd-5b1b-4a24-95c7-a251f75df8a3")
	public WebComponent Property_Name;
	@FindBy(xpath = ".//flowruntime-flow-screen-input[@name='property_price']")
	@WebComponentMapping(componentId = "3892be5c-da69-4ea0-9176-480da719087c")
	public WebComponent Price;
	@FindBy(xpath = ".//lightning-lookup[@fieldName='Broker__c']")
	@WebComponentMapping(componentId = "ca4ddc61-46c4-4d3e-beef-ab457702cf30")
	public WebComponent Broker_field;
	@FindBy(xpath = ".//lightning-button[@label='Next']")
	@WebComponentMapping(componentId = "5c6b2d69-4033-48fd-9f45-8a0f567a8251")
	public WebComponent Next_button;
	@FindBy(xpath = ".//flowruntime-address[@addressLabel='Address']")
	@WebComponentMapping(componentId = "3e508a3b-af3f-4057-97eb-914bb76f5a45")
	public WebComponent Address_Input;
	@FindBy(xpath = ".//flowruntime-flow-screen-input[@name='number_of_beds']")
	@WebComponentMapping(componentId = "4bf24c6d-3f90-4334-bea9-75091b98a6d9")
	public WebComponent Number_of_Bedrooms;
	@FindBy(xpath = ".//flowruntime-flow-screen-input[@name='number_of_baths']")
	@WebComponentMapping(componentId = "4bf24c6d-3f90-4334-bea9-75091b98a6d9")
	public WebComponent Number_of_Bathrooms;
	@FindBy(xpath = ".//lightning-file-upload[@name='FileUpload_1']")
	@WebComponentMapping(componentId = "a935ef86-3a1d-4150-9db4-70ec711e2c43")
	public WebComponent Upload_Picture;
	
}
