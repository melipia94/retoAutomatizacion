#Author: Melissa Pineda
#Keywords Summary :
@feature
Feature: Compra en wong
 
  		YO como usuario de wong
  		QUIERO agregar un producto a mi carrito de comprar
  		PARA realizar la compra de mis productos favoritos

  Scenario: Recargas - Validaci�n valores preestablecidos
    Given Estoy en la pagina
    And Doy clic en "Agregar Mini Chocotonne"
    And Ingreso "pruebas@gmail.com" en el campo "Mail para compra"
    When Doy clic en "Recojo en tienda"
    And Doy clic en "Wong Asia"
    And Doy clic en "Recojo aqu�"
    Then Aparecera en pantalla el car ""
