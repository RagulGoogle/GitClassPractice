Feature: verifying adactin login page

  Scenario Outline: veify login details with valid data
    Given user is on the home page
    When user should enter "<username>","<password>"
    And user should click login botton
    Then user verify login success page
    When user should slelct the "<location>","<hotels>","<room_type>","<num_of_room>"
    And user should enter and select the "<check_in_date>","<check_out_date>""<adult_per_room>","<child_per_room>"
    And user should click the search botton
    When user enter select hotel page they should click radio botton
    And user should click continue botton
    When user should enter "<First_Name>","<Last_Name>","<Billing_Address>","<Credit_Card_NO>"
    And user should select the "<Credit_Card_Type>","<Expiey_month>","<Expiry_year>","<ccv_no>"
    And user should click book noe botton

    Examples: 
      | username   | password  | location | hotels      | room_type | num_of_room | check_in_date | check_out_date | adult_per_room | child_per_room | First_Name | Last_Name | Billing_Address             | Credit_Card_NO      | Credit_Card_Type | Expiey_month | Expiry_year | ccv_no |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07-11-2022    | 08-11-2022     | 1 - One        | 1 - One        | Sam        | A         | 1/108,thiru street, tanjore | 1234 4567 6789 1234 | VISA             | January      |        2020 |    477 |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07-11-2022    | 08-11-2022     | 1 - One        | 1 - One        | Sam        | A         | 1/108,thiru street, tanjore | 1234 4567 6789 1234 | VISA             | January      |        2020 |    477 |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07-11-2022    | 08-11-2022     | 1 - One        | 1 - One        | Sam        | A         | 1/108,thiru street, tanjore | 1234 4567 6789 1234 | VISA             | January      |        2020 |    477 |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07-11-2022    | 08-11-2022     | 1 - One        | 1 - One        | Sam        | A         | 1/108,thiru street, tanjore | 1234 4567 6789 1234 | VISA             | January      |        2020 |    477 |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07-11-2022    | 08-11-2022     | 1 - One        | 1 - One        | Sam        | A         | 1/108,thiru street, tanjore | 1234 4567 6789 1234 | VISA             | January      |        2020 |    477 |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07-11-2022    | 08-11-2022     | 1 - One        | 1 - One        | Sam        | A         | 1/108,thiru street, tanjore | 1234 4567 6789 1234 | VISA             | January      |        2020 |    477 |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07-11-2022    | 08-11-2022     | 1 - One        | 1 - One        | Sam        | A         | 1/108,thiru street, tanjore | 1234 4567 6789 1234 | VISA             | January      |        2020 |    477 |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07-11-2022    | 08-11-2022     | 1 - One        | 1 - One        | Sam        | A         | 1/108,thiru street, tanjore | 1234 4567 6789 1234 | VISA             | January      |        2020 |    477 |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07-11-2022    | 08-11-2022     | 1 - One        | 1 - One        | Sam        | A         | 1/108,thiru street, tanjore | 1234 4567 6789 1234 | VISA             | January      |        2020 |    477 |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07-11-2022    | 08-11-2022     | 1 - One        | 1 - One        | Sam        | A         | 1/108,thiru street, tanjore | 1234 4567 6789 1234 | VISA             | January      |        2020 |    477 |
