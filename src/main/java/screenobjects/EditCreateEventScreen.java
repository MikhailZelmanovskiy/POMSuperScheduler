package screenobjects;

import dto.Event;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EditCreateEventScreen extends BaseScreen{
    public EditCreateEventScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/info_title_input']")
    MobileElement title;
    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/info_type_input']")
    MobileElement type;
    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/info_break_plus_btn']")
    MobileElement breakPlusBtn;
    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/info_wage_edit']")
    MobileElement wageEdit;
    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/info_wage_input']")
    MobileElement wageInput;
    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/info_wage_save']")
    MobileElement wageSave;
    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/info_save_btn']")
    MobileElement confirmCreation;

    public EditCreateEventScreen fillCreationForm(Event event){
        type(title, event.getTitle());
        type(type, event.getType());
        hideKeyboard();
        int breaks = event.getBreaks();
        while (breaks>0) {
            breakPlusBtn.click();
            breaks-=1;
        }
        wageEdit.click();
        type(wageInput, String.valueOf(event.getAmmount()));
        hideKeyboard();
        wageSave.click();
        return this;
    }

    public HomeScreen confirmCreation(){
        confirmCreation.click();
        return new HomeScreen(driver);
    }
}
