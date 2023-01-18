@manager_login_test
Feature: Login_manager_kullanici_bilgileriyle_deneme

  Scenario Outline:
    Given kullanici application sayfasindadir
    And kullanici manager id "<kullaniciadi>" girer
    And kullanici manager sifre "<kullanicisifre>" girer
    Then kullanici login buttonuna click eder
    Then kullanici "<default_page>" oldugunu very eder
    Then kullanici application kapatir

    Examples: Test Data
      | kullaniciadi | kullanicisifre | default_page |
      | manager      | Manager1!      | default_page |
      | manager7     | Manager7!      | default_page |
      | manager12    | Manager12!     | default_page |

  @admin_login_test
  Scenario Outline: Login_admin_kullanici_bilgileriyle_deneme

    Given kullanici application sayfasindadir
    And kullanici admin id "<adminadi>" girer
    And kullanici admin sifre "<adminsifre>" girer
    When kullanici login button'una click eder
#    Then default page'in displayed oldugunu verify eder
    Then kullanici application kapatir

    Examples: Admin Test Data
      | adminadi | adminsifre | default_page     |
      | admin22  | Admin123!  | Hotel Management |






