package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <img src=\"Crab.jpg\">\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            {background-size : 100%}\n");
      out.write("        </style> \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>D.I.N Solutions</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body dir=\"ltr\">\n");
      out.write("        <h3 style=\"color:#ff1a1a; font-family:sans-serif\" align=\"center\"><u>Sign up form</u></h3><br><br>\n");
      out.write("        <form name=\"form\" action=\" \" method=\"get\" onsubmit=\"return checkForm()\" >\n");
      out.write("            <div>\n");
      out.write("                <table dir=\"ltr\" align=\"center\" border=\"0\" >\n");
      out.write("                    <tr>\n");
      out.write("                        <td><font size=\"3\" color=\"#004b7a\" face=\"cursive\">Full Name:</font></td>\n");
      out.write("                        <td><input type=\"text\" name=\"idNum\" maxlength=\"9\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><font size=\"3\" color=\"#004b7a\"face=\"cursive\">Username:</font></td>\n");
      out.write("                        <td><input type=\"text\" name=\"userName\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><font size=\"3\" color=\"#004b7a\"face=\"cursive\">Password:</font></td>\n");
      out.write("                        <td><input type=\"password\" name=\"pwd\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><font size=\"3\" color=\"#004b7a\"face=\"cursive\">Confirm:</font></td>\n");
      out.write("                        <td><input type=\"password\" name=\"pwdConfirm\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><font size=\"3\" color=\"#004b7a\"face=\"cursive\">Mail:</font></td>\n");
      out.write("                        <td><input type=\"text\" name=\"email\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><font size=\"3\" color=\"#004b7a\"face=\"cursive\">Phone:</font></td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"phoneNum\" maxlength=\"7\">\n");
      out.write("                            <font size=\"3\" color=\"#004b7a\"face=\"cursive\">Area Code:</font>\n");
      out.write("                            <select name=\"kidomet\">\n");
      out.write("                                <option value=\"Choose\">Choose</option>\n");
      out.write("                                <option value=\"+41\">+41</option>\n");
      out.write("                                <option value=\"+42\">+42</option>\n");
      out.write("                                <option value=\"+43\">+43</option>\n");
      out.write("                                <option value=\"+44\">+44</option>\n");
      out.write("                                <option value=\"+45\">+45</option>\n");
      out.write("                                <option value=\"+46\">+46</option>\n");
      out.write("                                <option value=\"+972\">+972</option>\n");
      out.write("                                <option value=\"+994\">+994</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><font size=\"3\"  color=\"#004b7a\"face=\"cursive\">Country</font></td>\n");
      out.write("                        <td><select name=\"country\">\n");
      out.write("                                <option value=\"Choose a country\">--Choose a Country--</option>\n");
      out.write("                                <option value=\"Switzerland\">Switzerland</option>\n");
      out.write("                                <option value=\"Czech Republic\">Czech Republic</option>\n");
      out.write("                                <option value=\"Austria\">Austria</option>\n");
      out.write("                                <option value=\"United Kingdom\">United Kingdom</option>\n");
      out.write("                                <option value=\"Denmark\">Denmark</option>\n");
      out.write("                                <option value=\"Israel\">Israel</option>\n");
      out.write("                                <option value=\"Sweden\">Sweden</option>\n");
      out.write("                                <option value=\"Other\">Other</option>\n");
      out.write("                            </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><font size=\"3\" color=\"#004b7a\"face=\"cursive\">Gender:</font></td>\n");
      out.write("                        <td><font size=\"3\" color=\"#004b7a\"face=\"cursive\">Male</font>\n");
      out.write("                            <input type=\"radio\" name=\"gender\" value=\"Male\" >&nbsp&nbsp&nbsp\n");
      out.write("                            <font size=\"3\" color=\"#004b7a\"face=\"cursive\">Female</font>\n");
      out.write("                            <input type=\"radio\" name=\"gender\" value=\"Female\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><font size=\"3\" color=\"#004b7a\"face=\"cursive\">Terms Of Use:</font></td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"checkbox\" name=\"cbterms\" value=\"terms\" />\n");
      out.write("                            <font size=\"3\" color=\"#004b7a\"></font>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><font size=\"3\" color=\"#004b7a\"face=\"cursive\">Notes:</font></td>\n");
      out.write("                        <td><textarea cols=\"30\" rows=\"5\"\n");
      out.write("                                      name=\"special\">Please type anything you want to add</textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr ><td> <br><br></td></tr>\n");
      out.write("                    <tr><td><input type=\"submit\" value=\"Send\"  /></td>\n");
      out.write("                        <td><input type=\"reset\" value=\"Clear\"/></td></tr>\n");
      out.write("                </table>\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    function validletter(word) {\n");
      out.write("                        for (var i = 0; i < word.length; i++)\n");
      out.write("                            if (!((word.charAt(i) >= 'a') && (word.charAt(i) <= 'z')) ||\n");
      out.write("                                    (word.charAt(i) >= 'A') && (word.charAt(i) <= 'Z'))\n");
      out.write("                                return false;\n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("                    function isEmpty(str)\n");
      out.write("                    {\n");
      out.write("\n");
      out.write("                        if (str.length == 0)\n");
      out.write("                            return true;\n");
      out.write("                        else\n");
      out.write("                            return false;\n");
      out.write("                    }\n");
      out.write("                    function isNumeric(str)\n");
      out.write("                    {\n");
      out.write("                        if (isNaN(str))\n");
      out.write("                            return false;\n");
      out.write("\n");
      out.write("                        else\n");
      out.write("                            return true;\n");
      out.write("                    }\n");
      out.write("                    function genderCheck()\n");
      out.write("                    {\n");
      out.write("                        for (var i = 0; i < document.form.gender.length; i++)\n");
      out.write("                            if (document.form.gender[i].checked == true)\n");
      out.write("                                return true;\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    function phoneCheck()\n");
      out.write("                    {\n");
      out.write("                        var kidomt;\n");
      out.write("                        kidomt = document.form.kidomet.selectedIndex;\n");
      out.write("                        if (kidomt == 0)\n");
      out.write("                            return false;\n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    function countryCheck()\n");
      out.write("                    {\n");
      out.write("                        var place;\n");
      out.write("                        place = document.form.country.selectedIndex;\n");
      out.write("                        if (place == 0)\n");
      out.write("                            return false;\n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("                    function tou() {\n");
      out.write("                        if (document.form.cbterms.checked == true)\n");
      out.write("                            return true;\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    function checkForm()\n");
      out.write("                    {\n");
      out.write("\n");
      out.write("                        if (isEmpty(document.form.idNum.value) || (document.form.idNum.value.length < 1))\n");
      out.write("                        {\n");
      out.write("                            window.alert(\"Please enter your name\");\n");
      out.write("                            document.form.idNum.focus();\n");
      out.write("                            document.form.idNum.select();\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        if (isEmpty(document.form.userName.value))\n");
      out.write("                        {\n");
      out.write("                            window.alert(\"Please enter your username\");\n");
      out.write("                            document.form.userName.focus();\n");
      out.write("                            document.form.userName.select();\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                        if (isEmpty(document.form.pwd.value) ||\n");
      out.write("                                (document.form.pwd.length < 4))\n");
      out.write("                        {\n");
      out.write("                            window.alert(\"Enter a password with at least 4 characters\");\n");
      out.write("                            document.form.pwd.focus();\n");
      out.write("                            document.form.pwd.select();\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                        var pass1 = document.form.pwd.value;\n");
      out.write("                        var pass2 = document.form.pwdConfirm.value;\n");
      out.write("                        if (pass1 != pass2 || isEmpty(pass1) || isEmpty(pass2)) {\n");
      out.write("                            window.alert(\"Both Passwords should match\");\n");
      out.write("                            document.form.pwdConfirm.focus();\n");
      out.write("                            document.form.pwdConfirm.select();\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                        if (!isNumeric(document.form.phoneNum.value) ||\n");
      out.write("                                isEmpty(document.form.phoneNum.value))\n");
      out.write("                        {\n");
      out.write("                            window.alert(\"Please enter a valid phone number\");\n");
      out.write("                            document.form.phoneNum.focus();\n");
      out.write("                            document.form.phoneNum.select();\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        if (document.form.phoneNum.value.length != 7)\n");
      out.write("                        {\n");
      out.write("                            window.alert(\"Phone number should be 7 letters numbers\");\n");
      out.write("                            document.form.phoneNum.focus();\n");
      out.write("                            document.form.phoneNum.select();\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                        if (!phoneCheck()) {\n");
      out.write("                            window.alert(\"Choose a telephone numbering plan\");\n");
      out.write("                            document.form.kidomt.focus();\n");
      out.write("                            document.form.kidomt.select();\n");
      out.write("                        }\n");
      out.write("                        if (!countryCheck()) {\n");
      out.write("                            window.alert(\"Choose a country\");\n");
      out.write("                            document.form.country.focus();\n");
      out.write("                            document.form.country.select();\n");
      out.write("                        }\n");
      out.write("                        if (!genderCheck()) {\n");
      out.write("                            window.alert(\"Choose a gender\");\n");
      out.write("                            document.form.gender.focus();\n");
      out.write("                            document.form.gender.select();\n");
      out.write("                        }\n");
      out.write("                        if (!tou()) {\n");
      out.write("                            window.alert(\"Please agree to our terms\");\n");
      out.write("                            document.form.cbterms.focus();\n");
      out.write("                            document.form.cbterms.select();\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
