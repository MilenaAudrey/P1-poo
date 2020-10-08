<%-- 
    Document   : disciplina
    Created on : 8 de out de 2020, 02:05:48
    Author     : milen
--%>
<%@page import="Classe.Disciplina" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disciplina</title>
    </head>
    <% if (request.getParameter("salvar")!= null){
        int nota= Integer.parseInt (request.getParameter("nota"));
        Disciplina disciplina2 = Disciplina.getDisciplina();
        disciplina2.setNota(nota);
    }
    %>
    <body>
         <%@include file = "WEB-INF/jspf/menu.jspf" %>
        <h1>Disciplina FATEC</h1>
        <hr/>
        <table border="3">
            </hr>
            <tr>
            <th>Nome</th>
            <th>Ementa</th>
            <th>Ciclo</th>
            <th>Nota</th>
            <th>Alterar</th>
            </tr>
            <tr>
                <% for(int i = 0; i< Disciplina.getDisciplina().size(); i++){
                    Disciplina disciplina2= (Disciplina)Disciplina.getDisciplina().get(i);
                }
                %>
                <td><%=disciplina2.getNome()%></td>
                <td><%=disciplina2.getEmenta()%></td>
                <td><%=disciplina2.getCiclo()%></td>
                <td><%=disciplina2.getNota()%></td>
            </tr>
            <td>
                <form method="get">
                    <input type="text" name="nota" value="0"/>
                    <input type="submit"  value="salvar"/>
                    <input type="hedden" value="salvar" value="1"/>
                    
                </form>
            </td>
        </table>
    </body>
</html>
