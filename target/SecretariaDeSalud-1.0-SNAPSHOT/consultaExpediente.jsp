<%-- 
    Document   : consultaExpediente
    Created on : 3/04/2022, 10:14:54 PM
    Author     : l3tal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <h1 id="titulo">Consultar expediente</h1>
        <div class="informaicon" id="divInfo">

            <div id="divIzquierda" class="caja1">
                <h3>Datos personales</h3>
                <div id="divDaosPersonales">
                    <p><label>Nombre: Carla Morrison</label>
                    <p><label>Edad: 22</label>
                    <p><label >Fecha nac; 04/20/1999</label>
                    <p><label>CURP: CMUP04201999ISRGZ</label>
                    <p><label>NSS: 51624522</label>
                    <p><label>Sexo: Mujer</label>
                </div>
                <h3>Consultas medicas</h3>
                <div>
                    <table id="tablaConsultas">
                        <tr>
                            <td>13/02/2022</td>
                            <td>Dr. Isaac Segoviano</td>
                            <td>Hospital Buenavista</td>
                        </tr>
                        <tr>
                            <td>02/04/2022</td>
                            <td>Dra. Mia</td>
                            <td>Hospital La Raza</td>
                        </tr>
                        <tr>
                            <td>04/04/2022</td>
                            <td>Dr. Alex Marin</td>
                            <td>Hospital Mamitas</td>
                        </tr>
                    </table>
                </div>
            </div>

            <div id="divDerecha" class="caja2">
                <h3>Cita medica</h3>
                <div>
                    
                </div>
            </div>

        </div>
    </body>
</html>
