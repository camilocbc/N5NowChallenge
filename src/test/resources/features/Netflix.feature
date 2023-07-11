# language: es
  @Regresion
 Característica: Pagina Web Netflix

    En este documento se encuentran los escenarios automatizados de la pagina web de Netflix

  @test-1
    Escenario: Verificar navegación y maximización de pantalla en Netflix
        Dado que estoy en la página principal de Netflix
        Cuando maximizo la pantalla
        Entonces debería ver el título de la página
        Y debería ver la URL actual

  @test-2
    Esquema del escenario: : Verificar Inicio de Sesion Fallido - correo y clave invalido
        Dado que estoy en la página principal de Netflix
        Cuando maximizo la pantalla
        Y Doy click en Iniciar Sesion
        Y Digito Email o Telefono <EmailoTelefono>
        Y Digito Clave <Clave>
        Y Doy click en Iniciar Sesion Usuario
        Entonces Valido mensaje de Error "No podemos encontrar una cuenta con esta dirección de email. Reinténtalo o crea una cuenta nueva."

      Ejemplos:

          |EmailoTelefono   | Clave       |
          |"correo@test.com"|  "12345"    |
          |"3124123123"     | "ABCS12345" |

  @test-3
    Escenario: Verificar Inicio de Sesion Fallido - sin correo
          Dado que estoy en la página principal de Netflix
          Cuando maximizo la pantalla
          Y Doy click en Iniciar Sesion
          Y Digito Email o Telefono ""
          Y Digito Clave "PASSWORD"
          Entonces Valido mensaje de correo o telefono "Ingresa un email o un número de teléfono válido."


  @test-4
    Escenario: Verificar Inicio de Sesion Fallido - sin clave
          Dado que estoy en la página principal de Netflix
          Cuando maximizo la pantalla
          Y Doy click en Iniciar Sesion
          Y Digito Email o Telefono "correodeprueba@gmail.com"
          Y Digito Clave ""
          Y Doy click en Iniciar Sesion Usuario
          Entonces Valido mensaje de clave "La contraseña debe tener entre 4 y 60 caracteres."

  @test-5
    Escenario: Verificar Inicio de Sesion Fallido - correo invalido
          Dado que estoy en la página principal de Netflix
          Cuando maximizo la pantalla
          Y Doy click en Iniciar Sesion
          Y Digito Email o Telefono "asda"
          Y Digito Clave "PASSWORD"
          Entonces Valido mensaje de correo o telefono "Escribe un email válido."

   @test-6
   Escenario: Verificar Inicio de Sesion Fallido - telefono invalido
         Dado que estoy en la página principal de Netflix
         Cuando maximizo la pantalla
         Y Doy click en Iniciar Sesion
         Y Digito Email o Telefono "1"
         Y Digito Clave "PASSWORD"
         Entonces Valido mensaje de correo o telefono "Ingresa un número de teléfono válido."



