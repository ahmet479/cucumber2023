package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.Select;
import pages.DefaultPage;
import pages.LoginPage;
import pages.RoomRezervasyonPage;

import java.util.List;

public class Day17_C7_Room_Rezervasyon_Step_Definitions {

    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();
    RoomRezervasyonPage roomRezervasyonPage = new RoomRezervasyonPage();

    @Given("kullanici manager kullanici bilgilerini girer")
    public void kullanici_manager_kullanici_bilgilerini_girer(DataTable kullaniciBilgileri) {
       List<String> menajerKullaniciBilgileri = kullaniciBilgileri.row(1);
        System.out.println(menajerKullaniciBilgileri);
        System.out.println(menajerKullaniciBilgileri.get(0));
        System.out.println(menajerKullaniciBilgileri.get(1));

        loginPage.username.sendKeys(menajerKullaniciBilgileri.get(0));
        loginPage.password.sendKeys(menajerKullaniciBilgileri.get(1));

    }
    @Given("kullanıcı oda rezervasyon sayfasını yönlendirilir")
    public void kullanıcı_oda_rezervasyon_sayfasını_yönlendirilir() {
       defaultPage.hotelManagementLink.click();
       defaultPage.roomReservationsLink.click();
       roomRezervasyonPage.addRoomReservationButton.click();
    }
    @Given("kullanıcı tüm zorunlu alanları girer")
    public void kullanıcı_tüm_zorunlu_alanları_girer(DataTable RoomData) throws InterruptedException {
        List<String>testData = RoomData.row(1);
        System.out.println(testData);  //[manager, Harrison, 700, 01/19/2023, 01/25/2023, 2, 4, test, 8502852565, test@mail.com, bu datatable ile ilk test]

        Thread.sleep(3000);
        //idUser bir drodown
        Select selectIdUser = new Select(roomRezervasyonPage.idUser);
        selectIdUser.selectByVisibleText(testData.get(0));

        Thread.sleep(3000);
        //idHotel bir drodown
        Select selectIdHotel = new Select(roomRezervasyonPage.idHotelRoom);
        selectIdHotel.selectByVisibleText(testData.get(1));

        roomRezervasyonPage.price.sendKeys(testData.get(2));

        roomRezervasyonPage.dateStart.sendKeys(testData.get(3));

        roomRezervasyonPage.dateEnd.sendKeys(testData.get(4));

        roomRezervasyonPage.adultAmount.sendKeys(testData.get(5));

        roomRezervasyonPage.childrenAmount.sendKeys(testData.get(6));

        roomRezervasyonPage.contactNameSurname.sendKeys(testData.get(7));

        roomRezervasyonPage.contactPhone.sendKeys(testData.get(8));

        roomRezervasyonPage.contactEmail.sendKeys(testData.get(9));

        roomRezervasyonPage.notes.sendKeys(testData.get(10));



    }

}