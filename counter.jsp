<% @page counterType = "text/html;charset=utf-8" %>
<jsp:useBean id="cnt" scope="request" class="bean.CounterBean" />
<html>
  <head>
    <title>カウンター</title>
  </head>
  <body>
    <h2><jsp:getProrerty name="cnt" property="count" />回目のアクセスです</h2>
  </body>
</html>