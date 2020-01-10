#Author: Melissa Pineda
#Keywords Summary :
@feature
Feature: Compra en wong
 
  		YO como usuario de wong
  		QUIERO agregar un producto a mi carrito de comprar
  		PARA realizar la compra de mis productos favoritos

  Scenario: Compra de galletas oreo
    Given Estoy en la pagina
    When Busco el producto "Galletas Oreo"
    Then Aparecera en pantalla el producto "Galletas Oren"
    And Agrega el producto a mi carro de compras
    Then En el carro de compra aprece el producto 
