<%-- 
    Document   : newjsp
    Created on : Aug 3, 2016, 7:51:18 AM
    Author     : Rabiul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-md-9 left_con">
<div class="row principal_msg">
<div class="col-md-12">
<div class="panel panel-primary">
<div class="panel-heading" style="font-weight: bold; font-size: 18px;">Online Admission</div>
<div class="panel-body">
<div class="row">
<div class="col-xs-12">
<ul class="nav nav-pills nav-justified thumbnail">
<li class="disabled">
<a href="#">
<h4 class="list-group-item-heading">H.S.C Online Admission</h4>
</a>
</li>
</ul>
</div>
</div>
<br>
<div class="well col-lg-3">
<select id="class_id" class="text col-lg-12" name="class_id">
<option value="">Group Select</option>
<option value="C-00001">HSC -Science</option>
<option value="C-00002">HSC-Humanities</option>
<option value="C-00003">HSC-Business Studies</option>
<option value="C-00043">HSC -Science -English</option>
<option value="C-00044">HSC-Humanities-English</option>
<option value="C-00045">HSC-Business Studies-English</option>
</select>
</div>
<div class="well col-lg-3">
<select id="board_id" class="text col-lg-12" name="board_id">
<option value="">Board Select</option>
<option value="Dhaka">Dhaka</option>
<option value="Barisal">Barisal</option>
<option value="Chittagong">Chittagong</option>
<option value="Comilla">Comilla</option>
<option value="Dinajpur">Dinajpur</option>
<option value="Jessore">Jessore</option>
<option value="Rajshahi">Rajshahi</option>
<option value="Sylhet">Sylhet</option>
<option value="Madrasa">Madrasa</option>
<option value="BTEB">BTEB</option>
<option value="BOU">BOU</option>
<option value="DIBS(Dhaka)">DIBS(Dhaka)</option>
</select>
</div>
<div class="well col-lg-3">
<input id="registration_number" class="text col-lg-12" type="text" placeholder="SSC/Admission Roll Number" name="registration_number">
</div>
<div class="well col-lg-3">
<input id="transaction_id" class="text col-lg-12" type="text" placeholder="Transaction ID" name="transaction_id">
</div>
<div class="well col-lg-6">
<table width="100%">
<tbody>
<tr>
<td width="50%">
<img alt="CAPTCHA code" src="/captcha/simple-php-captcha.php?_CAPTCHA&t=0.50330900+1470188495">
</td>
<td width="50%">
<input id="hidden_captcha" type="hidden" value="J9cWF" name="hidden_captcha">
<input id="captcha_text" class="text col-lg-6" type="text" placeholder="" name="captcha_text">
</td>
</tr>
</tbody>
</table>
</div>
<div class="well col-lg-6">
<input class="btn-primary" type="button" onclick="check_student_registration_number()" value="Verify">
</div>
<br>
<div id="check_div" class="well col-lg-12"> </div>
<div class="well col-lg-12" style="text-align: center">
<img src="images/admission_process.jpg">
</div>
</div>
</div>
    </body>
</html>
