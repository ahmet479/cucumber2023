@google_search
Feature: Google_Search_Functionality

 Scenario: TC01_iPhone_search
   Given kullanici google sayfasindadir
   And kullanici iPhone'u arar
   Then kullanici sonuclarda iPhone oldugunu verify eder
   Then kullanici application kapatir

#Feature: Google_caydanlik_Functionality
#  Scenario: TC01_iPhone_search
#    Given kullanici google sayfasindadir
#    And kullanici iPhone'u arar
#    Then kullanici sonuclarda caydanlik oldugunu verify eder
#    Then kullanici application kapatir
#
#
#Feature: Google_cicek_Functionality
#  Scenario: TC01_iPhone_search
#    Given kullanici google sayfasindadir
#    And kullanici iPhone'u arar
#    Then kullanici sonuclarda cicek oldugunu verify eder
#    Then kullanici application kapatir
#
#Feature: Google_volkswagen_Functionality
#  Scenario: TC01_iPhone_search
#    Given kullanici google sayfasindadir
#    And kullanici iPhone'u arar
#    Then kullanici sonuclarda volkswagen oldugunu verify eder
#    Then kullanici application kapatir