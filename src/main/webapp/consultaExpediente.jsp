<%-- 
    Document   : consultaExpediente
    Created on : 3/04/2022, 10:14:54 PM
    Author     : l3tal
--%>

<%@page import="dominio.Habitante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Habitante habitante = new Habitante();

    Habitante habitanteAux = (Habitante) session.getAttribute("habitante");
    System.out.println("jsp: ");
    System.out.println(habitanteAux);
    if (habitanteAux != null) {
        habitante = habitanteAux;
    }

%>
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

                    <%out.print("<label>Nombre: "
                                + habitanteAux.getNombre()
                                + "</label><br/><br/>");%>


                    <%out.print("<label>Edad: "
                                + habitanteAux.getEdad()
                                + "</label><br/><br/>");%>

                    <%out.print("<label>Direccion: "
                                + habitanteAux.getDireccion()
                                + "</label><br/><br/>");%>

                        <%out.print("<label>NSS: "
                                    + habitanteAux.getNumSeguroSocial()
                                    + "</label><br/><br/>");%>

                        <%out.print("<label>CURP: "
                                    + habitanteAux.getCurp()
                                    + "</label><br/><br/>");%>
                                    
                        <%out.print("<label>Sexo: "
                                    + habitanteAux.getSexo()
                                    + "</label><br/><br/>");%>
                                    
                        <%out.print("<label>Fecha de nacimiento: "
                                    + habitanteAux.getFechaNacimiento()
                                    + "</label><br/><br/>");%>
                                    
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
                            <td>Dra. Juan</td>
                            <td>Hospital Sonora</td>
                        </tr>
                        <tr>
                            <td>04/04/2022</td>
                            <td>Dr. Martinez</td>
                            <td>Hospital San Jose</td>
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
