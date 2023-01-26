Feature: scenario_test
  @data_table_test
  Scenario Outline : TC01_datayi_test_et
    Given kullanici aplication sayfasindadir
    And kullanici new buttona tiklar
    And kullanic tum alanlari girer
    When kullanici firstname "<firstname>" girer
    When kullanici lastname "<lastname>" girer
    When kullanici position "<position>" girer
    When kullanici office "<office>" girer
    When kullanici extension "<extension>" girer
    When kullanici startdate "<startdate>" girer
    When kullanıcı salary "<salary>" girer
    And create buttuna tikla
    And kullanici firstname "<firstname>" arayacak
    Then cikan listede firstname "<firstname>" oldugunu verify et

    Examples:
      | firstname | lastname | position | office | extension | startdate  | salary |
      | John      | Walker   | teacher  | NYC    | 123       | 2023-05-10 | 90000  |
      | Adam      | Brown    | QA       | TX     | 234       | 2023-05-10 | 100000 |
      | Sue       | Jackson  | Manager  | LONDON | 345       | 2023-05-10 | 120000 |
      | Sam       | Walker   | teacher  | NYC    | 123       | 2023-05-10 | 90000  |
      | Vince     | Brown    | QA       | TX     | 234       | 2023-05-10 | 100000 |
      | Ali       | Jackson  | Manager  | LONDON | 345       | 2023-05-10 | 120000 |

  @excel_data_tables
  Scenario: tabloyu excel kullanarak olusturma
    Given kullanici datatables sayfasindadir
    And kullanici tum zorunlu alanlari "data_tables_sheet" alarak girer