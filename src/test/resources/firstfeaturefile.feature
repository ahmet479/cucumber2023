
@google_search
Feature: Google_Search_Functionality

  Background: application_sayfasina_git
    Given kullanici google sayfasindadir

    @smoke
  Scenario: TC01_iPhone_search
    And kullanici iPhone'u arar
    Then kullanici sonuclarda iPhone oldugunu verify eder
    Then kullanici application kapatir

      @regression
  Scenario: TC02_caydanlik_search
    And kullanici caydanlik'i arar
    Then kullanici sonuclarda caydanlik oldugunu verify eder
    Then kullanici application kapatir

  @smoke @bmw @tesla
  Scenario: TC02_cicek_search
    And kullanici cicek'i arar
    Then kullanici sonuclarda cicek oldugunu verify eder
    Then kullanici application kapatir

    @kahve @smoke
  Scenario: TC02_volkswagen_search
    And kullanici volkswagen'i arar
    Then kullanici sonuclarda volkswagen oldugunu verify eder
    Then kullanici application kapatir