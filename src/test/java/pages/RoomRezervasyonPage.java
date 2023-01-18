package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomRezervasyonPage {
    public RoomRezervasyonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addRoomReservationButton;

    @FindBy(xpath = "IDUser")
    public WebElement idUser;

    @FindBy(xpath = "IDHotelRoom")
    public WebElement idHotelRoom;

    @FindBy(xpath = "Price")
    public WebElement price;

    @FindBy(xpath = "DateStart")
    public WebElement dateStart;

    @FindBy(xpath = "DateEnd")
    public WebElement dateEnd;

    @FindBy(xpath = "AdultAmount")
    public WebElement adultAmount;

    @FindBy(xpath = "ChildrenAmount")
    public WebElement childrenAmount;

    @FindBy(xpath = "ContactNameSurname")
    public WebElement contactNameSurname;

    @FindBy(xpath = "ContactPhone")
    public WebElement contactPhone;

    @FindBy(xpath = "ContactEmail")
    public WebElement contactEmail;

    @FindBy(xpath = "Notes")
    public WebElement notes;

    @FindBy(xpath = "Approved")
    public WebElement approved;

    @FindBy(xpath = "IsPaid")
    public WebElement isPaid;

    @FindBy(xpath = "btnSubmit")
    public WebElement save;

    @FindBy(xpath ="//div[@class='bootbox-body']")
    public WebElement message;

    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement ok;


}
