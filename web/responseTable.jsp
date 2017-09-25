<%--
  Created by IntelliJ IDEA.
  User: slavik
  Date: 25.09.17
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>servlet</title>
</head>
<body>

<tr>
    <td></td>
    <td width="30"></td>
    <td style="background-color: white;z-index: 9; box-shadow: 0 3px 7px 0 rgba(0, 0, 0, 0.35);">
        <table class="result" align="center" style="width: 600px; height: 100px " border="1px">
            <tr>
                <td><%=request.getAttribute("x")%>
                </td>
                <td><%=request.getAttribute("y")%>
                </td>
                <td><%=request.getAttribute("zoom")%>
                </td>
                <td><%=request.getAttribute("inBatman")%>
                </td>
                <td><%=request.getAttribute("currTime")%>
                </td>
                <td><%=request.getAttribute("time")%>
                </td>
            </tr>
        </table>
    </td>
</tr>
</body>
</html>
