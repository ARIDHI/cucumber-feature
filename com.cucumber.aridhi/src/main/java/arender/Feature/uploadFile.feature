#Author: aridhihichem.a@gmail.com
#Sample Feature Definition Template



Feature: Rise a file from a directory 

  Scenario: Upload File form dir
    Given I already on arender home page
    When  I click on documentManagerButton
    And   I click on fileUploadButton 
    Then  I sendKey with <file.dir>
    And   Wait file to load


  Scenario: Check the file image & thumber are displayed
    Given I already on uploaded file
    When  I getElements svg container
    And   I getElements thumber 
    Then  I find src element thumber are displayed
    
    

    