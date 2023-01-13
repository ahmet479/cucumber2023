@manager_login_test
Feature: Login_manager_kullanici_bilgileriyle_deneme
  Scenario Outline:
    Given kullanici application sayfasindadir
    And kullanici manager "<kullaniciadi>" girer
    And kullanici manager "<kullanicisifre>" girer
    Then kullanici login buttonuna click eder
    Then kullanici "<default_page>" oldugunu very eder
    Then kullanici application kapatir
    Examples: Test Data
      | kullaniciadi | kullanicisifre | default_page |
      | manager      | Manager1!      | default_page |
      | manager7     | Manager7!      | default_page |
      | manager12    | Manager12!     | default_page |









  public LoginPage(){
  PageFactory.initElements(Driver.getDriver(),this);
  }

    @FindBy(id="UserName")
  Click to expand inline (19 lines)




  Arcanedata Aykut
  10:51 AM
  public DefaultPage(){
  PageFactory.initElements(Driver.getDriver(),this);
  }

    @FindBy(xpath = "//span[contains(@class, 'username')]")
  public WebElement userId;

    @FindBy(partialLinkText = "Hotel Management")
  public WebElement hotelManagementLink;

    @FindBy(partialLinkText = "Room reservations")
  public WebElement roomReservationsLink;
  }