Feature: US001_Amazon_Sayfasinda_Urun_Aratma
  #Classlarimizda kullandigimiz @Before gibi burda da her scenario'dan once Background: yapisi calisir
  Background: Kullanici_Amazon_Sayfasina_Gider
    Given kullanici_amazon_sayfasina_gider

    Scenario: TC-01 amazon_sayfasinda_selenium_aratma
      Then arama_kutusunda_Selenium_aratir


      Scenario: TC-02 anmazon sayfasinda java aratir
        Then arama_kutusunda_Java_aratir

        Scenario: TC-03 arama kusutsnda sql aratır
          Then arama_kutusunda_sql_aratir

